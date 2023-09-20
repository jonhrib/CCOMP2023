import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2164 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int n = s.nextInt();
		double fibo = (Math.pow(((1+(Math.sqrt(5)))/2), n) - (Math.pow(((1-(Math.sqrt(5)))/2),n)))/ Math.sqrt(5);
		System.out.println (df.format(fibo));
	}
}
