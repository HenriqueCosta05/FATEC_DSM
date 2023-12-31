package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio7 {
     public static void main(String[] args) {
        /*
        Faça um programa para listar todos os divisores
        de um número ou dizer que o número é primo caso
        não existam divisores. Ao final, verifique se o
        usuário deseja analisar outro número.
         */
        Scanner input = new Scanner(System.in);
        int qtdNumeros = 0;
        System.out.print("Digite o Número desejado: ");
        int Numero = input.nextInt();

        for (int i = 1; i <= Numero; i++) {
            if (Numero % i != 0) {
                continue;
            } else {
                System.out.println(i);
                qtdNumeros++;
            }
        }
        if (qtdNumeros <= 2) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo e a quantidade de divisores é: " + qtdNumeros);
        }
        System.out.println("Deseja analisar outro número? Digite (1) caso afirmativo ou (0) caso não queira.");
        int opcao = input.nextInt();
        switch (opcao) {
            case 0: System.out.println("Programa encerrado."); break;
            case 1:
                System.out.println("Digite o número desejado: ");
                Numero = input.nextInt();
                //CTRL+V da estrutura de repetição.
                qtdNumeros = 0;
                for (int i = 1; i <= Numero; i++) {
                    if (Numero % i != 0) {
                        continue;
                    } else {
                        System.out.println(i);
                        qtdNumeros++;
                    }
                }
                if (qtdNumeros <= 2) {
                    System.out.println("O número é primo.");
                } else {
                    System.out.println("O número não é primo e a quantidade de divisores é: " + qtdNumeros);
                    System.out.println("Programa Encerrado.");
                }
        }
    }
}
