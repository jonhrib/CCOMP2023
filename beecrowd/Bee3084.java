import java.util.Scanner;
import java.text.*;
public class Bee3084 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("00");
		while (s.hasNext()) {
			int h = s.nextInt();
			int m = s.nextInt();
			if (h == 0 && m == 0) System.out.println (df.format(h) + ":" + df.format(m));
			else {
				h = h /30;
				m = m/6;
				System.out.println (df.format(h) + ":" + df.format(m));
			}
		}
	}
}
