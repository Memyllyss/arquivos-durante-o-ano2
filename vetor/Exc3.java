package vetores;

import java.util.Scanner;

public class Exc3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont, v, text, s, a[];

		a = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("Digite o " + s + "° valor do elemento do vetor");
			a[cont] = entrada.nextInt();
		}

		System.out.println("\n--- Verificando Primos ---");

		for (cont = 0; cont < 10; cont++) {

			text = 0;

			int numeroAtual = a[cont];

			if (numeroAtual <= 1) {
				text = 1;
			} else {
				v = numeroAtual - 1;
				while (v > 1) {
					if (numeroAtual % v == 0) {
						text++;
						break;
					}
					v--;
				}
			}

			if (text == 0) {
				System.out.println(numeroAtual + " - Seu numero é primo");
			} else {
				System.out.println(numeroAtual + " - Seu numero não é primo");
			}
		}

		entrada.close();
	}
}