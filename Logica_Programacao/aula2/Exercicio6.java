package Logica_Programacao.aula2;

import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahreinheit: ");
        double temperaturafahreinheit = scan.nextDouble();

        double temperaturaCelsius = (temperaturafahreinheit - 32) * 0.56;
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
        scan.close();
    }
}
