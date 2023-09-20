import java.util.Scanner;

public class Bee3042 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        while ((m = scanner.nextInt()) != 0) {
            int[][] pistas = new int[m][3];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 3; j++) {
                    pistas[i][j] = scanner.nextInt();
                }
            }

            int minToques = calcularMinToques(pistas);
            System.out.println(minToques);
        }

        scanner.close();
    }

    private static int calcularMinToques(int[][] pistas) {
        int minToques = 0;
        int posicaoAtual = 1; // Começa na pista do meio
        int m = pistas.length;

        for (int i = 0; i < m; i++) {
            int pistaEsquerda = pistas[i][0];
            int pistaCentro = pistas[i][1];
            int pistaDireita = pistas[i][2];

            if (posicaoAtual == 0 && pistaEsquerda == 0) {
                minToques++;
                posicaoAtual = 1; // Desvia para a pista da esquerda
            } else if (posicaoAtual == 2 && pistaDireita == 0) {
                minToques++;
                posicaoAtual = 1; // Desvia para a pista da direita
            } else if (posicaoAtual == 1 && pistaCentro == 1) {
                minToques++;
                posicaoAtual = 0; // Desvia para a pista da esquerda
            } else {
                posicaoAtual = 1; // Continua na pista do meio
            }
        }

        return minToques;
    }
}
