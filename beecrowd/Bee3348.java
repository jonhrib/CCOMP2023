import java.util.Scanner;

public class Bee3348 {
	
    public static void main(String[] args) {
    	Scanner s = new Scanner (System.in);
        int N = s.nextInt();
        long K = 1;
        boolean vitoria = false; 
        
        while (!vitoria) {
            int aranhasVivas = 2 * N; 
            int posicaoAtual = 0; 
            
            while (aranhasVivas > N) {
                posicaoAtual = (int) ((posicaoAtual + K - 1) % aranhasVivas);
                
                if (posicaoAtual < N) {
                    break;
                } else {
                    aranhasVivas--;
                }
            }
            
            if (aranhasVivas == N) {
                vitoria = true;
            } else {
                K++;
            }
        }
        
        System.out.println(K);
    }
}
