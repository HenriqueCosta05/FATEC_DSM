package Logica_Programacao.aula1;

import javax.swing.JOptionPane;

public class Exercicio5 {
      public static void main(String[] args) {
        /*
        Crie um algoritmo para transformar uma velocidade fornecida em m/s pelo usuário
        para km/h. OBS: para isso, multiplicar a velocidade por 3,6.
         */
        String velocidade_str;
        double velocidade;
        velocidade_str = JOptionPane.showInputDialog ("Digite a velocidade em m/s");
        velocidade = Double.parseDouble(velocidade_str);
        velocidade = velocidade*3.6;
        JOptionPane.showMessageDialog(null, "A velocidade, em km/h, é: " + velocidade);
    }
}
