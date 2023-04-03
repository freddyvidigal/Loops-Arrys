package Exercicios.Loops;
/*
faça um programa que leia conjunto de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade.
(para inserir o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;

            /*
             * System.out.println("Nome: ");
             * nome = scan.nextLine();
             * 
             * System.out.println("Idade: ");
             * idade = scan.nextInt();
             */

            while (true) {
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0"))
                    break;

                System.out.println("Idade: ");
                idade = scan.nextInt();
            }

            System.out.println("continua");

    }

}