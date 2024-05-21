/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cotacao;
import view.janelaCotacao;

/**
 *
 * @author user
 */
public class CotacaoController {
    
    private Cotacao modelo;
    private janelaCotacao visao;
    
    public CotacaoController(Cotacao modelo, janelaCotacao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }
    
    public void iniciar() {
        visao.exibirCotacoes(modelo.getValorBitcoin(), modelo.getValorEthereum(), modelo.getValorRipple());
    }
    
    public void atualizarCotacoes() {
        modelo.atualizarCotacoes();
        visao.exibirCotacoes(modelo.getValorBitcoin(), modelo.getValorEthereum(), modelo.getValorRipple());
    }
}
