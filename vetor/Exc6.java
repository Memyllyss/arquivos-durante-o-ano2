package vetores;

import java.util.Scanner;

public class Exc6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[], cont, s, potencia;

		a = new int[11];

		potencia = 1;

		System.out.println("--- Vetor A (Potências de 2) ---");

		for (cont = 0; cont < 11; cont++) {

			a[cont] = potencia;

			s = cont + 1;

			System.out.println(s + "° (A[" + cont + "]) = " + a[cont]);

			potencia = potencia * 2;
		}

		entrada.close();
	}
}