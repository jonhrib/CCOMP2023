import java.util.Scanner;

public class Bee2786 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt(); // largura da sala
        int C = scanner.nextInt(); // comprimento da sala

        // Cálculo do número de lajotas do tipo 1
        int numLajotasTipo1 = L * C + (L - 1) * (C - 1);

        // Cálculo do número de lajotas do tipo 2
        int numLajotasTipo2 = ((L - 1) + (C - 1))*2;

        // Impressão dos resultados
        System.out.println(numLajotasTipo1);
        System.out.println(numLajotasTipo2);
    }
}
