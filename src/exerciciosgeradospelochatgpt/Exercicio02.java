package exerciciosgeradospelochatgpt;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
//        Escreva um programa em Java que solicite ao usuário um número e imprima a tabuada
//        desse número de 1 a 10.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1) {
            System.out.println("Número inválido!");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
