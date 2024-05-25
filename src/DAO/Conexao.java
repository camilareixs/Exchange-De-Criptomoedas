/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        try { return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Pessoas", "postgres", "fei");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }
}
