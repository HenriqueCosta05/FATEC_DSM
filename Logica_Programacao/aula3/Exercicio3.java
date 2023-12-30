package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Estacao = "";
        System.out.println("Digite o número (1-12) do mês do ano:");
        int mes = input.nextInt();

        switch (mes) {
            case 1: Estacao = "Verão"; break;
            case 2: Estacao = "Verão"; break;
            case 3: Estacao = "Outono"; break;
            case 4: Estacao = "Outono"; break;
            case 5: Estacao = "Outono"; break;
            case 6: Estacao = "Inverno"; break;
            case 7: Estacao = "Inverno"; break;
            case 8: Estacao = "Inverno"; break;
            case 9: Estacao = "Primavera"; break;
            case 10: Estacao = "Primavera"; break;
            case 11: Estacao = "Primavera"; break;
            case 12: Estacao = "Verão"; break;
        }
        System.out.println("A estação deste mês é: " + Estacao);
        input.close();
    }
}
