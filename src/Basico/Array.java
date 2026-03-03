package Basico;

public class Array {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        /**
         * Outras formas de declarar um array:
         * int array2[] = {1, 2, 3, 4, 5};
         * int[] numeros = new int[3];
         * numeros[0] = 1;
         * numeros[1] = 2;
         * numeros[2] = 3;
         */

        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] frutas = { "Maçã", "Banana", "Laranja" };
        System.out.println("\nFrutas:");
        for (String fruta : frutas) {
            System.out.println("A fruta do dia é: " + fruta);
        }
    }
}
