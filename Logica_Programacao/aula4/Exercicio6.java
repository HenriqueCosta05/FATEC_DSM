package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        /*
        Faça um programa para montar a tabela de
        multiplicação de números de 1 a 10,
        segundo a tabuada que o usuário escolher.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        int NumeroInicial = input.nextInt();

        //Estrutura para a montagem da tabuada:
        for (int i = 1; i<=10; i++) {
            int Numero = NumeroInicial * i;
            System.out.println(Numero);
        }
    }
}
