package DAO;

/**
 * Classe responsável por realizar operações de depósito e consulta de 
 * saldo no banco de dados.
 * Esta classe fornece métodos para depositar dinheiro na conta de um usuário e 
 * obter o saldo de reais da conta a partir do nome do usuário. 
 * 
 * @author Camila Reis
 * RA 222220378
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

     // Método para realizar um depósito na conta do usuário
    public void depositar(String nome, double valor) throws SQLException {
        
        String sql = "UPDATE cadastro SET reais = reais + ? WHERE nome = ?";

        try (Connection conn = this.conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, valor);
            pstmt.setString(2, nome);

            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows == 0) {
                
                throw new SQLException("Depósito falhou, nenhuma linha afetada.");
            }
            
            System.out.println("Depósito realizado com sucesso.");
            
        } catch (SQLException e) {
            System.out.println("Erro ao executar SQL para depositar: " 
                                                    + e.getMessage());
            throw e;
        }
    }
    
    // Método para obter o saldo de reais da conta do usuário
    public double getSaldoReais(String nome) throws SQLException {
        
        String sql = "SELECT reais FROM cadastro WHERE nome = ?";

        try (Connection conn = this.conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);

            ResultSet rs = pstmt.executeQuery();


            if (rs.next()) {
                
                return rs.getDouble("reais");
                
            } else {
                
                throw new SQLException("Falha ao obter saldo, nenhum registro "
                                                               + "encontrado.");
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao executar SQL para obter saldo: " 
                                                       + e.getMessage());
            throw e;
        }
    }
}