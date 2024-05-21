package controller;

import DAO.DepositoDAO;
import java.sql.SQLException;




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
    
    public String getNome() {
        return this.nome;
    }

    public void depositar(String nome, double valor) throws SQLException {
        try {
            depositoDAO.depositar(nome, valor);
        } catch (SQLException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
            throw e;
        }
    }

   public double getSaldoReais(String nome) throws SQLException {
        try {
            return depositoDAO.getSaldoReais(nome);
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

