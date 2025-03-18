package com.example.aula_110325;

import java.math.BigDecimal;
import java.util.Date;

public class Compra {

    private Produto produto;

    public Compra(Produto produto) {
        this.produto = produto;
    }

    public boolean verificaQuantidadeEstoque(int quantidade) {
        return produto.getQuantidadeEstoque() >= quantidade;
    }

    public Date getDate(){
        return produto.getData();
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
