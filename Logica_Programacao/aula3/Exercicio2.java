package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner ler = new Scanner(System.in);

        char sexo;
        double h, psIdeal;

        System.out.println("Informe o seu sexo (M/F): ");
        sexo = (char)System.in.read();

        System.out.println("Informe a sua altura (m): ");
        h = ler.nextDouble();

        if ((sexo == 'M') || (sexo == 'm'))
            psIdeal = (72.7 * h) - 58;
        else
            psIdeal = (62.1 * h) - 44.7;

        System.out.println("O Peso Ideal é: " + psIdeal + " kg.");
        ler.close();
    }
}
