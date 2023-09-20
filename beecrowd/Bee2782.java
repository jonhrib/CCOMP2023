import java.util.Scanner;

public class Bee2782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        int N = scanner.nextInt();
        int[] sequencia = new int[N];
        for (int i = 0; i < N; i++) {
            sequencia[i] = scanner.nextInt();
        }

        // Chamada do método
        int resultado = contarEscadinhas(N, sequencia);

        // Impressão do resultado
        System.out.println(resultado);
    }

    public static int contarEscadinhas(int N, int[] sequencia) {
        int escadinhas = 0;
        Integer diferenca = null;

        for (int i = 1; i < N; i++) {
            if (diferenca == null) {
                diferenca = sequencia[i] - sequencia[i - 1];
            } else if (sequencia[i] - sequencia[i - 1] != diferenca) {
                escadinhas++;
                diferenca = sequencia[i] - sequencia[i - 1];
            }
        }

        return escadinhas + 1;
    }
}
