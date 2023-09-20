import java.util.Scanner;

public class Bee1962 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y, ano;
		for (int i = 0; i < x; i++) {
			y = s.nextInt();
			if (y >= 2015) {
				ano = y - 2014;
				System.out.println (ano + " A.C.");
			}
			else {
				ano = 2015 - y;
				System.out.println (ano + " D.C.");
			}
		}
		s.close();
	}
}
