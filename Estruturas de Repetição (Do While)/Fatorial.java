package github;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = entrada.nextInt();

        int i = numero;
        int fatorial = 1;

        do {
            fatorial *= i;
            i--;
        } while (i > 0);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        entrada.close();
    }
}

