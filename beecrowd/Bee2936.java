import java.util.Scanner;

public class Bee2936 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int total = (225 + (a*300)+(b*1500)+(c*600)+(d*1000)+(e*150));
		System.out.println (total);
	}
}
