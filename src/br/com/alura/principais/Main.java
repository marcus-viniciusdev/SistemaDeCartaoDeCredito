package br.com.alura.principais;

import br.com.alura.modelos.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double saldoDoCartao = scanner.nextDouble();

        List<Produto> produtosComprados = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do produto: ");
            String nomeDoProduto = scanner.next();

            System.out.print("Digite o valor do produto: ");
            double valorDoProduto = scanner.nextDouble();

            if (saldoDoCartao >= valorDoProduto) {
                produtosComprados.add(new Produto(nomeDoProduto, valorDoProduto));
                saldoDoCartao -= valorDoProduto;
            } else {
                System.out.println("\nSaldo insuficiente!");
                break;
            }

            System.out.print("Digite 0 para sair ou 1 para adicionar outro produto: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo!");
                break;
            } else if (opcao == 1) {
                System.out.println("Próximo Produto");
            } else {
                System.out.println("Opção inválida! Continuando...");
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        produtosComprados.sort(Comparator.comparing(Produto::getPreco));
        produtosComprados.forEach(System.out::println);

        System.out.println("\n***********************\n");
        System.out.printf("Saldo do cartão: R$%.2f\n", saldoDoCartao);
    }
}
