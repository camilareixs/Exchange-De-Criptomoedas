package view;
import controller.SacarController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.SQLException;


/**
 * Nessa tela o usuario pode sacar algum valor
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaSacar extends javax.swing.JFrame {

    private SacarController control;
    private String nome;
    
    public janelaSacar(String nome) {
        initComponents();
         this.nome = nome;
        this.control = new SacarController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloSacar = new javax.swing.JLabel();
        btSairSacar = new javax.swing.JButton();
        txtInserirSacar = new javax.swing.JTextField();
        btSacar = new javax.swing.JButton();
        lblSaldoSacar = new javax.swing.JLabel();
        txtMostrarSaldoSacar = new javax.swing.JTextField();
        lblSaldoSacar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        lblTituloSacar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloSacar.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSacar.setText("SACAR REAIS");

        btSairSacar.setBackground(new java.awt.Color(204, 153, 255));
        btSairSacar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        btSacar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btSacar.setText("SACAR");
        btSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSacarMouseClicked(evt);
            }
        });

        lblSaldoSacar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldoSacar.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoSacar.setText("SALDO ATUAL:");

        lblSaldoSacar1.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoSacar1.setText("insira o valor do saque:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblTituloSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lblSaldoSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMostrarSaldoSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoSacar1)
                            .addComponent(txtInserirSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTituloSacar))
                    .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(lblSaldoSacar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInserirSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoSacar)
                    .addComponent(txtMostrarSaldoSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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

    private void btSairSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSacarActionPerformed
       
    }//GEN-LAST:event_btSairSacarActionPerformed

    private void btSairSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairSacarMouseClicked
   dispose();
    }//GEN-LAST:event_btSairSacarMouseClicked

    private void btSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSacarMouseClicked
         
        //DAO
        try {
            double valor = Double.parseDouble(txtInserirSacar.getText());

            control.sacar(nome, valor);

            
            double saldoAtualizado = control.getSaldoReais(nome);
            txtMostrarSaldoSacar.setText(String.valueOf(saldoAtualizado));
            
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Valor inserido inválido: " + txtInserirSacar.getText());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btSacarMouseClicked
    
    
    
    public JTextField getTxtMostrarSaldoSacar() {
        return txtMostrarSaldoSacar;
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
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaSacar().setVisible(true);
//            }
//        });
    
    
    
    //Getters e setters
    public void setTxtMostrarSaldoSacar(JTextField txtMostrarSaldoSacar) {
        this.txtMostrarSaldoSacar = txtMostrarSaldoSacar;
    }

    public SacarController getControl() {
        return control;
    }

    public void setControl(SacarController control) {
        this.control = control;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JButton getBtSacar() {
        return btSacar;
    }

    public void setBtSacar(JButton btSacar) {
        this.btSacar = btSacar;
    }

    public JButton getBtSairSacar() {
        return btSairSacar;
    }

    public void setBtSairSacar(JButton btSairSacar) {
        this.btSairSacar = btSairSacar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblSaldoSacar() {
        return lblSaldoSacar;
    }

    public void setLblSaldoSacar(JLabel lblSaldoSacar) {
        this.lblSaldoSacar = lblSaldoSacar;
    }

    public JLabel getLblTituloSacar() {
        return lblTituloSacar;
    }

    public void setLblTituloSacar(JLabel lblTituloSacar) {
        this.lblTituloSacar = lblTituloSacar;
    }

    public JTextField getTxtInserirSacar() {
        return txtInserirSacar;
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
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaSacar().setVisible(true);
//            }
//        });
    public void setTxtInserirSacar(JTextField txtInserirSacar) {
        this.txtInserirSacar = txtInserirSacar;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btSairSacar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaldoSacar;
    private javax.swing.JLabel lblSaldoSacar1;
    private javax.swing.JLabel lblTituloSacar;
    private javax.swing.JTextField txtInserirSacar;
    private javax.swing.JTextField txtMostrarSaldoSacar;
    // End of variables declaration//GEN-END:variables
}
