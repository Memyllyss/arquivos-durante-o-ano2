package vetores;

import java.util.Scanner;

public class Exc8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], b[], cont, s, j, soma;

		a = new int[10];
		b = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("Digite o " + s + "° valor do elemento do vetor A");
			a[cont] = entrada.nextInt();
		}

		System.out.println(" ");

		for (cont = 0; cont < 10; cont++) {

			soma = 0;

			for (j = cont; j < 10; j++) {
				soma = soma + a[j];
			}

			b[cont] = soma;
		}

		System.out.println("\n--- Vetor B (Resultado dos Somatórios) ---");
		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println(s + "° (B[" + cont + "]) = " + b[cont]);
		}

		entrada.close();
	}
}