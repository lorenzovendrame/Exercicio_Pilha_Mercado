package com.example.aula_110325;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class Aula110325Application {

    public static void main(String[] args) {
        //SpringApplication.run(Aula110325Application.class, args);

        SistemaGerenciamento sistema = new SistemaGerenciamento();

        // Registrar compras
        Compra compra1 = new Compra(new Produto("Mel", 10.0f, 15.0f, 100, 100));
        Compra compra2 = new Compra(new Produto("Mel", 12.0f, 18.0f, 100, 100));

        sistema.registrarCompra(compra1);
        sistema.registrarCompra(compra2);
        sistema.imprimirEstoque();

        // Vender produtos
        sistema.venderProduto("Mel", 100);
        sistema.venderProduto("Mel", 20);
        sistema.imprimirEstoque();

        sistema.venderProduto("Mel", 80);
        sistema.imprimirEstoque();

        sistema.venderProduto("Mel", 20);
        sistema.imprimirEstoque();
    }
}
