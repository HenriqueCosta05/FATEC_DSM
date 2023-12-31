package Logica_Programacao.aula5;

import java.util.Scanner;

public class Exercicio3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome de usuário: ");
        String usuario = input.next();
        System.out.println("Digite uma senha: ");
        String senha = input.next();

        while (usuario.equals(senha)) {
            System.out.println("Digite uma senha diferente do usuário: ");
            senha = input.next();
        }
        System.out.println("Seu nome de usuário é: " + usuario + " e sua senha é: " + senha);
    }
}
