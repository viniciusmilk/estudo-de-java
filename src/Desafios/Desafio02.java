package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        // cria um objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Bem vindo ao sistema de cadastro de ninjas da aldeia da folha! ---");
        System.out.println("Quantos ninjas você quer cadastrar?");

        // lê a quantidade máxima de ninjas que serão armazenados
        int capacidade = scanner.nextInt();
        String[] ninjas = new String[capacidade];

        // total de ninjas atualmente cadastrados (conta somente entradas não nulas)
        int totalCadastrados = 0;

        // menu principal: continua até o usuário digitar 0
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Deletar Ninja");
            System.out.println("0 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // verifica se ainda há espaço no array (considerando deleções)
                    if (totalCadastrados >= ninjas.length) {
                        System.out.println("Limite de ninjas atingido!");
                    } else {
                        System.out.print("Digite o nome do ninja: ");
                        String nome = scanner.next();

                        // procura a primeira posição livre (null) para reutilizar
                        int posInsercao = -1;
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null) {
                                posInsercao = i;
                                break;
                            }
                        }
                        // fallback (não deve ocorrer) coloca na posição totalCadastrados
                        if (posInsercao == -1)
                            posInsercao = totalCadastrados;

                        ninjas[posInsercao] = nome; // armazena na posição encontrada
                        totalCadastrados++; // atualiza o contador de elementos válidos
                        System.out.println("Ninja cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\nNinjas cadastrados:");
                    // percorre o array e exibe apenas os elementos não nulos
                    if (totalCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null) {
                                System.out.println(" - " + ninjas[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do ninja a ser deletado: ");
                    String nomeDeletar = scanner.next();
                    boolean encontrado = false;
                    // percorre o array para encontrar o ninja a ser deletado
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null && ninjas[i].equals(nomeDeletar)) {
                            ninjas[i] = null; // remove o ninja do array
                            encontrado = true;
                            totalCadastrados--; // atualiza o contador ao remover
                            System.out.println("Ninja deletado com sucesso!");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Ninja não encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        // fecha o scanner para liberar recursos
        scanner.close();
    }
}
