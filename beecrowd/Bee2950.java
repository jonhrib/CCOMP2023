import java.util.Scanner;
import java.text.*;

public class Bee2950 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double distancia = s.nextInt();
		double dia1 = s.nextDouble();
		double dia2 = s.nextDouble();
		double icm = 0;
		icm = (distancia / (dia1+dia2));
		System.out.println (df.format(icm));
	}
}
