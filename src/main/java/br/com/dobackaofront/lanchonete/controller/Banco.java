package br.com.dobackaofront.lanchonete.controller;

import br.com.dobackaofront.lanchonete.model.Lanche;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Banco {
    private String url;
    private String usuario;
    private String senha;
    
    //Construtor da conexão
    public Banco(){
        url = "jdbc:mysql://162.241.60.224:3306/oppea895_estudos";
        usuario = "oppea895_estudos";
        senha = "@Jr102915#";
    }
    
    //Conexão com o banco de dados
    public Connection conectar(){
        try{
            
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            System.out.println("Conexão bem sucedida!");
            return conexao;
            
        }catch(SQLException e){
            
            System.out.println("Conexão não realizada!");
            return null;
            
        }
    }
    
    //Botão salvar lanche
    public void salvar(Lanche lanche, Connection conexao){
        
        String sql = "INSERT INTO lanche(nome, preco) VALUES(?, ?)";
        
        try{
            //prepara a conexão e passa a o sql que será exevutado
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //passa para os ? o valor dos campos do form
            stmt.setString(1, lanche.getNome());
            stmt.setDouble(2, lanche.getPreco());
            
            //verifica quantas linhas foram afetadas no banco de dados para ter certeza das alterações 
            int linhasAfetadas = stmt.executeUpdate();
            
            if(linhasAfetadas > 0){
                System.out.println("Lanche salvo com sucesso!");
            }
            
        }catch(SQLException e){
            //caso algo tenha dado errado no momento de executar em banco de dados
            System.out.println("Lanche não pode ser salvo!");           
        }
    } 
}
