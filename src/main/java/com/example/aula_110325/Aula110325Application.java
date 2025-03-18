package com.example.aula_110325;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Scanner;

//@SpringBootApplication
public class Aula110325Application {

    public static void main(String[] args) {
        //SpringApplication.run(Aula110325Application.class, args);

        SistemaGerenciamento sistema = new SistemaGerenciamento();

        while (true) {
            //Display do menu no console
            System.out.println("==============================");
            System.out.println("|            MENU            |");
            System.out.println("==============================");
            System.out.println("| Opções :                   |");
            System.out.println("|        1. Registrar compra |");
            System.out.println("|        2. Vender Produto   |");
            System.out.println("|        3. Imprimir Estoque |");
            System.out.println("|        4. Sair             |");
            System.out.println("==============================");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1: //Input do usuário para registrar compra
                    System.out.println("Digite o nome do produto: ");
                    Scanner registrarProduto = new Scanner(System.in);
                    String nomeProd = registrarProduto.nextLine();
                    System.out.println("Digite o preço de compra: ");
                    float precoCompra = registrarProduto.nextFloat();
                    System.out.println("Digite o preço de venda: ");
                    float precoVenda = registrarProduto.nextFloat();
                    System.out.println("Digite a quantidade comprada: ");
                    int quantidadeComprada = registrarProduto.nextInt();
                    Compra compra = new Compra(new Produto(nomeProd, precoCompra, precoVenda, quantidadeComprada));
                    sistema.registrarCompra(compra);
                    break;
                case 2: //Input do usuário para registrar a venda
                    System.out.println("Digite o nome do produto: ");
                    Scanner vendaProduto = new Scanner(System.in);
                    String nomeProd2 = vendaProduto.nextLine();
                    System.out.println("Digite a quantidade a ser vendida");
                    int quantidadeVenda = vendaProduto.nextInt();
                    sistema.venderProduto(nomeProd2, quantidadeVenda);
                    break;
                case 3: //Input do usuário para imprimir estoque e informações no console
                    sistema.imprimirEstoque();
                    break;
                case 4: //Input do usuário para sair do programa
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
