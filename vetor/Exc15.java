package vetores;

import java.util.Scanner;

public class Exc15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], b[], c[], s, cont;

		a = new int[10];
		b = new int[10];
		c = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("digite " + s + "° valor do  elemento do vetor A");
			a[cont] = entrada.nextInt();

			System.out.println("digite " + s + "° valor do  elemento do vetor B");
			b[cont] = entrada.nextInt();

			if (a[cont] > b[cont]) {
				c[cont] = 1;
			} else if (a[cont] < b[cont]) {
				c[cont] = -1;
			} else {
				c[cont] = 0;
			}

			System.out.println("O " + s + "° elemento do vetor C é " + c[cont]);
		}
		entrada.close();
	}
}
