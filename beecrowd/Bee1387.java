import java.util.Scanner;

public class Bee1387 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(); int y = s.nextInt();
		
		while (x != 0 && y != 0) {
			System.out.println (x+y);
			x = s.nextInt(); y = s.nextInt();
		}
	}
}
