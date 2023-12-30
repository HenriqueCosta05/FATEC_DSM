package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14;
        System.out.println("Digite o volume desejado segundo os números: (1) Cubo, (2) Paralelepípedo ou (3) Cilindro.");
        int volume = scan.nextInt();

        switch (volume) {
            case 1:
                System.out.println("Digite o lado do cubo: ");
                int ladoCubo = scan.nextInt();
                double volumeCubo = Math.pow(ladoCubo, 3);
                System.out.println("O volume do cubo desejado é: " + volumeCubo);
                break;

            case 2:
                System.out.println("Primeiramente, digite o comprimento do paralelepípedo.");
                int comprimentoP = scan.nextInt();
                System.out.println("Agora, digite a largura do paralelepípedo.");
                int larguraP = scan.nextInt();
                System.out.println("Por fim, digite a altura do paralelepípedo.");
                int alturaP = scan.nextInt();
                double volumeParalelepipedo = comprimentoP * larguraP * alturaP;
                System.out.println("O volume do paralelepípedo desejado é: " + volumeParalelepipedo);
                break;

            case 3:
                System.out.println("Digite o raio do cilindro. ");
                int raiobase = scan.nextInt();
                System.out.println("Digite a altura do cilindro. ");
                int alturacl = scan.nextInt();
                double volumeCilindro = ((Math.pow(raiobase, 2) * alturacl) * PI);
                System.out.println("O volume do cilindro desejado é: " + volumeCilindro);
        }
        scan.close();
    }
}
