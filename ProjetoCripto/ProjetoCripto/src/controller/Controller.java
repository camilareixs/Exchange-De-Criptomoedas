/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.janelaLogin;
import view.janelaSenhaSaldo;

/**
 *
 * @author user
 */
public class Controller {
    private janelaLogin login;
    private janelaSenhaSaldo saldo;
    private String cpf;
    private int senha;

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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

  public boolean verificarSenha(int senha) {
    return this.senha == senha;
}  
    
    
    
    
}
