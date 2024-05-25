package model;
import java.util.Random; //Gerar numeros aleatórios


/**
 * Classe responsável por representar as cotações das criptomoedas.
 * Esta classe mantém os valores atuais das cotações de Bitcoin, Ethereum e Ripple.
 * Também fornece métodos para atualizar esses valores com variações aleatórias.
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class Cotacao {
   
    // Valores iniciais das criptomoedas
    private double valorBitcoin = 5746;
    private double valorEthereum = 3161;
    private double valorRipple = 62;
    
    public Cotacao() {
        atualizarCotacoes();
    }
    
    //Atualiza os valores das cotações com variações aleatórias.
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
