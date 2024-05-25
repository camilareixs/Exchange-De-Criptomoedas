package DAO;

/**
 * Classe responsável por realizar operações de compra e atualização de 
 * saldo no banco de dados.
 * Esta classe fornece métodos para comprar criptomoedas, atualizar saldos 
 * de reais e criptomoedas na tabela 'cadastro' do banco de dados. 
 * Também utiliza objetos das classes Controller e ComprarController para 
 * obter informações do usuário e calcular valores de compra, respectivamente.
 * 
 * @author Camila Reis
 * RA 222220378
 */


// Importações necessárias
import controller.ComprarController;
import controller.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ComprarDAO {

    //objetos
    private Conexao conexao;
    private ComprarController comp;
    private Controller control;
    
    //construtores
    public ComprarDAO(){}
    
    public ComprarDAO(Controller control) {
        this.conexao = new Conexao();
        this.control = control;
    }
    
    // Método para realizar uma compra de criptomoeda
    public void comprar(String tipo, double valorFinal) throws SQLException {
       
       // Obtém o nome do usuário logado a partir do objeto Controller
       String nome = control.getNome();

       String sql = "SELECT reais FROM cadastro WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nome);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                
                double saldoReais = rs.getDouble("reais");
                double valorTotalCompra = valorFinal; 

                if (saldoReais >= valorTotalCompra) {
                    
                   sql = "UPDATE cadastro SET reais = reais - ? WHERE nome = ?";
                    
                    try (PreparedStatement updateStmt = conn.prepareStatement(sql)) {
                        updateStmt.setDouble(1, valorTotalCompra);
                        updateStmt.setString(2, nome);
                        updateStmt.executeUpdate();
                    }

                   
                    sql = "UPDATE cadastro SET " + tipo.toLowerCase() + " = " 
                                + tipo.toLowerCase() + " + ? WHERE nome = ?";
                    
                    try (PreparedStatement updateStmt = conn.prepareStatement(sql)) {
                        updateStmt.setDouble(1, valorTotalCompra);
                        updateStmt.setString(2, nome);
                        updateStmt.executeUpdate();
                    }
                } else {
                    throw new SQLException("Saldo insuficiente.");
                }
            } else {
                throw new SQLException("Usuário não encontrado.");
            }
        }
    }
   
    
    // Método para obter o saldo de reais do usuário
    public double obterSaldoReais() throws SQLException {
        
        String nome = control.getNome();
        
        String sql = "SELECT reais FROM cadastro WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nome);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("reais");
                }
            }
        }
        return 0;
    }
    
    // Método para atualizar o saldo de reais do usuário
    public void atualizarSaldoReais(double novoSaldo) throws SQLException {
        
        String nome = control.getNome();
        
        String sql = "UPDATE cadastro SET reais = ? WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setDouble(1, novoSaldo);
            pstmt.setString(2, nome);
            pstmt.executeUpdate();
            
        }
    }
    
    
     // Método para atualizar o saldo da criptomoeda do usuário
    public void atualizarSaldoCriptomoeda(String criptomoeda, double valor) 
                                                      throws SQLException {
        
        String nome = control.getNome();
        
        String sql = "UPDATE cadastro SET " + criptomoeda + " = ? WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setDouble(1, valor);
            pstmt.setString(2, nome);
            pstmt.executeUpdate();
            
        }
    }

    
    // Método para obter o saldo da criptomoeda do usuário
    public double obterSaldoCriptomoeda(String criptomoeda) throws SQLException {
        
        String nome = control.getNome();
        
        String sql = "SELECT " + criptomoeda + " FROM cadastro WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nome);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble(criptomoeda);
                    
                }
            }
        }
        return 0;
    }
    
    
   //Método para realizar a compra de criptomoedas
   public void realizarCompra(String tipo, double valorTotalCompra) 
                                              throws SQLException {
       
        String nome = control.getNome();
       
        System.out.println("Nome do usuário: " + nome); 
       
        try (Connection conn = conexao.getConnection()) {
        
        comprar(tipo, valorTotalCompra);
        
        double saldoAtualReais = obterSaldoReais();
        double valorFinal = comp.calcularValorFinal(tipo, valorTotalCompra);

        if (saldoAtualReais >= valorFinal) {
            double novoSaldoReais = saldoAtualReais - valorFinal;
            atualizarSaldoReais(novoSaldoReais);

            double saldoAtualCriptomoeda = obterSaldoCriptomoeda(tipo);
            double novoSaldoCriptomoeda = saldoAtualCriptomoeda + valorTotalCompra;
            atualizarSaldoCriptomoeda(tipo, novoSaldoCriptomoeda);
        } else {
            throw new SQLException("Saldo insuficiente para realizar a compra.");
        }
    }
   }
}

