import java.util.Scanner;
import java.text.*;

public class Bee2758 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df1 = new DecimalFormat ("0.000000");
		DecimalFormat df2 = new DecimalFormat ("0.0");
		DecimalFormat df3 = new DecimalFormat ("0.00");
		DecimalFormat df4 = new DecimalFormat ("0.000");
		DecimalFormat df6 = new DecimalFormat ("0");
		float a = s.nextFloat();
		float b = s.nextFloat();
		double c = s.nextDouble();
		double d = s.nextDouble();
		System.out.println ("A = " + df1.format(a) + ", B = " + df1.format(b));//NORMAL
		System.out.println ("C = " + df1.format(c) + ", D = " + df1.format(d));//NORMAL
		System.out.println ("A = " + df2.format(a) + ", B = " + df2.format(b));//UMA CASA
		System.out.println ("C = " + df2.format(c) + ", D = " + df2.format(d));//UMA CASA
		System.out.println ("A = " + df3.format(a) + ", B = " + df3.format(b));//DUAS CASAS
		System.out.println ("C = " + df3.format(c) + ", D = " + df3.format(d));//DUAS CASAS
		System.out.println ("A = " + df4.format(a) + ", B = " + df4.format(b));//TRES CASAS
		System.out.println ("C = " + df4.format(c) + ", D = " + df4.format(d));//TRES CASAS
		//System.out.println ("A = " + String.format((String.valueOf(a).startsWith("") ? "" : "+") + "%.3E", a) + ", B = " + String.format((String.valueOf(b).startsWith("") ? "" : "+") + "%.3E", b));
		//System.out.println ("C = " + String.format((String.valueOf(c).startsWith("") ? "" : "+") + "%.3E", c) + ", D = " + String.format((String.valueOf(d).startsWith("") ? "" : "+") + "%.3E", d));
		System.out.printf ("A = %.3E, B = %.3E\n", a, b);
		System.out.printf ("C = %.3E, D = %.3E\n", c, d);
		System.out.println ("A = " + df6.format(a) + ", B = " + df6.format(b));//INTEIRO
		System.out.println ("C = " + df6.format(c) + ", D = " + df6.format(d));//INTEIRO
		
	}
}
