package controller;

import DAO.DepositoDAO;
import java.sql.SQLException;

public class DepositoController {
    private DepositoDAO depositoDAO;
    private String cpf;

    public DepositoController(String cpf) {
        this.cpf = cpf;
        this.depositoDAO = new DepositoDAO();
    }
    
    public DepositoController( ) {
        
    }
    
    public String getCpf() {
    return this.cpf;
}

   public void depositar(String conta, double valor) throws SQLException {                                         
        this.depositoDAO.depositar(conta, valor); 
        try {
            depositoDAO.depositar(cpf, valor);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getSaldoReais() {
        try {
            return depositoDAO.getSaldoReais(cpf);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

   
}
