import java.util.Scanner;

public class Bee2167 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int aux = 0, pos = 0;
		for (int i = 1; i <= x; i++) {
			int a = s.nextInt();
			if (i > 1 && a < aux && pos == 0) {
				pos = i;
			}
			aux = a;
		}
		System.out.println (pos);
		s.close();
	}
}
