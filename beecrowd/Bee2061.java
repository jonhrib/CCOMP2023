import java.util.Scanner;

public class Bee2061 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x,y;
		x = s.nextInt();
		y = s.nextInt();
		String a;
		for (int i = 0; i < y; i++) {
			a = s.next();
			if (a.equalsIgnoreCase("fechou")) x++;
			else x--;
		}
		System.out.println (x);
	}
}
