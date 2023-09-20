import java.util.Scanner;

public class Bee2862 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i< x; i++) {
			int a = s.nextInt();
			if (a > 8000) System.out.println ("Mais de 8000!");
			else System.out.println ("Inseto!");
		}
	}
}
