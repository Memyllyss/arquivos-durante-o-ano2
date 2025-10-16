package github;

import java.util.Scanner;

public class Pessoas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contMais50 = 0, contAltura = 0, contPesoMenor40 = 0, idadeMaior = 0, idadeMenor = 0;
		double somaAltura = 0;

		for (int i = 1; i <= 25; i++) {
			System.out.println("Pessoa " + i + ": ");
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			System.out.print("Altura (em metros): ");
			double altura = entrada.nextDouble();
			System.out.print("Peso (em kg): ");
			double peso = entrada.nextDouble();

			// a) Quantidade de pessoas com idade superior a 50
			if (idade > 50) {
				contMais50++;
			}

			// b) Média das alturas de pessoas entre 10 e 20 anos
			if (idade >= 10 && idade <= 20) {
				somaAltura += altura;
				contAltura++;
			}

			// c) Porcentagem de pessoas com peso inferior a 40 kg
			if (peso < 40) {
				contPesoMenor40++;
			}

			// d) Idade da mais velha e da mais nova
			if (idade > idadeMaior)
				idadeMaior = idade;
			if (idade < idadeMenor)
				idadeMenor = idade;

		}

		double mediaAltura = (contAltura > 0) ? somaAltura / contAltura : 0;
		double porcentagemPeso = (contPesoMenor40 * 100.0) / 25;

		System.out.println("Quantidade com mais de 50 anos: " + contMais50);
		System.out.println("Média de altura (10-20 anos): " + mediaAltura);
		System.out.println("Porcentagem com menos de 40 kg: " + porcentagemPeso + "%");
		System.out.println("Mais velha: " + idadeMaior + " anos");
		System.out.println("Mais nova: " + idadeMenor + " anos");

		entrada.close();
	}

}
