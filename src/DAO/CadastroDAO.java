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
import java.sql.SQLException;
import view.janelaCadastro;

public class CadastroDAO {
    private final Conexao conexao;

    public CadastroDAO() {
        this.conexao = new Conexao();
    }

    public void inserir(String nome, String cpf, String senha) throws SQLException {
    String sql = "INSERT INTO cadastro (nome, cpf, senha) VALUES (?, ?, ?)";

    try (Connection conn = this.conexao.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.setString(3, senha);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    
}
