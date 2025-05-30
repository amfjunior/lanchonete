package br.com.dobackaofront.lanchonete.model;

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
}
