package vetores;

import java.util.Scanner;

public class Exc14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], b[], cont, f, i, s, ex;

		a = new int[10];
		b = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("digite " + s + "° valor do  elemento do vetor");
			a[cont] = entrada.nextInt();

			if (a[cont] % 2 == 0) {
				b[cont] = 1;
			}
			System.out.println("O " + s + "° valor do elemento do vetor B é " + b[cont]);
			System.out.println(" ");

		}
		entrada.close();
	}
}
