package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxaNatalidade, taxaMortalidade;
        System.out.println("Insira o número de nascimentos de um determinado período. ");
        int numeroNascimentos = scan.nextInt();
        System.out.println("Agora, insira o número de óbitos de um determinado período. ");
        int numeroObitos = scan.nextInt();
        System.out.println("Em seguida, insira o número de habitantes desse período. ");
        int numeroHabitantes = scan.nextInt();
        System.out.println("Digite a estatística desejada: (1) Taxa de Natalidade ou (2) Taxa de Mortalidade.");
        int taxa = scan.nextInt();
        switch (taxa) {
            case 1: taxaNatalidade = ((numeroNascimentos * 1000) / numeroHabitantes);
                System.out.println("A taxa de natalidade deste período foi: " + taxaNatalidade);
                break;
            case 2: taxaMortalidade = ((numeroObitos * 1000) / numeroHabitantes);
                System.out.println("A taxa de mortalidade deste período foi: " + taxaMortalidade);
        }
        scan.close();
    }
}
