package view;

import DAO.VenderDAO;
import controller.Controller;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.awt.event.ItemListener;
import model.Cotacao;
import java.awt.event.ItemEvent;


/**
 * Janela para o usuario vender alguma moeda
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class janelaVender extends javax.swing.JFrame {

    private Controller control;
    private VenderDAO vao;
    private Cotacao modelo;
    private String nome;
            
   public janelaVender(Controller control) {
       
        this.control = control;
        modelo = new Cotacao(); 
        this.control = control;
        this.vao = new VenderDAO(control);
        this.nome = control.getNome();
        initComponents();
        exibirValores();
        
    }
   
   //Exibe cotação
   public void exibirValores(){
        
     String valores = "Bitcoin: R$ " + String.format("%.2f", modelo.getValorBitcoin()) + "\n"
                       + "Ethereum: R$ " + String.format("%.2f", modelo.getValorEthereum()) + "\n"
                       + "Ripple: R$ " + String.format("%.2f", modelo.getValorRipple());
        txtAreaCotacao.setText(valores);
        
    }
   
   //Realiza a condição de qual botão ta selecionado
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
   
   //Exibe cotação com taxa
   private void exibirCotacaoComTaxa(String tipo) {
        double valor = 0;
        double taxa = 0;

        switch (tipo) {
            case "Bitcoin":
                valor = modelo.getValorBitcoin();
                taxa = 0.03; 
                break;
            case "Ethereum":
                valor = modelo.getValorEthereum();
                taxa = 0.02; 
                break;
            case "Ripple":
                valor = modelo.getValorRipple();
                taxa = 0.01; 
                break;
        }

        double valorComTaxa = valor * (1 + taxa);
        String resultado = String.format("%s: R$%.2f"
                , tipo, valorComTaxa, taxa * 100);
        txtConfiraValor.setText(resultado);
    }
   
   
   //Calcula o valor final com as taxas, cotação e quantidade
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
                    taxa = 0.03; // 3% de taxa
                    break;
                case "Ethereum":
                    valor = modelo.getValorEthereum();
                    taxa = 0.02; // 2% de taxa
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

   
   //Metodo para conectar com o banco de dados para realizar a atualização
    private void realizarVenda() throws SQLException {
        String tipo = "";

        if (btBit.isSelected()) {
            tipo = "Bitcoin";
        } else if (btEthe.isSelected()) {
            tipo = "Ethereum";
        } else if (btRip.isSelected()) {
            tipo = "Ripple";
        }

        if (!tipo.isEmpty()) {
            
                double quantidade = Double.parseDouble(txtQnt.getText());
                vao.vender(tipo, quantidade);
                
                JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!"
                , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
        } else {
            txtConfiraValor.setText("Selecione uma moeda antes de calcular.");
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCotacao = new javax.swing.JTextArea();
        lbltituloCotacao = new javax.swing.JLabel();
        lblTituloEscolha = new javax.swing.JLabel();
        txtTituloQnt = new javax.swing.JLabel();
        txtQnt = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lblTituloValor = new javax.swing.JLabel();
        txtConfiraValor = new javax.swing.JTextField();
        btVender = new javax.swing.JButton();
        btBit = new javax.swing.JToggleButton();
        btEthe = new javax.swing.JToggleButton();
        btRip = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblTituloSacar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloSacar.setText("VENDER CRIPTOMOEDAS");

        btSairSacar.setBackground(new java.awt.Color(51, 0, 51));
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

        lbltituloCotacao.setText("COTAÇÃO:");

        lblTituloEscolha.setText("ESCOLHA QUAL DESEJA VENDER:");

        txtTituloQnt.setText("INSIRA A QUANTIDADE (ex: 2)");

        btCalcular.setText("CALCULAR");
        btCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcularMouseClicked(evt);
            }
        });

        lblTituloValor.setText("CONFIRA O VALOR (R$):");

        txtConfiraValor.setEditable(false);

        btVender.setText("VENDER");
        btVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVenderMouseClicked(evt);
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
                .addContainerGap(86, Short.MAX_VALUE)
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
                                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloSacar)
                        .addGap(61, 61, 61)
                        .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btBit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEthe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRip)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btSairSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTituloSacar)
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
                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void btSairSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairSacarMouseClicked
 dispose();
    }//GEN-LAST:event_btSairSacarMouseClicked

    private void btSairSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSacarActionPerformed
       
    }//GEN-LAST:event_btSairSacarActionPerformed

    private void btCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcularMouseClicked
         calcularValorFinal();
    }//GEN-LAST:event_btCalcularMouseClicked

    private void btVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVenderMouseClicked
       try {
            realizarVenda();
        } catch (SQLException ex) {
            ex.printStackTrace();
            txtConfiraValor.setText("Erro ao realizar a venda: " + ex.getMessage());
        }
    }//GEN-LAST:event_btVenderMouseClicked

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
//            java.util.logging.Logger.getLogger(janelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(janelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(janelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(janelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new janelaVender().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btBit;
    private javax.swing.JButton btCalcular;
    private javax.swing.JToggleButton btEthe;
    private javax.swing.JToggleButton btRip;
    private javax.swing.JButton btSairSacar;
    private javax.swing.JButton btVender;
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