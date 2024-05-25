package controller;
import DAO.ComprarDAO;
import model.Cotacao;

/**
 * Classe responsável por controlar as operações de compra de criptomoedas.
 * Esta classe fornece métodos para calcular o valor final de uma compra de
 * criptomoedas com base no tipo de criptomoeda, valor inserido e taxas
 * aplicáveis. 
 * 
 * @author Camila Reis
 * RA 222220378
 */

public class ComprarController {

    private ComprarDAO dao;
    private Cotacao modelo;
    private ComprarController comp;

    public ComprarController(ComprarDAO dao, Cotacao modelo) {
        this.modelo = modelo;
        this.dao = new ComprarDAO(); //Inicializa um novo objeto comprarDAO
    }

    
     // Método para calcular o valor final de uma compra de criptomoeda
    public double calcularValorFinal(String tipo, double valorInserido) {
        double valor = 0;
        double taxa = 0;
        
        // Determina o valor da criptomoeda e a taxa com base no tipo
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

        // Calcula e retorna o valor final da compra
        return (valor * valorInserido) * (1 + taxa);
    }

    
}

