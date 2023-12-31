package Logica_Programacao.aula4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Faça um programa que tenha uma constante armazenando um dado
        caractere que representa uma senha de acesso a um sistema. O
        programa deverá ler um dado caractere correspondente a uma
        senha e comparar com o valor da constante. Se a senha estiver
        correta, imprimir "acesso liberado"; caso contrário, solioitar
        novamente a digitação da senha, mas possibilitando apenas três
        tentativas.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Defina sua senha: ");
        String SENHA = input.next();
        String SENHAS = "";

        for (int i=0; i<=3; i++) {
            System.out.println("Digite sua senha: ");
             SENHAS = input.next();
            if (SENHA.equalsIgnoreCase(SENHAS)) {
                System.out.println("Senha correta, acesso liberado.");
                break;
            } else {
                System.out.println("Senha incorreta.");
            }
        }
        if (!SENHA.equalsIgnoreCase(SENHAS)) {
            System.out.println("Você excedeu o número de senhas.");
        }
        }
}
