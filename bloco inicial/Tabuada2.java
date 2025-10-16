package github;

import java.util.Scanner;

public class Tabuada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = entrada.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        entrada.close();
    }
}
