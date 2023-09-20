import java.util.Scanner;

public class Bee2176 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String x = s.next();
		String[] bits = x.split("");
		int y = 0;
		for (String bit : bits) {
			if (bit.equals("1")) y++;
		}
		x += y % 2 == 0 ? 0 : 1;
		System.out.println (x);
	}
}
