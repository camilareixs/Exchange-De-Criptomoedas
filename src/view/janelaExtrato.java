package view;

import controller.Controller;

/**
 * Nessa janela é possivel vizualizar o extrato do usuario logado
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaExtrato extends javax.swing.JFrame {
    
    private Controller control;

    public janelaExtrato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloExtraAuto = new javax.swing.JLabel();
        btSairExtrato = new javax.swing.JButton();
        scpnAreaExtrato = new javax.swing.JScrollPane();
        txtAreaExtrato = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lblTituloExtraAuto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloExtraAuto.setText("SEU EXTRATO ATUALIZADO");

        btSairExtrato.setBackground(new java.awt.Color(255, 102, 0));
        btSairExtrato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairExtrato.setText("X");
        btSairExtrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairExtratoMouseClicked(evt);
            }
        });
        btSairExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairExtratoActionPerformed(evt);
            }
        });

        txtAreaExtrato.setColumns(20);
        txtAreaExtrato.setRows(5);
        scpnAreaExtrato.setViewportView(txtAreaExtrato);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloExtraAuto)
                .addGap(39, 39, 39)
                .addComponent(btSairExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(scpnAreaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloExtraAuto)
                .addGap(45, 45, 45)
                .addComponent(scpnAreaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btSairExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btSairExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairExtratoActionPerformed

    private void btSairExtratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairExtratoMouseClicked
        janelaMenu menu = new janelaMenu(control);

        menu.setVisible(true);
    }//GEN-LAST:event_btSairExtratoMouseClicked

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
//            java.util.logging.Logger.getLogger(janelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaExtrato().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairExtrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTituloExtraAuto;
    private javax.swing.JScrollPane scpnAreaExtrato;
    private javax.swing.JTextArea txtAreaExtrato;
    // End of variables declaration//GEN-END:variables
}
