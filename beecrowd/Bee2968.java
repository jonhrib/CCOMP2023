import java.util.Scanner;

public class Bee2968 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int N = scanner.nextInt();

        int[] marcosPorcentagem = calcularMarcosPorcentagem(V, N);

        for (int i = 1; i <= 9; i++) {
        	if (i < 9) {
            System.out.print(marcosPorcentagem[i] + " ");
        	}
        	else System.out.println(marcosPorcentagem[i]);
        }
    }

    public static int[] calcularMarcosPorcentagem(int V, int N) {
        int[] marcosPorcentagem = new int[10];
        int totalPlacas = V * N;
        int metaPorcentagem = 10;

        for (int i = 1; i <= 9; i++) {
            marcosPorcentagem[i] = (int) Math.ceil(metaPorcentagem / 100.0 * totalPlacas);
            metaPorcentagem += 10;
        }

        return marcosPorcentagem;
    }
}
