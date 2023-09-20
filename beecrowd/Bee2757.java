import java.util.*;
import java.text.*;

public class Bee2757 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat dfpos = new DecimalFormat ("0000000000");
		DecimalFormat dfneg = new DecimalFormat ("000000000");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println ("A = " + a + ", B = " + b + ", C = " + c);
		System.out.printf ("A = " + "%10d",a);System.out.printf (", B = " + "%10d",b);System.out.printf (", C = " + "%10d",c);System.out.println ();
		if (a < 0) System.out.println ("A = " + dfneg.format(a) + ", B = " + dfpos.format(b) + ", C = " + dfpos.format(c));
		else System.out.println ("A = " + dfpos.format(a) + ", B = " + dfpos.format(b) + ", C = " + dfpos.format(c));
		System.out.printf ("A = " + "%-10d",a);System.out.printf (", B = " + "%-10d",b);System.out.printf (", C = " + "%-10d",c); System.out.println();
	}
}
