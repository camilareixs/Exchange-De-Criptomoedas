package controller;

import model.Cotacao;
import view.janelaCotacao;

/**
 * Classe responsável por controlar a exibição e atualização das cotações.
 * Esta classe atua como o controlador que coordena as interações entre o modelo
 * de cotação (Cotacao) e a visão (janelaCotacao). Ela lida com a lógica de 
 * inicialização e atualização das cotações de criptomoedas.
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class CotacaoController {
    
    private Cotacao modelo; // Representa as cotações das criptomoedas
    private janelaCotacao visao; //Exibe as cotacoes ao usuario
    
    public CotacaoController(Cotacao modelo, janelaCotacao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }
    
    //Este método exibe as cotações atuais das criptomoedas na visão.
    public void iniciar() {
        visao.exibirCotacoes(modelo.getValorBitcoin(), modelo.getValorEthereum()
                                                     , modelo.getValorRipple());
    }
    
    
    //Método para atualizar as cotações das criptomoedas.
    public void atualizarCotacoes() {
        modelo.atualizarCotacoes();
        visao.exibirCotacoes(modelo.getValorBitcoin(), modelo.getValorEthereum()
                                                     , modelo.getValorRipple());
    }
}
