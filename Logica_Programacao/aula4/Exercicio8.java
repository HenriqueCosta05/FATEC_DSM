package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Faça um programa que leia cinco números e informe
        o maior número.
         */
        int maior = 0;
        int segundoMaior = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int Numero = input.nextInt();

            if(Numero > maior) {
                segundoMaior = maior;
                maior = Numero;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
