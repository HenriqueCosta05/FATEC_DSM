package Logica_Programacao.aula5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10: ");
        int notaDesejada = input.nextInt();

        while((notaDesejada > 10) || (notaDesejada < 0)) {
            System.out.println("Nota inválida! Digite uma nota de 0 a 10: ");
            notaDesejada = input.nextInt();
        }
        System.out.println("A nota desejada é: " + notaDesejada);
    }
}
