package Exercicios.Loops;

import java.util.Scanner;

/*
 * faça um programa que leia 5 numeros
 * e informe o maior numero
 * e a media dos numero
 */
public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = input.nextInt();

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            count++;
        } while (count <= 5);

        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A media dos numeros digitados foi: " + soma / 5);

    }

}
