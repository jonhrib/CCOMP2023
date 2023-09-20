import java.util.Scanner;

public class Bee2172 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		long y = s.nextLong();
		while (x != 0 && y != 0) {
			System.out.println (x*y);
			x = s.nextInt();
			y = s.nextLong();
		}
	}
}
