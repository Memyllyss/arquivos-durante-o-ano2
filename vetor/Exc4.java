package vetores;

import java.util.Scanner;

public class Exc4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cont, s, a[], num, par;

		a = new int[10];
		par = 0;

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;

			System.out.println("digite " + s + "° valor do elemento do vetor A");
			a[cont] = entrada.nextInt();

			System.out.println("Os numeros pares de " + a[cont] + " são:");

			num = a[cont];
			while (num >= 0) {

				if (num % 2 == 0) {
					System.out.println(num);
					par++;
				}

				num--;
			}
			System.out.println(" ");
			System.out.println("A quantidade de numeros pares presente em " + a[cont] + " é " + par);
			System.out.println(" ");

		}
		entrada.close();

	}

}