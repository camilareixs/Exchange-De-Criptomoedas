package DAO;
import controller.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por realizar operações de saque e consulta de saldo 
 * no banco de dados.
 * Esta classe fornece métodos para realizar saques na conta de um usuário e 
 * obter o saldo de reais da conta a partir do nome do usuário. 
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class VenderDAO {

    private Conexao conexao;
    private Controller control;
    
    // Taxas de venda para cada tipo de criptomoeda
    private final double BITCOIN_TAXA = 0.03;
    private final double ETHEREUM_TAXA = 0.02;
    private final double RIPPLE_TAXA = 0.01;
    

    public VenderDAO(Controller control) {
        this.conexao = new Conexao();
        this.control = control;
    }
    
    public VenderDAO(){}
    
    // Método para realizar uma venda de criptomoeda
    public void vender(String tipo, double quantidade) throws SQLException {
        String nome = control.getNome();
        double taxa = 0.0;

        // Determina a taxa de venda com base no tipo de criptomoeda
        switch (tipo) {
            case "Bitcoin":
                taxa = BITCOIN_TAXA;
                break;
            case "Ethereum":
                taxa = ETHEREUM_TAXA;
                break;
            case "Ripple":
                taxa = RIPPLE_TAXA;
                break;
        }

    String sql = "SELECT " + tipo.toLowerCase() + " FROM cadastro WHERE nome = ?";
        
        try (Connection conn = conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                double saldoCriptomoeda = rs.getDouble(tipo.toLowerCase());
                double valorTotalVenda = quantidade * (1 - taxa);

                if (saldoCriptomoeda >= quantidade) {
                    
                    sql = "UPDATE cadastro SET " + tipo.toLowerCase() + " = " +
                            tipo.toLowerCase() + " - ?, reais = reais + ? WHERE "
                                                                   + "nome = ?";
                    
                    try (PreparedStatement updateStmt = conn.prepareStatement
                                                                     (sql)) {
                        
                        // Define os parâmetros da atualização
                        updateStmt.setDouble(1, quantidade);
                        updateStmt.setDouble(2, valorTotalVenda);
                        updateStmt.setString(3, nome);
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
}
