import java.util.Scanner;

public class Bee2879 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int carro = sc.nextInt();

            // Jogador sempre escolhe inicialmente a porta 1
            int escolhaInicial = 1;
            int bode;

            if (carro == 1) {
                bode = (int) (Math.random() * 2) + 2;
            } else {
                bode = (carro == 2) ? 3 : 2;
            }

            // Troca de porta
            int novaEscolha = (escolhaInicial == 2 || bode == 2) ? 3 : 2;

            // Verifica se a nova escolha é igual ao número da porta com o carro
            if (novaEscolha == carro) {
                count++;
            }
        }

        System.out.println(count);
    }
}
