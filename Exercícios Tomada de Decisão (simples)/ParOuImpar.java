package github;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O n�mero � par.");
        } else {
            System.out.println("O n�mero � �mpar.");
        }

        entrada.close();
    }
}

