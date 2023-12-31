package Logica_Programacao.aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor investido :");
        double valorInvestido = input.nextDouble();
        System.out.println("Digite a taxa de juros (em decimal): ");
        double taxaJuros = input.nextDouble();

        //Passo b: O programa deve informar o saldo do...
        for(int i = 1; i <= 12; i++) {
            double somaValorInvestido = valorInvestido * taxaJuros;
            valorInvestido += somaValorInvestido;
            System.out.println("Valor investido no mês " + i + ": " + Math.round(valorInvestido));

        }
    }
}
