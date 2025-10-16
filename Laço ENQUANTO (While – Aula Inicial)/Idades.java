package github;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont = 1;
        int maiores = 0;
        int menores = 0;

        while (cont <= 5) {
            System.out.print("Digite a idade da pessoa " + cont + ": ");
            int idade = entrada.nextInt();

            if (idade >= 18) {
                maiores++;
            } else {
                menores++;
            }

            cont++;
        }

        System.out.println("Maiores de idade: " + maiores);
        System.out.println("Menores de idade: " + menores);

        entrada.close();
    }
}
