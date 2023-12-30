package Logica_Programacao.aula2;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
         String str_n1 = JOptionPane.showInputDialog("Digite a n1: ");
         String str_n2 = JOptionPane.showInputDialog("Digite a n2: ");
         double N1 = Double.parseDouble(str_n1);
         double N2 = Double.parseDouble(str_n2);
         double Media = ((2.5 * N1) + (4.5 * N2)) / 7;
        System.out.println("A média do aluno é: " + Media);

    }
}
