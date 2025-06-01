package br.com.alura.principais;

import br.com.alura.modelos.CartaoDeCredito;
import br.com.alura.modelos.Compra;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(scanner.nextDouble());
        scanner.nextLine();

        while (true) {
            System.out.print("Digite a descrição da compra: ");
            String nomeDoProduto = scanner.nextLine();

            System.out.print("Digite o valor da compra: ");
            double valorDoProduto = scanner.nextDouble();
            scanner.nextLine();

            if (!cartaoDeCredito.comprando(new Compra(nomeDoProduto, valorDoProduto))) {
                break;
            }

            System.out.print("Digite 0 para sair ou 1 para continuar comprando: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("\nSaindo!");
                break;
            } else if (opcao == 1) {
                System.out.println("Próxima Compra!");
            } else {
                System.out.println("Opção inválida! Continuando...");
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        cartaoDeCredito.getCompras().sort(Comparator.comparing(Compra::getValor));
        cartaoDeCredito.getCompras().forEach(System.out::println);

        System.out.println("\n***********************\n");
        System.out.printf("Saldo do cartão: R$%.2f\n", cartaoDeCredito.getSaldo());
    }
}
