package com.example.aula_110325;

import java.util.HashMap;
import java.util.Map;

public class SistemaGerenciamento {
    private PilhaDinamica pilha;
    private Map<String, PilhaDinamica> estoquePorProduto;
    //private int estoqueTotal;

    /*public int getEstoqueTotal() {
        return estoqueTotal;
    }

    public void addEstoqueTotal(int estoqueTotal) {
        this.estoqueTotal += estoqueTotal;
    }

    public void setEstoqueTotal (int estoqueTotal) {
        this.estoqueTotal = estoqueTotal;
    }*/

    public SistemaGerenciamento() {
        this.pilha = new PilhaDinamica(10);
        this.estoquePorProduto = new HashMap<>();
        //this.estoqueTotal = 0;
    }

    // Método para registrar uma compra
    public void registrarCompra(Compra compra) {
        if (!estoquePorProduto.containsKey(compra.getProdutoName())) {
            estoquePorProduto.put(compra.getProdutoName(), new PilhaDinamica(10));
        }
        estoquePorProduto.get(compra.getProdutoName()).empilhar(compra);
        //addEstoqueTotal(estoquePorProduto.get(compra.getProdutoName()).ultimoElemento().getEstoqueProduto());//errado
        pilha.empilhar(compra);
    }

    // Método para vender um produto
    public void venderProduto(String produto, int quantidadeVendida) {
        if (estoquePorProduto.containsKey(produto)) {
            PilhaDinamica pilhaProduto = estoquePorProduto.get(produto);
            if (!pilhaProduto.estaVazia()) {
                //if (getEstoqueTotal() >= quantidadeVendida) {
                if (pilhaProduto.getEstoque() >= quantidadeVendida) {
                    pilhaProduto.setEstoque(pilha.getEstoque() - quantidadeVendida);
                    //setEstoqueTotal(getEstoqueTotal() - quantidadeVendida);
                } else {
                    System.out.println("Não há estoque suficiente para vender " + quantidadeVendida + " unidades de " + produto);
                }
            } else {
                System.out.println("Não há compras registradas para o produto " + produto);
            }
        } else {
            System.out.println("Produto não encontrado no estoque");
        }
    }

    // Método para imprimir o estoque atual
    public void imprimirEstoque() {
        for (Map.Entry<String, PilhaDinamica> entry : estoquePorProduto.entrySet()) {
            System.out.println("Produto: " + entry.getKey());
            PilhaDinamica pilhaProduto = entry.getValue();
            if (!pilhaProduto.estaVazia()) {
                Compra ultimaCompra = pilhaProduto.ultimoElemento();
                System.out.println("Data da compra: " + ultimaCompra.getDate().toString());
                //System.out.println("Quantidade em estoque: " + getEstoqueTotal());
                System.out.println("Quatidade em estoque: " + estoquePorProduto.get(ultimaCompra.getProdutoName()).getEstoque());
                System.out.println("Preço de venda: " + ultimaCompra.getProdutoValorVenda());
            } else {
                System.out.println("Não há compras registradas");
            }
            System.out.println();
        }
    }
}
