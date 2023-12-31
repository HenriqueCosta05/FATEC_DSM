package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio4 {
      /*
    Faça um programa para calcular o fatorial de um número
    qualquer inteiro positivo digitado pelo usuário.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Número inteiro positivo: ");
        int Numero = input.nextInt();
        int fatorial = 1;

        while (Numero > 0) {
            fatorial = fatorial * Numero;
            Numero--;
        }
        System.out.println("O fatorial deste número é: " + fatorial);
    }
}
