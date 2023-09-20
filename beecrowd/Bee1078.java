import java.util.Scanner;

public class Bee1078 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int aux = 0;
		for (int i = 1; i <= 10; i++) {
			aux = i * x;
			System.out.println (i + " x " + x + " = " + aux);
		}
		s.close();
	}
}
