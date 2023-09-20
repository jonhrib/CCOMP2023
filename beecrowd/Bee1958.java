import java.util.Scanner;

public class Bee1958 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double x = s.nextDouble();
		System.out.println (String.format((String.valueOf(x).startsWith("-") ? "" : "+") + "%.4E", x));
		s.close();
	}
}
