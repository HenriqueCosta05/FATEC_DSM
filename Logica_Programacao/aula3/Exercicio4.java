package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String diaRodizio = "";
        System.out.println("Digite o número final da sua placa: ");
        int placaFinal = scan.nextInt();

        switch (placaFinal) {
            case 1: diaRodizio = "Segunda-feira"; break;
            case 2: diaRodizio = "Segunda-feira"; break;
            case 3: diaRodizio = "Terça-feira"; break;
            case 4: diaRodizio = "Terça-feira"; break;
            case 5: diaRodizio = "Quarta-feira"; break;
            case 6: diaRodizio = "Quarta-feira"; break;
            case 7: diaRodizio = "Quinta-feira"; break;
            case 8: diaRodizio = "Quinta-feira"; break;
            case 9: diaRodizio = "Sexta-feira"; break;
            case 0: diaRodizio = "Sexta-feira"; break;
        }
        System.out.println("O dia do rodízio de seu carro é: " + diaRodizio);
        scan.close();
    }
}
