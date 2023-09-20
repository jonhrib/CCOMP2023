import java.util.Scanner;

public class Bee1930 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int tomadas = 0;
		tomadas = ((a+b+c+d)-3);
		System.out.println (tomadas);
	}
}
