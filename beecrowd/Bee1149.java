import java.io.IOException;
import java.util.Scanner;

public class Bee1149 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int N = leitor.nextInt();
        int soma = 0;
        while (N <= 0) {
        	N = leitor.nextInt();
        }
        for (int i = 1; i <= N; i++) {
        	soma += A;
        	A++;
        }
        System.out.println(soma);
    }
	
}