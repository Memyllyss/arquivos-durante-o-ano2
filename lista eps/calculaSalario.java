package Tpa15_05;

import java.util.Scanner;

public class calculaSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double aulaMes, inss, aulaDinheiro, desconto, salarioBruto, salarioLiquido;

        System.out.println("Digite quantas aulas você tem no mês");
        aulaMes = ler.nextInt();

        System.out.println("Digite a porcentagem do INSS a ser descontada");
        inss = ler.nextInt();

        System.out.println("Digite o quanto você ganha por aula");
        aulaDinheiro = ler.nextInt();

        salarioBruto = aulaDinheiro * aulaMes;
        desconto = salarioBruto / 100 * inss;
        salarioLiquido = salarioBruto - desconto;

        System.out.println("O seu desconto do inss é " + inss);
        System.out.println("O seu salario em forma bruta é " + salarioBruto);
        System.out.println("O seu salario em forma líquida é " + salarioLiquido);
    }
}
