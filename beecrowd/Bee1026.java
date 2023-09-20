import java.io.IOException;
import java.util.Scanner;

public class Bee1026 {

    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	
    	while (s.hasNext()) {
    		long u = s.nextLong();
    		long m = s.nextLong();
    		System.out.println(u ^ m); // ^ usado como xor
    	}
    }
    
}