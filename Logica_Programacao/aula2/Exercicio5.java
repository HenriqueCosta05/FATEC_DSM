package Logica_Programacao.aula2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distância percorrida pelo veículo: ");
        int distancia = scan.nextInt();
        System.out.println("Digite o total de litros de combustível consumidos: ");
        double consumoLitros = scan.nextDouble();

        double consumoMedio = distancia / consumoLitros;
        System.out.println("O consumo médio é de "+ consumoMedio + " quilômetros por litro.");
        scan.close();
    }
}
