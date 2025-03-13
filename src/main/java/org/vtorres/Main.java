package org.vtorres;

import org.vtorres.entites.Banco;
import org.vtorres.entites.Conta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Remover Conta");
            System.out.println("6. Listar Contas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número da Conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Titular da Conta: ");
                    String titular = scanner.nextLine();
                    System.out.print("Saldo Inicial: ");
                    double saldo = scanner.nextDouble();
                    banco.adicionarConta(new Conta(numeroConta, titular, saldo));
                    break;

                case 2:
                    System.out.print("Número da Conta: ");
                    int numContaDeposito = scanner.nextInt();
                    Conta contaDeposito = banco.buscarConta(numContaDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Valor do Depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        contaDeposito.depositar(valorDeposito);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Número da Conta: ");
                    int numContaSaque = scanner.nextInt();
                    Conta contaSaque = banco.buscarConta(numContaSaque);
                    if (contaSaque != null) {
                        System.out.print("Valor do Saque: ");
                        double valorSaque = scanner.nextDouble();
                        contaSaque.sacar(valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Número da Conta: ");
                    int numContaSaldo = scanner.nextInt();
                    Conta contaSaldo = banco.buscarConta(numContaSaldo);
                    if (contaSaldo != null) {
                        System.out.println("Saldo atual: " + contaSaldo.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Número da Conta: ");
                    int numContaRemover = scanner.nextInt();
                    banco.removerConta(numContaRemover);
                    break;

                case 6:
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}