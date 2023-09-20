import java.util.Scanner;
import java.text.*;

public class Bee3145 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int n = s.nextInt();
		int x = s.nextInt();
		double dias;
		dias = x/(n+2.0);
		System.out.println (df.format(dias));
	}
}
