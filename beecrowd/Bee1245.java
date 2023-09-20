import java.util.Scanner;

public class Bee1245 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int qtd = s.nextInt();
            int pares = 0;
            int[] botasD = new int[61];
            int[] botasE = new int[61];

            for (int i = 0; i < qtd; i++) {
                int tamanho = s.nextInt();
                char pe = s.next().charAt(0);

                if (pe == 'D') {
                    botasD[tamanho]++;
                } else {
                    botasE[tamanho]++;
                }
            }

            for (int tamanho = 30; tamanho <= 60; tamanho++) {
                pares += Math.min(botasD[tamanho], botasE[tamanho]);
            }

            System.out.println(pares);
        }
    }
}
