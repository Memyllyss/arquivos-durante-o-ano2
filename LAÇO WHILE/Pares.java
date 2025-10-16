package github;

public class Pares {
	public static void main(String[] args) {
		int numero = 1;

		while (numero <= 500) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
			numero++;
		}
	}
}
