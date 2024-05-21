/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Random;
/**
 *
 * @author user
 */
public class Cotacao {
   
    private double valorBitcoin = 1746;
    private double valorEthereum = 3161;
    private double valorRipple = 62;
    
    public Cotacao() {
        atualizarCotacoes();
    }
    
    public void atualizarCotacoes() {
        
        Random random = new Random();
        
        // Gerar variações aleatórias entre -5% e +5%
        double variacaoBitcoin = (random.nextDouble() * 0.1) - 0.05;
        double variacaoEthereum = (random.nextDouble() * 0.1) - 0.05;
        double variacaoRipple = (random.nextDouble() * 0.1) - 0.05;
        
        // Aplicar as variações aos valores atuais
        valorBitcoin += valorBitcoin * variacaoBitcoin;
        valorEthereum += valorEthereum * variacaoEthereum;
        valorRipple += valorRipple * variacaoRipple;
    }
    
    // Getters para os valores das criptomoedas
    public double getValorBitcoin() {
        return valorBitcoin;
    }
    
    public double getValorEthereum() {
        return valorEthereum;
    }
    
    public double getValorRipple() {
        return valorRipple;
    }
}
