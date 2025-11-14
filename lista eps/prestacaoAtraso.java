import java.util.Scanner;

public class prestacaoAtraso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor, taxa, prestacao;
        int tempo;

        System.out.print("Digite o valor da prestação: ");
        valor = ler.nextInt();

        System.out.print("Digite a taxa de juros diária (%): ");
        taxa = ler.nextInt();

        System.out.print("Digite o tempo de atraso em dias: ");
        tempo = ler.nextInt();

        prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("O valor da prestação em atraso é: " + prestacao);
    }
}
