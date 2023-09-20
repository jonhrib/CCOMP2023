import java.util.Scanner;

public class Bee1241 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String a = s.next();
			String b = s.next();
			
			if (a.endsWith(b)) {
				System.out.println("encaixa");
			}
			else System.out.println("nao encaixa");
		}
	}
}
