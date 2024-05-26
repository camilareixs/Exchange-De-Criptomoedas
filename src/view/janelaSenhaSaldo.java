package view;
import DAO.ComprarDAO;
import controller.Controller;


/**
 * Nessa janela o usuario insere sua respectiva senha e se estiver correta vai
 * para a tela escolhida no menu
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaSenhaSaldo extends javax.swing.JFrame {
    
    private Controller control;
    private String opcao;
    private String nome;
    private ComprarDAO dao;
   
    public janelaSenhaSaldo(ComprarDAO dao){
        this.dao = dao;
    }

   public janelaSenhaSaldo(Controller control, String opcao) { 
       
        initComponents();
        this.control = control;
        this.opcao = opcao;
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btEntrarSaldo = new javax.swing.JButton();
        lblTituloSenhaSaldo = new javax.swing.JLabel();
        lblInsiraSenha = new javax.swing.JLabel();
        btSairSenha = new javax.swing.JButton();
        txtSenhaSaldo = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        btEntrarSaldo.setText("OK");
        btEntrarSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarSaldoMouseClicked(evt);
            }
        });

        lblTituloSenhaSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloSenhaSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSenhaSaldo.setText("INSIRA SUA SENHA DE 6 DIGITOS");

        lblInsiraSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblInsiraSenha.setText("Insira a sua senha de 6 digítos:");

        btSairSenha.setBackground(new java.awt.Color(204, 153, 255));
        btSairSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairSenha.setForeground(new java.awt.Color(255, 255, 255));
        btSairSenha.setText("X");
        btSairSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairSenhaMouseClicked(evt);
            }
        });
        btSairSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTituloSenhaSaldo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btEntrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(lblInsiraSenha))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(txtSenhaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btSairSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSairSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTituloSenhaSaldo)))
                .addGap(62, 62, 62)
                .addComponent(lblInsiraSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btEntrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSenhaActionPerformed
         janelaMenu menu = new janelaMenu(control);
        menu.setVisible(true);
    }//GEN-LAST:event_btSairSenhaActionPerformed

    private void btSairSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairSenhaMouseClicked
        dispose();
    }//GEN-LAST:event_btSairSenhaMouseClicked

    private void btEntrarSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarSaldoMouseClicked
     
    //Ta conferindo qual opção inserida no menu
    char[] senhaCharArray = txtSenhaSaldo.getPassword();
        String senha = new String(senhaCharArray);
        
    if (senha.length() == 6) {
  
    switch (opcao) {
            case "1":
                janelaInfoSaldo menu = new janelaInfoSaldo(control);
                menu.setVisible(true);
                break;
           
            case "5":
                janelaComprar compr = new janelaComprar(control);
                compr.setVisible(true);
                break;
            case "6":
                janelaVender vend = new janelaVender(control);
                vend.setVisible(true);
                break;   
   
    }
}
    }//GEN-LAST:event_btEntrarSaldoMouseClicked

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
//            java.util.logging.Logger.getLogger(janelaSenhaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaSenhaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaSenhaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaSenhaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaSenhaSaldo().setVisible(true);
//            }
//        });
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrarSaldo;
    private javax.swing.JButton btSairSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInsiraSenha;
    private javax.swing.JLabel lblTituloSenhaSaldo;
    private javax.swing.JPasswordField txtSenhaSaldo;
    // End of variables declaration//GEN-END:variables
}

   
