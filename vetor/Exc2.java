package vetores;

import java.util.Scanner;

public class Exc2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], cont, e, num, m, s, valor;

		a = new int[5];

		for (cont = 0; cont < 5; cont++) {
			s = cont + 1;
			System.out.println("digite " + s + "° valor do  elemento do vetor");
			a[cont] = entrada.nextInt();
		}

		for (cont = 0; cont < 5; cont++) {
			num = a[cont];

			for (m = 1; m <= 10; m++) {

				valor = num * m;

				System.out.println(a[cont] + " x " + m + " = " + valor);

			}
			System.out.println(" ");
		}
		entrada.close();

	}
}
