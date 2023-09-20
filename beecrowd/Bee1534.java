import java.util.Scanner;

public class Bee1534 {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	int s;
        while (scan.hasNext()) {
    		s = scan.nextInt();
    		for (int i = 0; i < s; i++) {
    			for (int j = 0; j < s; j++) {
    				if (j == s-i-1) System.out.print(2);
    				else if (i == j) System.out.print(1);
    				else System.out.print(3);
    			}
    			System.out.print("\n");
    		}
    	}
        scan.close();
    }
	
}