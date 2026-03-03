package Condicoes;

import java.util.Scanner;

public class IfEElse {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Olá, " + nome + "\nVocê tem " + idade + " anos e pode entrar a vontade.\nSeja bem-vindo.");
        } else {
            System.out.println("Olá, " + nome + "\nVocê tem " + idade + " anos e não pode entrar.");
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é um número par.");
            } else {
                System.out.println(i + " é um número ímpar.");
            }
        }
        
    }
}
