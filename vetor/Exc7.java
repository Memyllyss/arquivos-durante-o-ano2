package vetores;

import java.util.Scanner;

public class Exc7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], b[], conta, contb, e, elemento;

		a = new int[15];

		b = new int[15];
		contb = 0;

		elemento = 1;

		for (conta = 0; conta < 15; conta++) {

			e = conta + 1;
			System.out.println("Digite " + e + "° valor do  elemento do vetor");
			a[conta] = entrada.nextInt();

			System.out.println("O valor do elemento " + elemento + " do vetor A é " + a[conta]);

			b[contb] = a[conta] * a[conta];

			System.out.println("O fatorial de " + a[conta] + " guardado no vetor B é igual a: " + b[contb]);
			System.out.println(" ");

			elemento++;
		}

		entrada.close();

	}
}
