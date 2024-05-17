/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.janelaLogin;
import view.janelaSenhaSaldo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author user
 */

//ARRUMAR PARA MVC 

public class Controller {
    private Controller control;
    private janelaLogin login;
    private janelaSenhaSaldo saldo;
    private String nome;
    private String cpf;
    private String senha;
    private double saldoReais;
    private double saldoBitcoin;
    private double saldoEthereum;
    private double saldoRipple;


    public Controller(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean senhaCorreta(String senha, Controller control) {
    try {
        // Obtenha uma conexão com o banco de dados
        Connection conn = DriverManager.getConnection
        ("jdbc:postgresql://localhost:5432/Pessoas",
            "postgres", "fei");
        // Crie um PreparedStatement para executar uma consulta SQL
        PreparedStatement pstmt = conn.prepareStatement
        ("SELECT senha FROM cadastro WHERE nome = ?");

        // Defina o parâmetro da consulta (o nome do usuário)
        pstmt.setString(1, control.getNome());

        // Execute a consulta
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String senhaCorreta = rs.getString("senha");
            return senha.equals(senhaCorreta);
        }
    } catch (SQLException e) {
    }
    return false;
}

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    
    
    
    
    
    public janelaSenhaSaldo getSaldo() {
        return saldo;
    }

    public void setSaldo(janelaSenhaSaldo saldo) {
        this.saldo = saldo;
    }

    
    public janelaLogin getLogin() {
        return login;
    }

    public void setLogin(janelaLogin login) {
        this.login = login;
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

    
}
