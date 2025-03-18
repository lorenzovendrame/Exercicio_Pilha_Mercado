package com.example.aula_110325;

import java.math.BigDecimal;

public class Compra {

    private Produto produto;
    private int quantidade;

    public Compra(Produto produto, int quantidade, float preco) {
        /*if (verificaQuantidadeEstoque(quantidade)){
            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
            produto.setPrecoVenda(preco);
        }*/
        this.produto = produto;
        this.quantidade = quantidade;

    }
    public Compra(Produto produto) {
        this.produto = produto;
    }

    public boolean verificaQuantidadeEstoque(int quantidade) {
        return produto.getQuantidadeEstoque() >= quantidade;
    }

    public String getProdutoName() {
        return produto.getNome();
    }

    public float getProdutoValorVenda() {
        return produto.getPrecoVenda();
    }

    public int getEstoqueProduto() {
        return produto.getQuantidadeEstoque();
    }

    public void setEstoqueProduto(int estoque) {
        produto.setQuantidadeEstoque(estoque);
    }
}
