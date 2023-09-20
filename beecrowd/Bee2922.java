import java.util.Scanner;

public class Bee2922 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	while (s.hasNext()) {
    		int a = s.nextInt();
    		int b = s.nextInt();
    		
    		if (a > b) {
    			int aux = a;
    			a = b;
    			b = aux;
    		}
    		
    		if (a == b)
    			System.out.println(b - a);
    		
    		else
    			System.out.println(b - a - 1);
    	}
    }
    
}