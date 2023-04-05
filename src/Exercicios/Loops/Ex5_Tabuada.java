
package Exercicios.Loops;
/* 
 * desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10.
 * o usuario deve informar de qual numero ele deseja ver a tabuada.
 * a saída deve ser conforme o exemplo abaixo:
 * 
 * tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 */

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada: ");
        int tabuada = input.nextInt();

        System.out.println("Tabuada de " + tabuada + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

    }
}