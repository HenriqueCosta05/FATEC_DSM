package Logica_Programacao.aula1;

import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor unitário das peças: ");
        double valorPeca = scan.nextDouble();
        System.out.println("Digite o código da peça: ");
        String codigoPeca = scan.next();
        System.out.println("Digite a quantidade de peças: ");
        int qtdPecas = scan.nextInt();
        double valorTotal = qtdPecas * valorPeca;
        System.out.println("O valor total arrecadado é: " + valorTotal + ". Este valor refere-se à peça de código: " + codigoPeca);
        scan.close();
    }
}
