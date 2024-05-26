package controller;


import DAO.ComprarDAO;
import DAO.VenderDAO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import view.janelaComprar;
import view.janelaDeposito;
import view.janelaLogin;
import view.janelaSenhaSaldo;
import view.janelaVender;


/**
 * Classe responsável por controlar as operações principais da aplicação.
 * Esta classe atua como o controlador principal da aplicação, gerenciando as 
 * interações entre as views (interfaces gráficas) e os DAOs (objetos de acesso 
 * a dados). Ela lida com a lógica de negócio e coordena as operações de compra,
 * venda e consulta de saldos.
 * 
 * @author Camila Reis
 * RA 222220378
 */


public class Controller {
      
    // Declaração dos atributos das views
    private janelaLogin login;
    private janelaSenhaSaldo saldo;
    private janelaDeposito deposito;
    private janelaComprar comprar;
    private janelaVender vender;
    
    // Declaração dos atributos de dados do usuário
    private String nome;
    private String cpf;
    private String senha;
    private double saldoReais;
    private double saldoBitcoin;
    private double saldoEthereum;
    private double saldoRipple;
    
    // Declaração dos atributos para manipulação de dados
    private ComprarDAO dao;
    private VenderDAO vao;

    private Controller control;
    
  
    
    // Construtor que inicializa os atributos do controlador
    public Controller(String nome, String cpf) {
        this.dao = new ComprarDAO(this);
        this.vao = new VenderDAO(this);
        this.nome = nome;
        this.cpf = cpf;
        this.deposito = new janelaDeposito(nome);
        this.vender = new janelaVender(this);
        this.comprar = new janelaComprar(this);
 
    }
     
    
    
    //Método para verificar se a senha fornecida está correta.
    /*public boolean senhaCorreta(String senha) {
        
    try {
        
        Connection conn = DriverManager.getConnection
        ("jdbc:postgresql://localhost:5432/Pessoas",
            "postgres", "fei");
     
        PreparedStatement pstmt = conn.prepareStatement
        ("SELECT senha FROM cadastro WHERE nome = ?");

       
        pstmt.setString(1, this.getNome());

   
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String senhaCorreta = rs.getString("senha");
            return senha.equals(senhaCorreta);
            
        }
    } catch (SQLException e) {
    }
    return false;
}
*/
    
    
    // Getters e setters para os atributos
    
    public janelaComprar getComprar() {
        return comprar;
    }

    public void setComprar(janelaComprar comprar) {
        this.comprar = comprar;
    }
    
    public Controller getControl() {
        return control;
    }

    public void setControl(Controller control) {
        this.control = control;
    }

    public janelaLogin getLogin() {
        return login;
    }

    public void setLogin(janelaLogin login) {
        this.login = login;
    }

    public janelaSenhaSaldo getSaldo() {
        return saldo;
    }

    public void setSaldo(janelaSenhaSaldo saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldoReais() {
        return saldoReais;
    }

    public void setSaldoReais(double saldoReais) {
        this.saldoReais = saldoReais;
    }

    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public void setSaldoBitcoin(double saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public double getSaldoEthereum() {
        return saldoEthereum;
    }

    public void setSaldoEthereum(double saldoEthereum) {
        this.saldoEthereum = saldoEthereum;
    }

    public double getSaldoRipple() {
        return saldoRipple;
    }

    public void setSaldoRipple(double saldoRipple) {
        this.saldoRipple = saldoRipple;
    }

    public janelaDeposito getDeposito() {
        return deposito;
    }

    public void setDeposito(janelaDeposito deposito) {
        this.deposito = deposito;
    }
    
    
    
    
    
    
    
}
