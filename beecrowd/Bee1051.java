import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1051 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double sal = s.nextDouble();
		double aux = sal;
		double aux2;
		double imposto;
		if (sal <= 2000.00) {
			System.out.println ("Isento");
		}
		else if (sal >= 2000.01 && sal <= 3000.00) {
			aux = aux - 2000.00;
			imposto = (aux*0.08);
			System.out.println ("R$ " + df.format(imposto));
		}
		else if (sal >= 3000.01 && sal <= 4500.00) {
			aux2 = (sal%3000.00);
			aux = aux - 2000.00 - aux2;
			imposto = ((aux*0.08)+(aux2*0.18));
			System.out.println ("R$ " + df.format(imposto));
		}
		else if (sal > 4500.00) {
			aux2 = (sal%3000.00);
			double aux3 = (sal%4500.00);
			double aux4 = aux2 - aux3;
			aux = (aux - aux2 - 2000);
			imposto = ((aux*0.08)+(aux4*0.18)+(aux3*0.28));
			System.out.println ("R$ " + df.format(imposto));
		}
		s.close();
	}
}
