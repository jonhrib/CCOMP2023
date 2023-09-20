import java.util.*;
import java.text.*;

public class Bee2760 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0000000000");
		String a = s.nextLine();
		String b = s.nextLine();
		String c = s.nextLine();
		System.out.println (a + b + c);
		System.out.println (b + c + a);
		System.out.println (c + a +b);
		System.out.println (String.format("%.10s",a) + String.format("%.10s",b) + String.format("%.10s",c));
	}
}
