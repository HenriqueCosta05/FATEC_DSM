package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio1 {
     /*
    Faça um programa que receba a idade de cada um dos 10 alunos
    matriculados em uma escola de ensino médio. O programa deverá
    identificar, calcular e apresentar na tela:

    a) A quantidade de alunos que podem ser eleitores, pois têm a idade mínima
    de 16 anos.

    b) A média de idade dos alunos que ainda não podem ser eleitores.
     */
    public static void main(String[] args) {
        //Passo 1: Declarar o Scanner e Variáveis
        Scanner input = new Scanner(System.in);
        int alunosEleitores = 0;
        int numeroAlunosMenores = 0;
        double mediaIdades = 0;
        int totalIdades = 0;

        //Passo 2: Requerir as idades, por meio da estrutura de repetição For:
        for(int i=1; i<=10; i++){
            System.out.println("Insira a idade do aluno: ");
            int idadeAluno = input.nextInt();

            if (idadeAluno >= 16) {
               alunosEleitores++;
            }
            else {
                totalIdades = totalIdades + idadeAluno;
                numeroAlunosMenores++;
                mediaIdades = totalIdades / numeroAlunosMenores;
            }
        }
        System.out.println("A quantidade de alunos que podem ser eleitores é: " + alunosEleitores);
        System.out.println("A média de idades dos alunos que são menores de 16 anos é: " + mediaIdades);
    }
}
