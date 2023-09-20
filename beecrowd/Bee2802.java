import java.util.*;
import java.text.*;

public class Bee2802 {

	public static void main (String args []) {
		DecimalFormat df = new DecimalFormat ("0");
		Scanner s = new Scanner (System.in);
		double a = s.nextInt(), divisao = 0;
		divisao = ((Math.pow(a, 4.0)) - (6.0 * Math.pow(a, 3.0)) + (23.0 * Math.pow(a, 2.0)) - (18.0 * a) + 24.0) / 24.0;
		System.out.println (df.format(divisao));
	}
}
