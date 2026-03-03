package TiposDeDados;
import java.util.Arrays;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /**
         * Tipos de dados não primitivos em Java:
         * - String: representa uma sequência de caracteres
         * - Arrays: coleção de elementos do mesmo tipo
         * - Classes: definição de um tipo de dado personalizado
         * - Interfaces: definição de um contrato para classes implementarem
         * - Enums: tipo de dado que representa um conjunto fixo de constantes
         */

        String nome = "Naruto"; // String
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Array de inteiros
        System.out.println("Nome: " + nome.toUpperCase()); // Usando um método da classe String
        System.out.println("Números: " + Arrays.toString(numeros));
        System.out.println("Tamanho do array: " + numeros.length);
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);
    }
}
