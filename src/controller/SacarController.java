/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.SacarDAO;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class SacarController {
    
    private SacarDAO sacarDAO;
    private String nome;
    private double valor;

    public SacarController(String nome, double valor) {
        this.nome = nome;
        this.valor = 0;
        this.sacarDAO = new SacarDAO();
    }
    
    public SacarController( ) {
         this.sacarDAO = new SacarDAO();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void sacar(String nome, double valor) throws SQLException {
        try {
            sacarDAO.sacar(nome, valor);
        } catch (SQLException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            throw e;
        }
    }

   public double getSaldoReais(String nome) throws SQLException {
        try {
            return sacarDAO.getSaldoReais(nome);
        } catch (SQLException e) {
            System.out.println("Erro ao obter saldo: " + e.getMessage());
            throw e;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
    
    

