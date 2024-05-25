/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import DAO.ComprarDAO;
import DAO.VenderDAO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import view.janelaComprar;
import view.janelaDeposito;
import view.janelaLogin;
import view.janelaSenhaSaldo;
import view.janelaVender;


/**
 *
 * @author user
 */

//ARRUMAR PARA MVC 

public class Controller {
      
    private janelaLogin login;
    private janelaSenhaSaldo saldo;
    private String nome;
    private String cpf;
    private String senha;
    private double saldoReais;
    private double saldoBitcoin;
    private double saldoEthereum;
    private double saldoRipple;
    private janelaDeposito deposito;
    private janelaComprar comprar;
    private Controller control;
    private ComprarDAO dao;
    private janelaVender vender;
    private VenderDAO vao;

    
    
    public Controller(String nome, String cpf) {
        this.dao = new ComprarDAO(this);
        this.vao = new VenderDAO(this);
        this.nome = nome;
        this.cpf = cpf;
        this.deposito = new janelaDeposito(nome);
        this.vender = new janelaVender(this);
        this.comprar = new janelaComprar(this);
    }
     

    public boolean senhaCorreta(String senha, Controller control) {
        
    try {
        
        Connection conn = DriverManager.getConnection
        ("jdbc:postgresql://localhost:5432/Pessoas",
            "postgres", "fei");
     
        PreparedStatement pstmt = conn.prepareStatement
        ("SELECT senha FROM cadastro WHERE nome = ?");

       
        pstmt.setString(1, control.getNome());

   
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String senhaCorreta = rs.getString("senha");
            return senha.equals(senhaCorreta);
        }
    } catch (SQLException e) {
    }
    return false;
}
    
  
    

    public janelaComprar getComprar() {
        return comprar;
    }

    public void setComprar(janelaComprar comprar) {
        this.comprar = comprar;
    }
    
    
      

    public Controller getControl() {
        return control;
    }

    public void setControl(Controller control) {
        this.control = control;
    }

    public janelaLogin getLogin() {
        return login;
    }

    public void setLogin(janelaLogin login) {
        this.login = login;
    }

    public janelaSenhaSaldo getSaldo() {
        return saldo;
    }

    public void setSaldo(janelaSenhaSaldo saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldoReais() {
        return saldoReais;
    }

    public void setSaldoReais(double saldoReais) {
        this.saldoReais = saldoReais;
    }

    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public void setSaldoBitcoin(double saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public double getSaldoEthereum() {
        return saldoEthereum;
    }

    public void setSaldoEthereum(double saldoEthereum) {
        this.saldoEthereum = saldoEthereum;
    }

    public double getSaldoRipple() {
        return saldoRipple;
    }

    public void setSaldoRipple(double saldoRipple) {
        this.saldoRipple = saldoRipple;
    }

    public janelaDeposito getDeposito() {
        return deposito;
    }

    public void setDeposito(janelaDeposito deposito) {
        this.deposito = deposito;
    }
    
    
    
    
    
    
    
}
