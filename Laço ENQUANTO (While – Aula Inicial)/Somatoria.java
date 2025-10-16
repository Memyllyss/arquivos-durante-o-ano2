package github;

public class Somatoria {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("A somatória dos números de 1 a 100 é: " + soma);
    }
}
