/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author user
 */
    
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepositoDAO {
    private final Conexao conexao;

    public DepositoDAO() {
        this.conexao = new Conexao();
    }

    public void depositar(String nome, double valor) throws SQLException {
        String sql = "UPDATE cadastro SET reais = reais + ? WHERE nome = ?";

        try (Connection conn = this.conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, valor);
            pstmt.setString(2, nome);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Deposito falhou, nenhuma linha afetada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar SQL para depositar: " + e.getMessage());
            throw e;
        }
    }

    public double getSaldoReais(String nome) throws SQLException {
        String sql = "SELECT reais FROM cadastro WHERE nome = ?";

        try (Connection conn = this.conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getDouble("reais");
            } else {
                throw new SQLException("Falha ao obter saldo, nenhum registro encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar SQL para obter saldo: " + e.getMessage());
            throw e;
        }
    }
}