package controller;

import DAO.DepositoDAO;
import java.sql.SQLException;

/**
 * Classe responsável por controlar as operações de depósito.
 * Esta classe atua como o controlador que coordena as interações entre o 
 * modelo de depósito (DepositoDAO) e a visão correspondente. Ela lida com a 
 * lógica de depósitos e consulta de saldo.
 * 
 * @author Camila Reis
 * RA 222220378
 */ 


public class DepositoController {
    
    private DepositoDAO depositoDAO;
    private String nome;
    private double valor;

    public DepositoController(String nome, double valor) {
        this.nome = nome;
        this.valor = 0;
        this.depositoDAO = new DepositoDAO();
    }
    
    public DepositoController( ) {
         this.depositoDAO = new DepositoDAO();
    }
    
    
    //Realiza o depósito de um valor na conta do usuário.
    public void depositar(String nome, double valor) throws SQLException {
        
        try {
            
            depositoDAO.depositar(nome, valor);
            
        } catch (SQLException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
            throw e;
        }
    }

    
   //Obtém o saldo em reais da conta do usuário.
   public double getSaldoReais(String nome) throws SQLException {
        try {
            return depositoDAO.getSaldoReais(nome);
        } catch (SQLException e) {
            System.out.println("Erro ao obter saldo: " + e.getMessage());
            throw e;
        }
    }

   
   //Getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    
}

