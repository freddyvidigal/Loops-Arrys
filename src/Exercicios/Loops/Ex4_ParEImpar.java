package Exercicios.Loops;

import java.util.Scanner;

/* 
 Faça um programa que peçaN numeros inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantNumero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Digite a quantidade de numeros que deseja digitar: ");
        quantNumero = input.nextInt();

        int count = 0;
        do {
            System.out.println("Digite um numero: ");
            int numero = input.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++; /*
                                 * {
                                 * System.out.println("O numero " + numero + " é par");
                                 * } else {
                                 * System.out.println("O numero " + numero + " é impar");
                                 * }
                                 */

            count++;

        } while (count <= quantNumero);

        System.out.println("A quantidade de numeros pares é: " + quantPares);
        System.out.println("A quantidade de numeros impares é: " + quantImpares);

    }

}
