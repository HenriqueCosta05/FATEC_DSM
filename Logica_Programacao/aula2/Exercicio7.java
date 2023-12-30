package Logica_Programacao.aula2;

import javax.swing.JOptionPane;

public class Exercicio7 {
    /*
    Desafio:
   Crie um programa para calcular o IMC de um usuário.
     */
    public static void main(String[] args) {
        String peso_str = JOptionPane.showInputDialog("Digite seu peso, em kg: ");
        String altura_str = JOptionPane.showInputDialog("Digite sua altura, em m: ");
        double Peso = Double.parseDouble(peso_str);
        double Altura = Double.parseDouble(altura_str);

       double Imc = Peso / Math.pow(Altura, 2);

       if (Imc < 18.5) {
           System.out.println("O seu IMC é: " + Imc + " e, portanto, você está abaixo do peso.");
       }

       else if (Imc > 18.5 && Imc < 25.0) {
           System.out.println("O seu IMC é: " + Imc + " e, portanto, você possui um peso normal.");
       }
       else if (Imc > 25.0) {
           System.out.println("O seu IMC é: " + Imc + "e, portanto, você está acima do peso.");
       }

    }
}
