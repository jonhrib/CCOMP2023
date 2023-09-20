import java.util.Scanner;

public class Bee2162 {
	
    public static void main (String args []) {
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
    	int H[] = new int[N];
    	int padrao = 0;
    	
    	for (int i = 0; i < N; i++) {
    		H[i] = s.nextInt();
    	}
    	
    	if (N > 2) {
	    	for (int i = 2; i < N; i++) {
	    		if ((H[i-2] > H[i-1] && H[i-1] < H[i]) || (H[i-2] < H[i-1] && H[i-1] > H[i])) {
	    			padrao = 1;
	    		} else {
	    			padrao = 0; 
		    		break;
	    		}
	    	}
    	} else { 
    		if (H[0] != H[1]) padrao = 1;
    	}
    	
    	System.out.println(padrao);
    }
	
}