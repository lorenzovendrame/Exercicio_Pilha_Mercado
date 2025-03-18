package com.example.aula_110325;

public class PilhaDinamica {
    private Compra[] pilha;
    private int tamanho;

    public PilhaDinamica(int capacidadeInicial) {
        this.pilha = new Compra[capacidadeInicial];
        this.tamanho = 0;
    }

    // Método para empilhar
    public void empilhar(Compra compra) {
        if (tamanho == pilha.length) {
            redimensionar();
        }
        pilha[tamanho] = compra;
        tamanho++;
    }

    // Método para desempilhar
    public Compra desempilhar() {
        if (estaVazia()) {
            return null;
        }
        Compra compra = pilha[tamanho - 1];
        pilha[tamanho - 1] = null;
        tamanho--;
        return compra;
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para redimensionar a pilha
    private void redimensionar() {
        Compra[] novaPilha = new Compra[pilha.length * 2];
        System.arraycopy(pilha, 0, novaPilha, 0, pilha.length);
        pilha = novaPilha;
    }

    // Método para obter o último elemento sem removê-lo
    public Compra ultimoElemento() {
        if (estaVazia()) {
            return null;
        }
        return pilha[tamanho - 1];
    }
}
