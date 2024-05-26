package view;

import controller.Controller;

/**
 * Nessa janela o usuario consegue vizualizar todas as suas informações
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaInfoSaldo extends javax.swing.JFrame {
    
    private Controller control;

    public janelaInfoSaldo(Controller control) {
        this.control = control;
        initComponents();
        atualizarInfo(); 
    }
    
    //vai atualizar as informações
    public void atualizarInfo() {
        
        txtNomeSaldo.setText("" + control.getNome());
        txtCpfSaldo.setText("" + control.getCpf());
        txtReaisSaldo.setText("" + control.getSaldoReais());
        txtBitcoinSaldo.setText("" + control.getSaldoBitcoin());
        txtEthereumSaldo.setText("" + control.getSaldoEthereum());
        txtRippleSaldo.setText("" + control.getSaldoRipple());
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloSaldoAuto = new javax.swing.JLabel();
        lblNomeSaldo = new javax.swing.JLabel();
        txtNomeSaldo = new javax.swing.JTextField();
        lblCpfSaldo = new javax.swing.JLabel();
        txtCpfSaldo = new javax.swing.JTextField();
        txtReaisSaldo = new javax.swing.JTextField();
        lblReaisSaldo = new javax.swing.JLabel();
        txtBitcoinSaldo = new javax.swing.JTextField();
        lblBitcoinSaldo = new javax.swing.JLabel();
        txtEthereumSaldo = new javax.swing.JTextField();
        lblEthereumSaldo = new javax.swing.JLabel();
        txtRippleSaldo = new javax.swing.JTextField();
        lblRippleSaldo = new javax.swing.JLabel();
        btSairSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblTituloSaldoAuto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloSaldoAuto.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSaldoAuto.setText("SEU SALDO ATUALIZADO");

        lblNomeSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeSaldo.setText("Nome:");

        txtNomeSaldo.setEditable(false);

        lblCpfSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCpfSaldo.setText("CPF:");

        txtCpfSaldo.setEditable(false);

        txtReaisSaldo.setEditable(false);
        txtReaisSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReaisSaldoActionPerformed(evt);
            }
        });

        lblReaisSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReaisSaldo.setText("Reais:");

        txtBitcoinSaldo.setEditable(false);

        lblBitcoinSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBitcoinSaldo.setText("Bitcoin:");

        txtEthereumSaldo.setEditable(false);

        lblEthereumSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEthereumSaldo.setText("Ethereum:");

        txtRippleSaldo.setEditable(false);

        lblRippleSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRippleSaldo.setText("Ripple:");

        btSairSaldo.setBackground(new java.awt.Color(102, 0, 102));
        btSairSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btSairSaldo.setText("X");
        btSairSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairSaldoMouseClicked(evt);
            }
        });
        btSairSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloSaldoAuto)
                .addGap(42, 42, 42)
                .addComponent(btSairSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeSaldo)
                        .addGap(40, 40, 40)
                        .addComponent(txtNomeSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblBitcoinSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBitcoinSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblReaisSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReaisSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCpfSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCpfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEthereumSaldo)
                                .addComponent(lblRippleSaldo))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRippleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEthereumSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTituloSaldoAuto))
                    .addComponent(btSairSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeSaldo)
                    .addComponent(txtNomeSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfSaldo)
                    .addComponent(txtCpfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReaisSaldo)
                    .addComponent(txtReaisSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBitcoinSaldo)
                    .addComponent(txtBitcoinSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEthereumSaldo)
                    .addComponent(txtEthereumSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRippleSaldo)
                    .addComponent(txtRippleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
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

    private void btSairSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSaldoActionPerformed
       
    }//GEN-LAST:event_btSairSaldoActionPerformed

    private void btSairSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairSaldoMouseClicked
        janelaMenu menu = new janelaMenu(control);
        menu.setVisible(true);
    }//GEN-LAST:event_btSairSaldoMouseClicked

    private void txtReaisSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReaisSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReaisSaldoActionPerformed

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
//            java.util.logging.Logger.getLogger(janelaInfoSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaInfoSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaInfoSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaInfoSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaInfoSaldo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBitcoinSaldo;
    private javax.swing.JLabel lblCpfSaldo;
    private javax.swing.JLabel lblEthereumSaldo;
    private javax.swing.JLabel lblNomeSaldo;
    private javax.swing.JLabel lblReaisSaldo;
    private javax.swing.JLabel lblRippleSaldo;
    private javax.swing.JLabel lblTituloSaldoAuto;
    private javax.swing.JTextField txtBitcoinSaldo;
    private javax.swing.JTextField txtCpfSaldo;
    private javax.swing.JTextField txtEthereumSaldo;
    private javax.swing.JTextField txtNomeSaldo;
    private javax.swing.JTextField txtReaisSaldo;
    private javax.swing.JTextField txtRippleSaldo;
    // End of variables declaration//GEN-END:variables
}
