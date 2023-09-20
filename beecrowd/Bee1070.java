import java.util.Scanner;

public class Bee1070 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int aux = x; aux < x + 12; aux++) {
			if (aux%2 != 0) {
				System.out.println (aux);
			}
		}
	}
}