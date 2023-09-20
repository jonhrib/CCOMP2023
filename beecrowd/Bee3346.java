import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Bee3346 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat ("0.000000");
		double f1 = s.nextDouble();
		double f2 = s.nextDouble();
		f1 = f1/100;
		f2 = f2/100;
		double flut = ((f1+f2+(f1*f2))*100);
		System.out.printf (df.format(flut) + "%n");
		s.close();
	}
}