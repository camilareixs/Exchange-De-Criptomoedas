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

    public void depositar(String cpf, double valor) {
        
    String sql = "UPDATE cadastro SET saldoReais = saldoReais + ? WHERE cpf = ?";

    try (Connection conn = this.conexao.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setDouble(1, valor);
        pstmt.setString(2, cpf);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    public double getSaldoReais(String cpf) throws SQLException {
        String sql = "SELECT saldoReais FROM cadastro WHERE cpf = ?";

        try (Connection conn = this.conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cpf);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getDouble("saldoReais");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

    
    
    
}
