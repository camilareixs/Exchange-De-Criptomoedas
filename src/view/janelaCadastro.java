package view;

import DAO.CadastroDAO;
import controller.Controller;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.SQLException;


/**
 * Nessa janela o usuario vai poder se cadastrar com nome, cpf e senha e seus 
 * dados ficarão salvos no banco de dados.
 * Caso já tenha um cadastro pode acessar a janela de Login
 * @author 
 */


public class janelaCadastro extends javax.swing.JFrame {
    

    public janelaCadastro() {
        initComponents();
        control = new Controller("nome do usuário", "cpf do usuário");}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloCadastro = new javax.swing.JLabel();
        lblCpfCadastro = new javax.swing.JLabel();
        txtCpfCadastro = new javax.swing.JTextField();
        lblSenhaCadastro = new javax.swing.JLabel();
        btEntrarCadastrado = new javax.swing.JButton();
        lblNomeCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        btEntrarCadastro = new javax.swing.JButton();
        lblTituloCadastro1 = new javax.swing.JLabel();
        lblTituloCadastro2 = new javax.swing.JLabel();
        lblTituloCadastro3 = new javax.swing.JLabel();
        txtSenhaCadastro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        lblTituloCadastro.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro.setText("Seja bem-vindo (a), ");

        lblCpfCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCpfCadastro.setText("CPF (sem pontos):");

        txtCpfCadastro.setToolTipText("11 digitos");

        lblSenhaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaCadastro.setText("SENHA (6 digitos):");
        lblSenhaCadastro.setToolTipText("6 digitos numericos");

        btEntrarCadastrado.setBackground(new java.awt.Color(204, 102, 255));
        btEntrarCadastrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEntrarCadastrado.setForeground(new java.awt.Color(255, 255, 255));
        btEntrarCadastrado.setText("Sou cadastrado (a)");
        btEntrarCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarCadastradoMouseClicked(evt);
            }
        });

        lblNomeCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCadastro.setText("NOME:");

        txtNomeCadastro.setToolTipText("nome");

        btEntrarCadastro.setText("Cadastrar");
        btEntrarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarCadastroMouseClicked(evt);
            }
        });

        lblTituloCadastro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCadastro1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro1.setText("CADASTRE-SE");

        lblTituloCadastro2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblTituloCadastro2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro2.setText("e comece a investir no futuro");

        lblTituloCadastro3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblTituloCadastro3.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro3.setText("PURPLANK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpfCadastro)
                            .addComponent(lblSenhaCadastro)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCadastro)
                            .addComponent(lblTituloCadastro2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCpfCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btEntrarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblTituloCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTituloCadastro1)))
                .addGap(0, 132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloCadastro3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrarCadastrado))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrarCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTituloCadastro)
                .addGap(18, 18, 18)
                .addComponent(lblTituloCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
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
                .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
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
        //Ao clicar no botão informando que já tem cadastro ele vai para Login
        janelaLogin login = new janelaLogin(control.getNome(), control.getCpf());
        login.setVisible(true);
    }//GEN-LAST:event_btEntrarCadastradoMouseClicked

    private void btEntrarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarCadastroMouseClicked
    
    String nome = txtNomeCadastro.getText();
    String cpf = txtCpfCadastro.getText();
    String senha = txtSenhaCadastro.getText();

    // Verificação e inserção de dados no banco de dados
    if (cpf.length() == 11 && nome.length() > 0 && senha.length() == 6 &&
                            cpf.matches("\\d{11}") && senha.matches("\\d{6}")) {
    
        CadastroDAO cadastroDAO = new CadastroDAO();

    try {
        cadastroDAO.inserir(nome, cpf, senha);
        control.setNome(nome);
        control.setCpf(cpf);

        janelaLogin login = new janelaLogin(nome, cpf);
        login.setVisible(true);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados.",
                                             "Erro", JOptionPane.ERROR_MESSAGE);
    }
} else {
    // Mensagem de erro se os dados não estiverem corretos
    if (cpf.length() != 11 || !cpf.matches("\\d{11}")) {
        JOptionPane.showMessageDialog(this, "Erro: Digite um CPF sem pontos e "
                        + "com 11 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
    } else if (senha.length() != 6 || !senha.matches("\\d{6}")) {
        JOptionPane.showMessageDialog(this, "Erro: Digite uma senha de 6 dígitos"
                            + " numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, insira os dados "
                          + "corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
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

    
    //Getters e setters
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
    
    
private Controller control;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrarCadastrado;
    private javax.swing.JButton btEntrarCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpfCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JLabel lblSenhaCadastro;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JLabel lblTituloCadastro1;
    private javax.swing.JLabel lblTituloCadastro2;
    private javax.swing.JLabel lblTituloCadastro3;
    private javax.swing.JTextField txtCpfCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JPasswordField txtSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}
