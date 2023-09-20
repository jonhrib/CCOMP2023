import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1116 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			double a = s.nextDouble();
			double b = s.nextDouble();
			if ( b != 0 ) {
				System.out.printf ((df.format((a/b))) + "%n");
			}
			else  System.out.println ("divisao impossivel");
		}
		s.close();
		
	}
}
