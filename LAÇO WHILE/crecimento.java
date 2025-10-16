package github;

public class crecimento {

	public static void main(String[] args) {
        double joao = 1.34;
        double pedro = 1.45;
        int anos = 0;

        while (joao <= pedro) {
            joao += 0.025; // 2,5 cm = 0.025 m
            pedro += 0.02; // 2 cm = 0.02 m
            anos++;
        }

        System.out.println("João ficará mais alto que Pedro em " + anos + " anos.");
        System.out.printf("Altura final de João: %.2f m\n", joao);
        System.out.printf("Altura final de Pedro: %.2f m\n", pedro);
    }

}
