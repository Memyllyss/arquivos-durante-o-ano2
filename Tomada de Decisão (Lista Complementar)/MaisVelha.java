package github;

import java.util.Scanner;

public class MaisVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade da primeira pessoa: ");
        int idade1 = entrada.nextInt();

        System.out.print("Idade da segunda pessoa: ");
        int idade2 = entrada.nextInt();

        if (idade1 > idade2) {
            System.out.println("A primeira pessoa é mais velha com " + idade1 + " anos.");
            System.out.println("A segunda pessoa é mais nova com " + idade2 + " anos.");
        } else if (idade2 > idade1) {
            System.out.println("A segunda pessoa é mais velha com " + idade2 + " anos.");
            System.out.println("A primeira é mais nova com " + idade1 + " anos.");
        } else {
            System.out.println("Ambos têm a mesma idade: " + idade1 + " anos.");
        }

        entrada.close();
    }
}

