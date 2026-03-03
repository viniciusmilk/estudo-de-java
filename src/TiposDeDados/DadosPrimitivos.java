package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /**
         * Tipos de dados primitivos em Java:
         * - byte: 8 bits, valores de -128 a 127
         * - short: 16 bits, valores de -32.768 a 32.
         * - int: 32 bits, valores de -2.147.483.648 a 2.147.483.647
         * - long: 64 bits, valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
         * - float: 32 bits, números de ponto flutuante de precisão simples
         * - double: 64 bits, números de ponto flutuante de precisão dupla
         * - char: 16 bits, representa um único caractere Unicode
         * - boolean: 1 bit, representa um valor verdadeiro (true) ou falso (false)
         */

        int idade = 25; // int
        double altura = 1.75; // double
        char letra = 'N'; // char
        boolean vivoOuMorto = true; // boolean
        Long saldoBancario = 999999L; // long
        System.out.println("Saldo bancário: " + saldoBancario);
    }
    
}