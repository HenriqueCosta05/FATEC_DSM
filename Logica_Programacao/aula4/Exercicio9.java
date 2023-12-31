package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio9 {
     public static void main(String[] args) {
        /*
        Faça um programa que leia cinco números e
        informe a soma e a média dos números.
         */
        Scanner input = new Scanner(System.in);
        int soma =0;
        int divisor = 0;
        float media;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o número desejado!");
            int Numero = input.nextInt();
            divisor++;
            soma += Numero;
        }
        media = soma / divisor;
        System.out.println("A soma entre os cinco números é: " + soma);
        System.out.println("A média dos números é: " + media);


    }
}
