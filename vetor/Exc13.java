package vetores;

import java.util.Scanner;

public class Exc13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[], cont, f, i, s, ex;

		a = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("digite " + s + "° valor do elemento do vetor");
			a[cont] = entrada.nextInt();
		}

		ex = 0;

		for (i = 0; i < 5; i++) {

			f = 9 - i;

			if (a[i] == a[f]) {

				ex++;
			}
		}

		if (ex == 5) {
			System.out.println("Os numeros armazenados no vetor A são palíndromos");
		} else {
			System.out.println("Os numeros armazenados no vetor A não são palíndromos");
		}

		entrada.close();
	}
}