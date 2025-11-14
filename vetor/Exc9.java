package vetores;

import java.util.Scanner;

public class Exc9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contC, cont, s, ai, bf, a[], b[], c[];

		a = new int[10];
		b = new int[10];
		c = new int[10];

		contC = 0;

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;

			System.out.println("digite " + s + "° valor do elemento do vetor A");
			a[cont] = entrada.nextInt();

			System.out.println("digite " + s + "° valor do elemento do vetor B");
			b[cont] = entrada.nextInt();

			System.out.println(" ");
		}

		for (ai = 0; ai < 10; ai++) {

			for (bf = 0; bf < 10; bf++) {

				if (a[ai] == b[bf]) {

					c[contC] = a[ai];
					contC++;

					break;
				}
			}
		}

		System.out.println("\n--- Interseção (Vetor C) ---");

		if (contC == 0) {
			System.out.println("Nenhum elemento em comum encontrado");
		} else {

			for (ai = 0; ai < contC; ai++) {
				s = ai + 1;
				System.out.println("O valor do " + s + "º elemento do vetor C é: " + c[ai]);
			}
		}

		entrada.close();
	}
}