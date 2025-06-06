package br.com.dobackaofront.lanchonete;

import br.com.dobackaofront.lanchonete.controller.Banco;
import br.com.dobackaofront.lanchonete.model.Lanche;
import br.com.dobackaofront.lanchonete.view.GUIMenu;
import java.sql.Connection;
import java.sql.SQLException;

public class Lanchonete {

    /*public static void main(String[] args) {
        //objeto banco de dados
        Banco b = new Banco(); //inicio o metodo banco
        Connection conexao = b.conectar("oppea895_estudos");
        
        Lanche l = new Lanche("Café expresso", 10.90);
        b.salvar(l, conexao);
       
    }*/
    
    public static void main(String args[]) {
        GUIMenu janelaPrincipal = new GUIMenu();
        Banco b = new Banco(); //inicio o metodo banco
        Connection conexao = b.conectar();
        
        b.inicializarBanco(b.url, b.usuario, b.senha);
        b = null;

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                janelaPrincipal.setVisible(true);
                janelaPrincipal.getJInternalFrameCadastroLanche().setVisible(false);
            }
        });
    }
    
    
}
