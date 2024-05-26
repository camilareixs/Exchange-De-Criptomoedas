package view;

import DAO.ComprarDAO;
import controller.Controller;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import model.Cotacao;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 * Nessa janela o usuario realiza a compra de criptomoedas
 * É possivel vizualizar a cotação atual, escolher qual das tres criptomoedas
 * deseja comprar, calcular o valor de acordo com a quantidade escolhida 
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaComprar extends javax.swing.JFrame {

    public janelaComprar(Controller control) {
        modelo = new Cotacao(); 
        this.control = control;
        this.dao = new ComprarDAO(control);
        this.nome = control.getNome();
        initComponents();
        exibirValores();
        botoes();
    }
    
    //Exibe as cotações
    public void exibirValores(){
        
     String valores = "Bitcoin: R$ " + String.format("%.2f", 
                                    modelo.getValorBitcoin()) + "\n"
                       + "Ethereum: R$ " + String.format("%.2f", 
                                    modelo.getValorEthereum()) + "\n"
                       + "Ripple: R$ " + String.format("%.2f", 
                                    modelo.getValorRipple());
        txtAreaCotacao.setText(valores);
        
    }
    
       
       //Metodo para selecionar um botao por vez
       public void botoes(){
            
       btBit.addItemListener(new ItemListener() {
           
        @Override
        
        public void itemStateChanged(ItemEvent e) {
            
            if (e.getStateChange() == ItemEvent.SELECTED) {
                btEthe.setSelected(false);
                btRip.setSelected(false);
                exibirCotacaoComTaxa("Bitcoin");
                
            }
        }
        });

        btEthe.addItemListener(new ItemListener() {
            
        @Override
        
        public void itemStateChanged(ItemEvent e) {
            
            if (e.getStateChange() == ItemEvent.SELECTED) {
                btBit.setSelected(false);
                btRip.setSelected(false);
                exibirCotacaoComTaxa("Ethereum");
                
            }
        }
         });

    btRip.addItemListener(new ItemListener() {
        
        @Override
        
        public void itemStateChanged(ItemEvent e) {
            
            if (e.getStateChange() == ItemEvent.SELECTED) {
                btBit.setSelected(false);
                btEthe.setSelected(false);
                exibirCotacaoComTaxa("Ripple");
                
            }
        }
        });
       }
        
       //Exibe o valor da cotação mais a taxa de compra
        private void exibirCotacaoComTaxa(String tipo) {
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

        double valorComTaxa = valor * (1 + taxa);
        String resultado = String.format("%s: R$%.2f"
                , tipo, valorComTaxa, taxa * 100);
        txtConfiraValor.setText(resultado);
        
    }
         
        
    //Calcula o valor final junto com a taxa, a quantidade e a cotação
    private void calcularValorFinal() {
        
        String tipo = "";

        if (btBit.isSelected()) {
            tipo = "Bitcoin";
        } else if (btEthe.isSelected()) {
            tipo = "Ethereum";
        } else if (btRip.isSelected()) {
            tipo = "Ripple";
        }

        if (!tipo.isEmpty()) {
            double valorInserido = Double.parseDouble(txtQnt.getText());
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

            double valorFinal = (valor * valorInserido) * (1 + taxa);
            txtConfiraValor.setText(String.format("%.2f", + valorFinal));
            
        } else {
            txtConfiraValor.setText("Selecione uma moeda antes de calcular.");

        }
    }     
    
     //Metodo para fazer a conexao com o bd para salvar os valores
     private void realizarCompra() throws SQLException {
         
        String tipo = "";

        if (btBit.isSelected()) {
            tipo = "Bitcoin";
        } else if (btEthe.isSelected()) {
            tipo = "Ethereum";
        } else if (btRip.isSelected()) {
            tipo = "Ripple";
        }

        if (!tipo.isEmpty()) {
            
            try {
                
                String valorStr = 
                    txtConfiraValor.getText().replace("R$", "").replace(",", ".");
                double valorFinal = Double.parseDouble(valorStr);

                dao.comprar(tipo, valorFinal); 

                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato de valor inválido."
                        + "Use o formato correto, por exemplo: R$100,00", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar compra: " 
                         + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma moeda antes de "
                             + "calcular.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloSacar = new javax.swing.JLabel();
        btSairSacar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCotacao = new javax.swing.JTextArea();
        lbltituloCotacao = new javax.swing.JLabel();
        lblTituloEscolha = new javax.swing.JLabel();
        txtTituloQnt = new javax.swing.JLabel();
        txtQnt = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lblTituloValor = new javax.swing.JLabel();
        txtConfiraValor = new javax.swing.JTextField();
        btComprar = new javax.swing.JButton();
        btBit = new javax.swing.JToggleButton();
        btEthe = new javax.swing.JToggleButton();
        btRip = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        lblTituloSacar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloSacar.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSacar.setText("COMPRAR CRIPTOMOEDAS");

        btSairSacar.setBackground(new java.awt.Color(102, 0, 102));
        btSairSacar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairSacar.setForeground(new java.awt.Color(255, 255, 255));
        btSairSacar.setText("X");
        btSairSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairSacarMouseClicked(evt);
            }
        });
        btSairSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairSacarActionPerformed(evt);
            }
        });

        txtAreaCotacao.setEditable(false);
        txtAreaCotacao.setColumns(20);
        txtAreaCotacao.setRows(5);
        jScrollPane1.setViewportView(txtAreaCotacao);

        lbltituloCotacao.setForeground(new java.awt.Color(255, 255, 255));
        lbltituloCotacao.setText("COTAÇÃO:");

        lblTituloEscolha.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEscolha.setText("ESCOLHA QUAL DESEJA COMPRAR:");

        txtTituloQnt.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloQnt.setText("INSIRA A QUANTIDADE (ex: 2)");

        btCalcular.setText("CALCULAR");
        btCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcularMouseClicked(evt);
            }
        });

        lblTituloValor.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloValor.setText("CONFIRA O VALOR (R$):");

        txtConfiraValor.setEditable(false);

        btComprar.setText("COMPRAR");
        btComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btComprarMouseClicked(evt);
            }
        });

        btBit.setText("Bitcoin");

        btEthe.setText("Ethereum");

        btRip.setText("Ripple");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltituloCotacao)
                            .addComponent(lblTituloEscolha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTituloQnt)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCalcular))
                                    .addComponent(lblTituloValor)
                                    .addComponent(txtConfiraValor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btBit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEthe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRip)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloSacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTituloSacar))
                    .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbltituloCotacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBit)
                    .addComponent(btEthe)
                    .addComponent(btRip))
                .addGap(32, 32, 32)
                .addComponent(txtTituloQnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTituloValor)
                .addGap(4, 4, 4)
                .addComponent(txtConfiraValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairSacarMouseClicked
        
    }//GEN-LAST:event_btSairSacarMouseClicked

    private void btSairSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSacarActionPerformed
         janelaMenu menu = new janelaMenu(control);
        menu.setVisible(true);
    }//GEN-LAST:event_btSairSacarActionPerformed

    private void btComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprarMouseClicked
       try {
            realizarCompra();
        } catch (SQLException ex) {
            ex.printStackTrace();
            txtConfiraValor.setText("Erro ao realizar a compra: " + ex.getMessage());
        }
    }//GEN-LAST:event_btComprarMouseClicked

    private void btCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcularMouseClicked
        calcularValorFinal();
    }//GEN-LAST:event_btCalcularMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(janelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaComprar().setVisible(true);
//            }
//        });
//    }
    
    private Controller control;
    private Cotacao modelo;
    private String nome;
    private ComprarDAO dao;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btBit;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btComprar;
    private javax.swing.JToggleButton btEthe;
    private javax.swing.JToggleButton btRip;
    private javax.swing.JButton btSairSacar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloEscolha;
    private javax.swing.JLabel lblTituloSacar;
    private javax.swing.JLabel lblTituloValor;
    private javax.swing.JLabel lbltituloCotacao;
    private javax.swing.JTextArea txtAreaCotacao;
    private javax.swing.JTextField txtConfiraValor;
    private javax.swing.JTextField txtQnt;
    private javax.swing.JLabel txtTituloQnt;
    // End of variables declaration//GEN-END:variables
}
