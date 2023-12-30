package Logica_Programacao.aula1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declaração de variáveis
        System.out.println("Digite a soma total dos salários das 50 pessoas entrevistadas: ");
        float total_salarios = scan.nextFloat();
        System.out.println("Digite a quantidade de mulheres entrevistadas, entre essas 50 pessoas: ");
        int total_mulheres = scan.nextInt();
        System.out.println("Digite a quantidade de homens entrevistados, entre essas 50 pessoas: ");
        int total_homens = scan.nextInt();

        //Operação
        System.out.println("A quantidade de mulheres entrevistadas foi: " + total_mulheres + " e, a de homens, " + total_homens + ". A soma do salário total de todos os entrevistados é: " + total_salarios);
        scan.close();
    }
}
