import java.util.Scanner;

public class Bee1541 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double a,b,c,x;
		while ((a = s.nextInt()) != 0) {
			b = s.nextInt();
			c = s.nextInt();
			x = Math.sqrt(((a*b)/c)* 100.00); 
			System.out.println ((int)x);
		}
	}
}
