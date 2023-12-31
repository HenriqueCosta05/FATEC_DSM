package Logica_Programacao.aula5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        while(nome.length() < 3) {
            System.out.println("Digite outro nome, com três ou mais caracteres: ");
            nome = input.next();
        }

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        while ((idade < 0 ) || (idade > 150)) {
            System.out.println("Digite uma idade entre 0 e 150 anos: ");
            idade = input.nextInt();
        }

        System.out.println("Digite seu salário: ");
        double salario = input.nextDouble();

        while (salario <= 0) {
            System.out.println("Digite um salário válido (maior que zero). ");
            salario = input.nextDouble();
        }

        System.out.println("Digite o seu sexo: (m ou M) para masculino ou (f ou F) para feminino.");
        String sexo = input.next();

        while ((!sexo.equalsIgnoreCase("M") || (!sexo.equalsIgnoreCase("F")))){
            System.out.println("Digite novamente para confirmar: (esse será o definitivo) ");
                sexo = input.next();
                if (sexo.equalsIgnoreCase("m")) {
                    sexo = "Masculino";
                }
           else if (sexo.equalsIgnoreCase("f")) {
                sexo = "Feminino";
            }
           else {
               sexo = " ";
                }
                break;
        }

        System.out.println("Digite o seu estado civil: (s ou S) para solteiro(a) (c ou C) para casado(a), (v ou V) para viúvo(a) ou (d ou D) para divorciado(a)");
        String estadoCivil = input.next();

            estadoCivil = input.next();
            if (estadoCivil.equalsIgnoreCase("s") && (sexo.equalsIgnoreCase("feminino"))) {
                estadoCivil = "Solteira";
            }
            if (estadoCivil.equalsIgnoreCase("s") && (sexo.equalsIgnoreCase("masculino"))) {
                estadoCivil = "Solteiro";
            }
            if (estadoCivil.equalsIgnoreCase("c") && (sexo.equalsIgnoreCase("feminino"))) {
                estadoCivil = "Casada";
            }
            if (estadoCivil.equalsIgnoreCase("c") && (sexo.equalsIgnoreCase("masculino"))) {
                estadoCivil = "Casado";
            }
            if (estadoCivil.equalsIgnoreCase("v") && (sexo.equalsIgnoreCase("feminino"))) {
                estadoCivil = "Viúva";
            }
            if (estadoCivil.equalsIgnoreCase("v") && (sexo.equalsIgnoreCase("masculino"))) {
                estadoCivil = "Viúvo";
            }
            if (estadoCivil.equalsIgnoreCase("d") && (sexo.equalsIgnoreCase("feminino"))) {
                estadoCivil = "Divorciada";
            }
            if (estadoCivil.equalsIgnoreCase("d") && (sexo.equalsIgnoreCase("masculino"))) {
                estadoCivil = "Divorciado";
            }

        System.out.println("O seu nome é: " + nome + ", sua idade, " + idade + ", seu salário, " + salario + ", seu sexo, " + sexo + " e, seu Estado civil, " + estadoCivil);
    }
}
