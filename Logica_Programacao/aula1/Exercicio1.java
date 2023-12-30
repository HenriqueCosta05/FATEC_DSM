package Logica_Programacao.aula1;

import javax.swing.JOptionPane;

    public class Exercicio1 {
    public static void main(String[]args){
        String strN1, strN2;
        float fltN1, fltN2, fltResultado;

        strN1= JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        strN2= JOptionPane.showInputDialog(null, "Digite o segundo valor: ");

        fltN1= Float.parseFloat(strN1);
        fltN2= Float.parseFloat(strN2);

        fltResultado= fltN1 + fltN2;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + fltResultado);
    }
    }