package Exercicios.Loops;

import java.util.Scanner;

/*
faça um programa que peça uma nota, entre zero e dez.
Mostre uma mnesagem caso o valor seja invalido e continue pedindo até que o usuario informe um valor valido
*/

public class Ex2_nota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = input.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida, digite novamente: ");
            nota = input.nextInt();
        }
    }

}