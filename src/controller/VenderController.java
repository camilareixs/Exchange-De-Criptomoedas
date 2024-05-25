package controller;
import DAO.VenderDAO;
import model.Cotacao;


/**
 * Classe responsável por controlar as operações de venda.
 * Esta classe atua como o controlador que coordena as interações entre o 
 * modelo de venda (VenderDAO) e a visão correspondente. Ela lida com a 
 * lógica de vendas de criptomoedas e cálculo de valores finais.
 *
 * @author Camila Reis
 * RA 222220378
 */


public class VenderController {

    private VenderDAO vao;
    private Cotacao modelo;
    private ComprarController comp;
    

    public VenderController(VenderDAO vao, Cotacao modelo) {
        this.modelo = modelo;
        this.vao = new VenderDAO();
    }

    public double calcularValorFinal(String tipo, double valorInserido) {
        double valor = 0;
        double taxa = 0;

        //Taxas de venda de acordo com a moeda escolhida
        switch (tipo) {
            case "Bitcoin":
                valor = modelo.getValorBitcoin();
                taxa = 0.03; // 3% de taxa
                break;
            case "Ethereum":
                valor = modelo.getValorEthereum();
                taxa = 0.02; // 2% de taxa
                break;
            case "Ripple":
                valor = modelo.getValorRipple();
                taxa = 0.01; // 1% de taxa
                break;
        }

        return (valor * valorInserido) * (1 + taxa);
    }

    
}


