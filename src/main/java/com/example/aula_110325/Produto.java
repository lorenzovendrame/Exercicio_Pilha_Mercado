package com.example.aula_110325;
import java.util.Date;

public class Produto {
    private Date data;
    private String nome;
    private float precoCompra;
    private float precoVenda;
    private int quantidadeComprada;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, float precoCompra, float precoVenda, int quantidadeComprada, int quantidadeEstoque){
        data = new Date(System.currentTimeMillis());
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidadeComprada = quantidadeComprada;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(Date data, String nome, float precoCompra, float precoVenda, int quantidadeComprada, int quantidadeEstoque) {
        this.data = data;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidadeComprada = quantidadeComprada;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
