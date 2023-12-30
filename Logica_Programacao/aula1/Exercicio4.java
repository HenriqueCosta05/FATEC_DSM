package Logica_Programacao.aula1;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        String nome, idade_str;
        int idade;
        nome = JOptionPane.showInputDialog ("Digite seu nome: ");
        idade_str = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Integer.parseInt(idade_str); //parse é um conversor de tipos de variáveis (ex: string - int).
        JOptionPane.showMessageDialog(null,"Seu nome é " + nome + " e sua idade é: " + idade);

    }

}
