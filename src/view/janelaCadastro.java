/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.CadastroDAO;
import controller.Controller;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.SQLException;



//ARRUMAR PARA MVC 


/**
 *
 * @author user
 */
public class janelaCadastro extends javax.swing.JFrame {
    
private Controller control;

    public janelaCadastro() {
        initComponents();
        control = new Controller("nome do usuário", "cpf do usuário");}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloCadastro = new javax.swing.JLabel();
        lblCpfCadastro = new javax.swing.JLabel();
        txtCpfCadastro = new javax.swing.JTextField();
        txtSenhaCadastro = new javax.swing.JTextField();
        lblSenhaCadastro = new javax.swing.JLabel();
        btEntrarCadastrado = new javax.swing.JButton();
        lblNomeCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        btEntrarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lblTituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCadastro.setText("Olá, cadastre-se:");

        lblCpfCadastro.setText("CPF:");

        txtCpfCadastro.setToolTipText("cpf");

        txtSenhaCadastro.setToolTipText("senha");

        lblSenhaCadastro.setText("SENHA:");

        btEntrarCadastrado.setBackground(new java.awt.Color(255, 255, 204));
        btEntrarCadastrado.setText("Já tenho cadastro");
        btEntrarCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarCadastradoMouseClicked(evt);
            }
        });

        lblNomeCadastro.setText("NOME:");

        txtNomeCadastro.setToolTipText("cpf");

        btEntrarCadastro.setText("Cadastrar");
        btEntrarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarCadastroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTituloCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btEntrarCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpfCadastro)
                            .addComponent(lblSenhaCadastro)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCadastro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btEntrarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTituloCadastro))
                    .addComponent(btEntrarCadastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblNomeCadastro)
                .addGap(2, 2, 2)
                .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCpfCadastro)
                .addGap(2, 2, 2)
                .addComponent(txtCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenhaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btEntrarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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

    private void btEntrarCadastradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarCadastradoMouseClicked
        janelaLogin login = new janelaLogin(control.getNome(), control.getCpf());
        login.setVisible(true);
    }//GEN-LAST:event_btEntrarCadastradoMouseClicked

    private void btEntrarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarCadastroMouseClicked
    String nome = txtNomeCadastro.getText();
    String cpf = txtCpfCadastro.getText();
    String senha = txtSenhaCadastro.getText();

    if (cpf.length() == 11 && nome.length() > 0 && senha.length() == 6) {
        CadastroDAO cadastroDAO = new CadastroDAO();
        try {
            cadastroDAO.inserir(nome, cpf, senha);
            control.setNome(nome);
            control.setCpf(cpf);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        janelaLogin login = new janelaLogin(nome, cpf);
        login.setVisible(true);
    } else {
        // Mostra uma mensagem de erro se os dados não estiverem corretos
        JOptionPane.showMessageDialog(this, "Por favor, insira os dados corretamente.");
    }
    }//GEN-LAST:event_btEntrarCadastroMouseClicked

    
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
//            java.util.logging.Logger.getLogger(janelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaCadastro().setVisible(true);
//            }
//        });
//    }

    public JButton getBtEntrarCadastrado() {
        return btEntrarCadastrado;
    }

    public void setBtEntrarCadastrado(JButton btEntrarCadastrado) {
        this.btEntrarCadastrado = btEntrarCadastrado;
    }



 

    public JButton getBtEntrarCadastro() {
        return btEntrarCadastro;
    }

    public void setBtEntrarCadastro(JButton btEntrarCadastro) {
        this.btEntrarCadastro = btEntrarCadastro;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblCpfCadastro() {
        return lblCpfCadastro;
    }

    public void setLblCpfCadastro(JLabel lblCpfCadastro) {
        this.lblCpfCadastro = lblCpfCadastro;
    }

    public JLabel getLblNomeCadastro() {
        return lblNomeCadastro;
    }

    public void setLblNomeCadastro(JLabel lblNomeCadastro) {
        this.lblNomeCadastro = lblNomeCadastro;
    }

    public JLabel getLblSenhaCadastro() {
        return lblSenhaCadastro;
    }

    public void setLblSenhaCadastro(JLabel lblSenhaCadastro) {
        this.lblSenhaCadastro = lblSenhaCadastro;
    }

    public JLabel getLblTituloCadastro() {
        return lblTituloCadastro;
    }

    public void setLblTituloCadastro(JLabel lblTituloCadastro) {
        this.lblTituloCadastro = lblTituloCadastro;
    }

    public JTextField getTxtCpfCadastro() {
        return txtCpfCadastro;
    }

    public void setTxtCpfCadastro(JTextField txtCpfCadastro) {
        this.txtCpfCadastro = txtCpfCadastro;
    }

    public JTextField getTxtNomeCadastro() {
        return txtNomeCadastro;
    }

    public void setTxtNomeCadastro(JTextField txtNomeCadastro) {
        this.txtNomeCadastro = txtNomeCadastro;
    }

    public JTextField getTxtSenhaCadastro() {
        return txtSenhaCadastro;
    }

    public void setTxtSenhaCadastro(JTextField txtSenhaCadastro) {
        this.txtSenhaCadastro = txtSenhaCadastro;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrarCadastrado;
    private javax.swing.JButton btEntrarCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpfCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JLabel lblSenhaCadastro;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JTextField txtCpfCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}
