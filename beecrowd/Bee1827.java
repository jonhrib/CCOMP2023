import java.util.Scanner;

public class Bee1827 {
	
	public static void main(String args []) {
        Scanner leitor = new Scanner(System.in);
        int N, centro, interior, exterior;
        while (leitor.hasNext()) {
        	N = leitor.nextInt();
        	centro = N / 2;
        	interior = N / 3;
        	exterior = (N - 1) - interior;
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
        			if (i == centro && j == centro) System.out.print(4);
        			else if (i >= interior && j >= interior && i <= exterior && j <= exterior) System.out.print(1);
        			else if (i == j) System.out.print(2);
        			else if (j == N-i-1) System.out.print(3);
        			else System.out.print(0);
        		}
        		System.out.print("\n");
        	}
    		System.out.print("\n");
        }
	}
	
}