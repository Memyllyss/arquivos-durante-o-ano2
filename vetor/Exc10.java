package vetores;

import java.util.Scanner;

public class Exc10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], b[], c[], cont, s, contC;

		a = new int[10];
		b = new int[10];
		c = new int[10];

		contC = 0;

		for (cont = 0; cont < 10; cont++) {

			s = cont + 1;

			System.out.println("digite " + s + "° valor do  elemento do vetor A");
			a[cont] = entrada.nextInt();

			System.out.println("digite " + s + "° valor do  elemento do vetor B");
			b[cont] = entrada.nextInt();

			System.out.println(" ");
		}

		for (cont = 0; cont < 10; cont++) {

			if (a[cont] == b[cont]) {

			} else if (a[cont] < b[cont]) {
				c[contC] = a[cont];

			} else {
				c[cont] = a[cont];
				contC++;

			}

		}

		System.out.println("/n---- Vetor C -----");
		for (contC = 0; contC < 10; contC++) {
			System.out.println(contC + "° elemento - " + c[contC]);
		}
		entrada.close();

	}
}
