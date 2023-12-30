package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor total da compra: ");
        double valorCompra = scan.nextDouble();
        System.out.println("Insira a sua relação com a loja pela seguinte nomenclatura: (1) Cliente comum, (2) Funcionário ou (3) Cliente vip: ");
        int tipoCliente = scan.nextInt();

        if (tipoCliente == 1) {
            System.out.println("O valor da compra foi: " + valorCompra + " , o que corresponde a 100% do valor total.");
        }
        else if (tipoCliente == 2) {
            double valorPago = 0.9 * valorCompra;
            System.out.println("O valor da compra foi: " + valorPago + " , o que corresponde a um desconto de 10%, como funcionário da empresa.");
        }
        else if (tipoCliente == 3) {
            double valorPago = 0.95 * valorCompra;
            System.out.println("O valor da compra foi: " + valorPago + " , o que corresponde a um desconto de 5% como cliente vip!");
        }
        scan.close();
    }
}
