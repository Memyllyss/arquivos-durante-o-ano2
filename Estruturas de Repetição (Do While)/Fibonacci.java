package github;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos termos da série de Fibonacci deseja ver: ");
        int n = entrada.nextInt();

        int a = 1;
        int b = 1;
        int contador = 1;

        System.out.print("Série de Fibonacci: ");

        do {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        } while (contador <= n);

        entrada.close();
    }
}
