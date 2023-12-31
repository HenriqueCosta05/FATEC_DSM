package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Faça um programa para imprimir uma agenda diária,
         * com horários a cada 15 minutos.
         */
        System.out.println("Digite a hora de início da agenda: ");
        int horaInicial = input.nextInt();
        System.out.println("Digite a hora final da agenda: ");
        int horaFinal = input.nextInt();

        // Condicional para manter horários entre 0 e 23.
        while ((horaInicial < 0) || (horaInicial > 23) || (horaFinal < 0) || (horaFinal > 23)) {
            System.out.println("Esperados valores entre 0 e 23. Tente novamente: digite o horário inicial:");
            horaInicial = input.nextInt();
            System.out.println("Agora, digite o último horário:");
            horaFinal = input.nextInt();
        }
        // Estrutura para o usuário trocar os valores entre as horas final e inicial,
        // caso a primeira seja maior que a segunda.
        while (horaFinal < horaInicial) {
            System.out.println("Digite a hora inicial, um valor menor que a hora final: ");
            horaInicial = input.nextInt();
            System.out.println("Digite a hora final, um valor maior que o inserido acima: ");
            horaFinal = input.nextInt();
        }
        while (horaInicial < horaFinal) {
            System.out.println(horaInicial + "h00min");
            System.out.println(horaInicial + "h15min");
            System.out.println(horaInicial + "h30min");
            System.out.println(horaInicial + "h45min");
            horaInicial++;
        }
        System.out.println(horaFinal + "h00min");
    }
}
