package trabalhoTpa;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota");
        nota1 = ler.nextInt();

        System.out.println("Digite a segunda nota");
        nota2 = ler.nextInt();

        System.out.println("Digite a terceira nota");
        nota3 = ler.nextInt();

        System.out.println("Digite a quarta nota");
        nota4 = ler.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média é " + media);
    }
}
