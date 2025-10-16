package github;

import java.util.Scanner;

public class IdadeMaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int nascimento = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int atual = entrada.nextInt();

        int idade = atual - nascimento;

        System.out.println("Idade: " + idade + " anos");

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        entrada.close();
    }
}

