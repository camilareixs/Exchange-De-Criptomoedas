package view;

import controller.CotacaoController;
import model.Cotacao;
import controller.Controller;


/**
 * Nesse janela é feita a geração de números aleatórios 
 * Nessa janela o usario pode conferir a cotação atual de cada moeda
 * @author user
 */


public class janelaCotacao extends javax.swing.JFrame {
    
    private Cotacao modelo;
    private Controller control;

    public janelaCotacao(Cotacao modelo) {
        this.modelo = modelo;
        initComponents();
        txtBit.setEditable(false);
        txtEthe.setEditable(false);
        txtRip.setEditable(false);
        exibirCotacoes(modelo.getValorBitcoin(), modelo.getValorEthereum(),
                                                  modelo.getValorRipple());
        modelo = new Cotacao();
        CotacaoController controller = new CotacaoController(modelo, this);
        controller.iniciar();
    }

    //Exibe as cotações
    public void exibirCotacoes(double valorBitcoin, double valorEthereum, 
                                                    double valorRipple) {
        txtBit.setText("R$" + String.format("%.2f", modelo.getValorBitcoin()));
        txtEthe.setText("R$" + String.format("%.2f", modelo.getValorEthereum()));
        txtRip.setText("R$" + String.format("%.2f", modelo.getValorRipple()));
        
    }
    
    private void atualizarCotacoes() {
        modelo.atualizarCotacoes();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSairCotacao = new javax.swing.JButton();
        lblTituloCotacao = new javax.swing.JLabel();
        lblBit = new javax.swing.JLabel();
        txtBit = new javax.swing.JTextField();
        lblEthe = new javax.swing.JLabel();
        txtEthe = new javax.swing.JTextField();
        lblRip = new javax.swing.JLabel();
        txtRip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        btSairCotacao.setBackground(new java.awt.Color(204, 102, 255));
        btSairCotacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairCotacao.setForeground(new java.awt.Color(255, 255, 255));
        btSairCotacao.setText("X");
        btSairCotacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairCotacaoMouseClicked(evt);
            }
        });
        btSairCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCotacaoActionPerformed(evt);
            }
        });

        lblTituloCotacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCotacao.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCotacao.setText("COTAÇÃO DE CRIPTOMOEDAS");

        lblBit.setForeground(new java.awt.Color(255, 255, 255));
        lblBit.setText("BITCOIN");

        lblEthe.setForeground(new java.awt.Color(255, 255, 255));
        lblEthe.setText("ETHEREUM");

        lblRip.setForeground(new java.awt.Color(255, 255, 255));
        lblRip.setText("RIPPLE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(lblTituloCotacao)
                .addGap(29, 29, 29)
                .addComponent(btSairCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRip, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRip)
                    .addComponent(txtEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEthe)
                    .addComponent(txtBit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btSairCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTituloCotacao)
                .addGap(41, 41, 41)
                .addComponent(lblBit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEthe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairCotacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairCotacaoMouseClicked

    }//GEN-LAST:event_btSairCotacaoMouseClicked

    private void btSairCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCotacaoActionPerformed
        janelaMenu menu = new janelaMenu(control);
        menu.setVisible(true);
    }//GEN-LAST:event_btSairCotacaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(janelaCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaCotacao().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairCotacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBit;
    private javax.swing.JLabel lblEthe;
    private javax.swing.JLabel lblRip;
    private javax.swing.JLabel lblTituloCotacao;
    private javax.swing.JTextField txtBit;
    private javax.swing.JTextField txtEthe;
    private javax.swing.JTextField txtRip;
    // End of variables declaration//GEN-END:variables
}
