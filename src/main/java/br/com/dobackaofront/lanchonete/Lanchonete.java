package br.com.dobackaofront.lanchonete;

import br.com.dobackaofront.lanchonete.controller.Banco;
import br.com.dobackaofront.lanchonete.model.Lanche;
import java.sql.Connection;
import java.sql.SQLException;

public class Lanchonete {

    public static void main(String[] args) {
        //objeto banco de dados
        Banco b = new Banco(); //inicio o metodo banco
        Connection conexao = b.conectar("oppea895_estudos");
        
        Lanche l = new Lanche("Café expresso", 10.90);
        b.salvar(l, conexao);
        
        /*//somente para testes de inserção no banco
        Lanche l = new Lanche("Café expresso", 10.90);
        
        if(conexao != null){
            try{
                //somente para testes de inserção no banco
                b.salvar(l, conexao);
                
                conexao.close();
            }catch(SQLException e){
                
                System.out.println("Conexão com o banco de dados falhou!");
            }
        }*/
       
    }
}
