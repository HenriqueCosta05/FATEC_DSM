package Logica_Programacao.aula6;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /* 
         Tem-se um conjunto de dados contendo a altura e o sexo 
         de 10 pessoas. Fazer um algoritmo que calcule e escreva:

         a. A maior e menor altura do grupo.
         b. média de altura dos homens.
         c. o número de mulheres.
         */
         Scanner dados = new Scanner(System.in);
         double maiorAltura = 0.0;
         double menorAltura = 0.0;
         double antigaAltura = 0.0;
         double mediaAlturaH, somaAlturaH = 0.0;
         int Mulheres = 0;
         int Homens = 0;
         String Sexo;

         for(int i = 1; i<= 5; i++) {
            System.out.println("Digite a altura da pessoa " + i);
            Double Altura = dados.nextDouble();
            System.out.println("Digite o sexo da pessoa (M) para Masculino ou (F) para Feminino " + i);
            Sexo = dados.next();
            if (Sexo.equalsIgnoreCase("M")) {
                Homens++;
                somaAlturaH += Altura;
             } 
             else if (Sexo.equalsIgnoreCase("F")) {
                Mulheres++;
             } 
             if (Altura > antigaAltura) {
               maiorAltura = Altura;
               antigaAltura = menorAltura;
            }
            else {
            maiorAltura = antigaAltura;
            menorAltura = Altura;
         } 
         }
         System.out.println("A menor altura do grupo é " + menorAltura  + " e a maior, " + maiorAltura);
         System.out.println("A média de altura dos homens é: " + (somaAlturaH)/Homens);
         System.out.println("O número de mulheres é: " + Mulheres);
         dados.close();
        }

}
