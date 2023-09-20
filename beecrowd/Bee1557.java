import java.util.Scanner;

public class Bee1557 {
	
    public static void main(String args []) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, T, Y;
        while (N != 0) {
        	int[][] M = new int[N][N];
        	X = 1;
        	for (int i = 1; i <= N; i++) {
        		Y = X;
        		for (int j = 1; j <= N; j++) {
        			M[i-1][j-1] = Y;
        			Y *= 2;
        		}
        		X *= 2;
        	}
        	
        	T = String.valueOf(M[N-1][N-1]).length();
        	
        	for (int i = 1; i <= N; i++) {
        		for (int j = 1; j <= N; j++) {
        			
                    System.out.printf("%"+ T +"d", M[i-1][j-1]);
                    if (j < N) System.out.print(" ");
                    else System.out.print("\n");
        		}
        	}
        	
    		System.out.print("\n");
        	N = leitor.nextInt();
        }
    }
	
}