import java.util.*;
import java.text.*;

public class Bee2761 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.000000");
		int a = s.nextInt();
		double b = s.nextDouble();
		char c = s.next().charAt(0);
		s.nextLine();
		String d = s.nextLine();
		System.out.println (a + df.format(b) + c + d);
		System.out.println (a + "\t" + df.format(b) + "\t" + c + "\t" + d);
		System.out.printf ("%-10d",a);System.out.printf ("%-10s",df.format(b));System.out.printf ("%-10c",c);System.out.printf ("%-10s",d); System.out.println();
	}
}
