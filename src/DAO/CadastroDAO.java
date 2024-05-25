package DAO;

/**
 * Classe responsável por realizar operações de cadastro no banco de dados.
 * Ela permite inserir novos registros na tabela.
 * 
 * @author Camila Reis
 * RA 222220378
 */


// Importações necessárias para conexão bd
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CadastroDAO {
    
    private final Conexao conexao;
    
    //Inicializa o objeto de conexão
    public CadastroDAO() {
        this.conexao = new Conexao();
    }
    
    // Método para inserir um novo cadastro no banco de dados
    public void inserir(String nome, String cpf, String senha) 
                                        throws SQLException {
        
    String sql = "INSERT INTO cadastro (nome, cpf, senha) VALUES (?, ?, ?)";

    // Esse bloco garante que os recursos serão fechados automaticamente
    try (Connection conn = this.conexao.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        //parametros da consulta
        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.setString(3, senha);

        pstmt.executeUpdate();
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    
}
