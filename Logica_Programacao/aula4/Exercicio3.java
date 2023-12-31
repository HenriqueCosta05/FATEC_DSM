package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Faça um programa que imprime a soma de todos os números
        pares entre dois números quaisquer digitados pelo usuário,
        incluindo-os.
         */

        int resultado = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o menor número do intervalo.");
        int menorNumero = input.nextInt();
        System.out.println("Digite o maior número do intervalo.");
        int maiorNumero = input.nextInt();
        int soma = 0;
        int impares = 0; //Criada apenas para armazenar os números ímpares, de forma a não alterar o resultado.
        while (menorNumero <= maiorNumero){
            if (menorNumero % 2 == 0) {
                soma = soma + menorNumero;
                menorNumero = menorNumero + 2;
            }
            else {
                soma = soma + impares;
            }
        }
        System.out.println("O somatório dos números pares é: " + soma);
        }
}
