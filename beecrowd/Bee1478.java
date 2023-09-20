/*import java.util.Scanner;

public class Bee1478 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int x = s.nextInt();
    	int y = 0;
    	while (x != 0) {
    		for (int i = 1; i <= x; i++) {
    			y = i;
    			for (int j = 1 ; j <= x; j++) {
                    if (i == j) y = 1;
                    
                    System.out.printf("%3d", y);
                    if (j < x) System.out.print(" ");
                    else System.out.print("\n");
                    if (j >= i) y++;
                    else y--;
                }
            }
            System.out.print("\n");
            x = s.nextInt();
        }
    }
	
}*/
import java.util.Scanner;

public class Bee1478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ordem;
        while ((ordem = scanner.nextInt()) != 0) {
            int[][] matriz = new int[ordem][ordem];
            
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    matriz[i][j] = Math.abs(i - j) + 1;
                }
            }
            
            imprimirMatriz(matriz);
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        int ordem = matriz.length;
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
