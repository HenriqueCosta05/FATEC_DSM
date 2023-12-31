package Logica_Programacao.aula6;

import java.util.Scanner;

public class Exercicio2 {
     public static void main(String[] args) {
        Scanner Temperatura = new Scanner(System.in);
        System.out.println("Digite a Temperatura a ser convertida, inicialmente em Celsius.");
        double temperaturaCelsius = Temperatura.nextDouble();

        //Conversão para Kelvin.
        double temperaturaKelvin = temperaturaCelsius + 273.15;

        //Conversão para Réaumur.
        double temperaturaReaumur = (temperaturaCelsius * 0.8);

        //Conversão para Rankine.
        double temperaturaRankine = temperaturaCelsius * 1.8 + 32 + 459.7;

        //Conversão para Fahreinheint.
        double temperaturaFahreinheint = temperaturaCelsius * 1.8 + 32;
    
        //Impressão dos Valores.
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
        System.out.println("A temperatura em Fahreinheint é: " + temperaturaFahreinheint);
        System.out.println("A temperatura em Kelvin é: " + temperaturaKelvin);
        System.out.println("A temperatura em Réaumur é: " + temperaturaReaumur);
        System.out.println("A temperatura em Rankine é: " + temperaturaRankine);

        Temperatura.close();
    }
}
