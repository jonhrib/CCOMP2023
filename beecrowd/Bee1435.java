import java.util.Scanner;

public class Bee1435 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int x = s.nextInt();
    	int y = 0;
    	while (x != 0) {
    		for (int i = 1; i <= x; i++) {
    			for (int j = 1 ; j <= x; j++) {
    				y = i;
                    if (j < y) y = j;
                    if (x-i+1 < y) y = x-i+1;
                    if (x-j+1 < y) y = x-j+1;
                    
                    System.out.printf("%3d", y);
                    if (j < x) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            System.out.print("\n");
            x = s.nextInt();
        }
    }
	
}

