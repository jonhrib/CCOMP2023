import java.text.DecimalFormat;

public class Bee1155 {

	public static void main (String args []) {
		DecimalFormat df = new DecimalFormat ("0.00");
		double x = 1;
		for (int i = 2; i <= 100;i++) {
			x += (1.00/i);
		}
		System.out.println (df.format(x));
	}
}
