package vetores;

import java.util.Scanner;

public class Exc11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], cont, num, valor, son, s;

		a = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("digite " + s + "° valor do  elemento do vetor");
			a[cont] = entrada.nextInt();
		}

		System.out.println(" ");

		son = 0;
		cont = 0;
		num = 0;

		while (son < 2) {
			System.out.println("Digite o valor que deseja consutar:");

			valor = entrada.nextInt();

			for (cont = 0; cont < 10; cont++) {
				if (num == a[cont]) {
					num++;

				}

			}

			if (num == 1) {
				System.out.println("Seu numero está presente no vetor");

			} else {
				System.out.println("O numero digitado não está prensente no vetor A");
			}
			cont++;

			System.out.println(" ");
			System.out.println("Deseja continuar?");
			System.out.println("1 = sim");
			System.out.println("2 = não");

			son = entrada.nextInt();
		}
		entrada.close();
	}
}
