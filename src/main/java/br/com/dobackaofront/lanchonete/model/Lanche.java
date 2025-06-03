package br.com.dobackaofront.lanchonete.model;

import br.com.dobackaofront.lanchonete.controller.Banco;
import java.sql.Connection;

public class Lanche {
    private String nome;
    private double preco;
    
    public Lanche(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void apresentarLanche() {
        System.out.println("Nome: "+nome+", R$ "+preco);
    }
    
    public void salvar(Lanche lanche){
        Banco b = new Banco(); //inicio o metodo banco
        Connection conexao = b.conectar();
        b.salvar(lanche, conexao);
    }
}
