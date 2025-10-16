package github;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O n�mero � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero � negativo.");
        } else {
            System.out.println("O n�mero � neutro (zero).");
        }

        entrada.close();
    }
}
