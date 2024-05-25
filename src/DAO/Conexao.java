package DAO;

//Importações necessárias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer a conexão com o banco de dados.
 *
 * @author Camila Reis
 * RA 222220378
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        
        try { 
            
            return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Pessoas", "postgres", "fei");
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " 
                                                   + e.getMessage());
            throw e;
        }
    }
}
