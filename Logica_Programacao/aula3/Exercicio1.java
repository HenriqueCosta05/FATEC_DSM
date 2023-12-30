package Logica_Programacao.aula3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Fazer uma calculadora simples, onde o usuário deve digitar
        dois números e depois decidir a operação entre esses números
        (adição, subtração, multiplicação ou divisão).
         */
        Scanner entradaUsuario = new Scanner(System.in);
        //Passo 1: Declarar as variáveis:
        double numero1, numero2, resultado;
        int opcao;

        //Passo 2: Fazer com que o usuário insira os dois números, sendo o segundo diferente de zero.
        System.out.println("Insira o primeiro número.");
        numero1 = entradaUsuario.nextDouble();

        System.out.println("Insira o segundo número.");
        numero2 = entradaUsuario.nextDouble();

        //Passo 3: Fazer com que o usuário escolha a operação a ser realizada.
        System.out.println("Escolha a operação: (1) Adição, (2) Subtração, (3) Multiplicação ou (4) Divisão.");
        opcao = entradaUsuario.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Você escolheu (1) Adição e seu resultado é: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Você escolheu (2) Subtração e seu resultado é: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Você escolheu (3) Multiplicação e seu resultado é: " + resultado);
                break;

            case 4:
                while (numero2 == 0) {
                System.out.println("Insira outro número. ");
                numero2 = entradaUsuario.nextDouble();
            }
                resultado = numero1 / numero2;
                System.out.println("Você escolheu (4) Divisão e seu resultado é: " + resultado);
                break;

            default:
                System.out.println("Escolha a operação: (1) Adição, (2) Subtração, (3) Multiplicação ou (4) Divisão.");
                opcao = entradaUsuario.nextInt();
        }
        entradaUsuario.close();
    }
}
