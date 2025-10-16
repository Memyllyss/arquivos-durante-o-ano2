package github;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = entrada.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = entrada.nextInt();

        int i = 1;
        int resultado = 1;

        do {
            resultado *= base;
            i++;
        } while (i <= expoente);

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        entrada.close();
    }
}
