package vetores;

import java.util.Scanner;

public class Exc5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], cont, s, num;

		a = new int[10];

		for (cont = 0; cont < 10; cont++) {
			s = cont + 1;
			System.out.println("Digite o valor do  elemento " + s + "° do vetor A");
			a[cont] = entrada.nextInt();

			System.out.println("Divisores do " + s + "° elemento do vetor A:");

			num = a[cont];

			while (num >= 1) {

				if (a[cont] % num == 0) {
					System.out.println(num);
				}

				num--;
			}

			System.out.println(" ");
		}

		entrada.close();
	}
}
