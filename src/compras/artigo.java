/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author hp pc
 */
public class artigo {
    public String nome;
    public double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public artigo() {
    }

    public artigo(String nome, double preco) {
        // TODO Auto-generated constructor stub
        this.nome = nome;
        this.preco = preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

}
