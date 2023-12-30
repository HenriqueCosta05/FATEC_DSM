package Logica_Programacao.aula2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14;
        System.out.println("Digite o raio: ");
        int raio = scan.nextInt();
        double volume = PI * Math.pow(raio, 3);

        System.out.println("O volume do círculo é: " + volume);
        scan.close();
    }
}
