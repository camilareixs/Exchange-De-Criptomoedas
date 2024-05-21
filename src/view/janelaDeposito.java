/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DepositoController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.SQLException;



/**
 *
 * @author user
 */
public class janelaDeposito extends javax.swing.JFrame {
    
   private DepositoController control;
   private String nome;
    
   
    public janelaDeposito(String nome) {
        initComponents();
        this.nome = nome;
        this.control = new DepositoController();
    }
    
   
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloDeposito = new javax.swing.JLabel();
        btSairDeposito = new javax.swing.JButton();
        txtInserirValor = new javax.swing.JTextField();
        btDepositar = new javax.swing.JButton();
        lblSaldoDeposito = new javax.swing.JLabel();
        txtMostrarSaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lblTituloDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloDeposito.setText("DEPÓSITO EM REAIS");

        btSairDeposito.setBackground(new java.awt.Color(255, 102, 0));
        btSairDeposito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairDeposito.setText("X");
        btSairDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairDepositoMouseClicked(evt);
            }
        });
        btSairDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairDepositoActionPerformed(evt);
            }
        });

        btDepositar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btDepositar.setText("DEPOSITAR");
        btDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDepositarMouseClicked(evt);
            }
        });

        lblSaldoDeposito.setText("SALDO ATUAL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addComponent(lblTituloDeposito)
                .addGap(56, 56, 56)
                .addComponent(btSairDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblSaldoDeposito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMostrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(txtInserirValor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSairDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTituloDeposito)))
                .addGap(100, 100, 100)
                .addComponent(txtInserirValor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoDeposito)
                    .addComponent(txtMostrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
     
    private void btSairDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairDepositoActionPerformed
        
    }//GEN-LAST:event_btSairDepositoActionPerformed

    private void btSairDepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairDepositoMouseClicked
        
    }//GEN-LAST:event_btSairDepositoMouseClicked

    private void btDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDepositarMouseClicked
       try {
            double valor = Double.parseDouble(txtInserirValor.getText());

            control.depositar(nome, valor);
            
            double saldoAtualizado = control.getSaldoReais(nome);
            txtMostrarSaldo.setText(String.valueOf(saldoAtualizado));
            
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Valor inserido inválido: " + txtInserirValor.getText());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btDepositarMouseClicked


    public DepositoController getControl() {
        return control;
    }

    public void setControl(DepositoController control) {
        this.control = control;
    }

    public JButton getBtDepositar() {
        return btDepositar;
    }

    public void setBtDepositar(JButton btDepositar) {
        this.btDepositar = btDepositar;
    }

    public JButton getBtSairDeposito() {
        return btSairDeposito;
    }

    public void setBtSairDeposito(JButton btSairDeposito) {
        this.btSairDeposito = btSairDeposito;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblSaldoDeposito() {
        return lblSaldoDeposito;
    }

    public void setLblSaldoDeposito(JLabel lblSaldoDeposito) {
        this.lblSaldoDeposito = lblSaldoDeposito;
    }

    public JLabel getLblTituloDeposito() {
        return lblTituloDeposito;
    }

    public void setLblTituloDeposito(JLabel lblTituloDeposito) {
        this.lblTituloDeposito = lblTituloDeposito;
    }

    public JTextField getTxtInserirValor() {
        return txtInserirValor;
    }

    public void setTxtInserirValor(JTextField txtInserirValor) {
        this.txtInserirValor = txtInserirValor;
    }

    public JTextField getTxtMostrarSaldo() {
        return txtMostrarSaldo;
    }

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
//            java.util.logging.Logger.getLogger(janelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaDeposito().setVisible(true);
//            }
//        });
//    }
    public void setTxtMostrarSaldo(JTextField txtMostrarSaldo) {
        this.txtMostrarSaldo = txtMostrarSaldo;
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btSairDeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaldoDeposito;
    private javax.swing.JLabel lblTituloDeposito;
    private javax.swing.JTextField txtInserirValor;
    private javax.swing.JTextField txtMostrarSaldo;
    // End of variables declaration//GEN-END:variables

   

   

  

    
}
