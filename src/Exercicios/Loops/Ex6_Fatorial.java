package Exercicios.Loops;

import java.util.Scanner;

/* 
 * faça um programa que caucule o fatorial de um numero inteiro fornecido pelo usuario.
 * ex.: 5! = 5 X 4 X 3 X 2 X 1 = 120
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para ver o fatorial: ");
        int fatorial = input.nextInt();

        int multiplicador = 1;

        System.out.println(fatorial + " ! = ");

        for (int i = fatorial; i >= 1; i--) {
            multiplicador = multiplicador * i;
        }

        System.out.println(multiplicador);
    }
}
