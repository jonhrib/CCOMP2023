import java.util.Scanner;

public class Bee2409 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int H = s.nextInt();
		int L = s.nextInt();
		
		if (A <= H && B <= L) System.out.println("S");
		else if (A <= H && C <= L) System.out.println("S");
		else if (B <= H && A <= L) System.out.println("S");
		else if (B <= H && C <= L) System.out.println("S");
		else if (C <= H && A <= L) System.out.println("S");
		else if (C <= H && B <= L) System.out.println("S");
		else System.out.println("N");
    }
    
}