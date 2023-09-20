import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2166 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0000000000");
		double x = s.nextInt();
		double y = 0.0;
		for (int i = 0; i < x; i++) {
			y = y +2.0;
			y = (1.0 / y);
		}
		y = y + 1.0;
		System.out.println (df.format(y));
	}
}