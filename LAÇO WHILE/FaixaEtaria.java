package github;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int contador = 1;

        while (contador <= 10) {
            System.out.print("Digite a idade da pessoa " + contador + ": ");
            int idade = entrada.nextInt();

            if (idade <= 15) faixa1++;
            else if (idade <= 30) faixa2++;
            else if (idade <= 45) faixa3++;
            else if (idade <= 60) faixa4++;
            else faixa5++;

            contador++;
        }

        System.out.println("Até 15 anos: " + faixa1 + " pessoas (" + (faixa1 * 10) + ")");
        System.out.println("De 16 a 30 anos: " + faixa2 + " pessoas (" + (faixa2 * 10) + ")");
        System.out.println("De 31 a 45 anos: " + faixa3 + " pessoas (" + (faixa3 * 10) + ")");
        System.out.println("De 46 a 60 anos: " + faixa4 + " pessoas (" + (faixa4 * 10) + ")");
        System.out.println("Acima de 61 anos: " + faixa5 + " pessoas (" + (faixa5 * 10) + ")");

        entrada.close();
    }
}
