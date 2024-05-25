package controller;
import DAO.SacarDAO;
import java.sql.SQLException;

/**
 * Classe responsável por controlar as operações de saque.
 * Esta classe atua como o controlador que coordena as interações entre o 
 * modelo de saque (SacarDAO) e a visão correspondente. Ela lida com a 
 * lógica de saques e consulta de saldo.
 * 
 * @author Camila Reis
 * RA 222220378
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
    
    
    //Metodo para realizar o saque
    public void sacar(String nome, double valor) throws SQLException {
        try {
            sacarDAO.sacar(nome, valor);
        } catch (SQLException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            throw e;
        }
    }

    
   //Metodo para pegar o saldo em reais
   public double getSaldoReais(String nome) throws SQLException {
       
        try {
            
            return sacarDAO.getSaldoReais(nome);
            
        } catch (SQLException e) {
            System.out.println("Erro ao obter saldo: " + e.getMessage());
            throw e;
        }
    }
   
   
   //Getters e setters
   public String getNome() {
        return this.nome;
    }
   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
    
    

