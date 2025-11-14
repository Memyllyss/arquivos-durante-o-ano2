package vetores;

import java.util.Scanner;

public class Exc1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], cont, b[], elemento, contB;

		a = new int[20];
		b = new int[20];

		elemento = 1;

		for (cont = 0; cont < 20; cont++) {

			System.out.println("Digite o valor do " + elemento + "º elemento armazenado no vetor A");
			elemento++;
			a[cont] = entrada.nextInt();

		}

		System.out.println("\n--- Vetor B ---");

		contB = 0;

		for (cont = 0; cont < 20; cont++) {

			if (a[cont] % 2 == 0) {
				b[contB] = a[cont] + 0;

				System.out.println(contB + "° - " + b[contB] + " - Par");
				contB++;

			}
		}

		if (contB < 20) {

			for (cont = 0; cont < 20; cont++) {

				if (a[cont] % 2 == 1) {
					b[contB] = a[cont] + 0;

					System.out.println(contB + "° - " + b[contB] + " - Impar");
					contB++;

				}

			}

		}
		entrada.close();
	}
}
