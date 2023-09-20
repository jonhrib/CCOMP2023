import java.util.Scanner;

public class Bee2928 {
	
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
    	String[] linhas = new String[N];
    	int saltos = 0;
    	
    	for (int i = 0; i < N; i++) {
    		linhas[i] = s.next();
    	}
    	
    	for (int i = 1; i < N; i++) {
    		if (linhas[i].startsWith(".")) {
    			if (linhas[i-1].startsWith(".")) {
    				if ((i + 1 < N) && linhas[i+1].startsWith(".")) {
    					System.out.println('N');
    					return;
    				}
    			} 
    			else {
        			saltos++;
				}
    		}
    	}
    	System.out.println(saltos);
    }
    
}