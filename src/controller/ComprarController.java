/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.ComprarDAO;
import model.Cotacao;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class ComprarController {

    private ComprarDAO dao;
    private Cotacao modelo;
    private ComprarController comp;

    public ComprarController(ComprarDAO dao, Cotacao modelo) {
        this.modelo = modelo;
        this.dao = new ComprarDAO();
    }

    public double calcularValorFinal(String tipo, double valorInserido) {
        double valor = 0;
        double taxa = 0;

        switch (tipo) {
            case "Bitcoin":
                valor = modelo.getValorBitcoin();
                taxa = 0.02; // 2% de taxa
                break;
            case "Ethereum":
                valor = modelo.getValorEthereum();
                taxa = 0.01; // 1% de taxa
                break;
            case "Ripple":
                valor = modelo.getValorRipple();
                taxa = 0.01; // 1% de taxa
                break;
        }

        return (valor * valorInserido) * (1 + taxa);
    }

    
}

