package br.com.dobackaofront.lanchonete.controller;

import br.com.dobackaofront.lanchonete.model.Lanche;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {
    public String url;
    public String usuario;
    public String senha;
    public String banco;
    
    //Construtor da conexão
    public Banco(){
        url = "jdbc:mysql://162.241.60.224:3306";
        usuario = "oppea895_estudos";
        senha = "@Jr102915#";
        banco = "oppea895_estudos";
        
        //inicializarBanco(url, usuario, senha);
    }
    
    //Conexão com o banco de dados
    public Connection conectar(){
        try{
            url += "/" + banco;
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
    
    //Efetua a leitura de linha por linha do arquivo banco.sql
    public void inicializarBanco(String url, String usuario, String senha){
        try{
           Connection conexao = DriverManager.getConnection(url, usuario, senha);
           Statement stmt = conexao.createStatement();
           
           try{
               InputStream is = new FileInputStream("banco.sql");
               InputStreamReader isr = new InputStreamReader(is);
               BufferedReader br = new BufferedReader (isr);
               
               String linha;
               StringBuilder sql = new StringBuilder();
               
               linha = br.readLine();
               
               while(linha != null){
                   System.out.println(linha);
                   sql.append(linha).append("\n");
                   
                   if(linha.trim().endsWith(";")){
                       stmt.execute(sql.toString());
                       sql.setLength(0);
                   }
                   
                   linha = br.readLine(); //atualiza a linha
               }
               
               stmt.close();
               conexao.close();
               
           }catch(Exception e){
               System.out.println("Não foi possivel ler o arquivo banco.sql");
           }
           
        }catch(SQLException e){
            System.out.println("Erro ao conectar no banco de dados no metodo inicializarBanco");
        }
        
    }
}
