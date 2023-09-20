import java.util.Scanner;

public class Bee1933 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		if (a == b) {
			c = a;
		}
		else if (a > b ) {
			c = a;
		}
		else {
			c = b;
		}
		System.out.println (c);
		s.close();
	}
}
