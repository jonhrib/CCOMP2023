import java.util.Scanner;

public class Bee3040 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (a >= 200 && a <= 300 && b >= 50  && c >=150) {
				System.out.println ("Sim");
			}
			else System.out.println ("Nao");
		}
		s.close();
	}
}
