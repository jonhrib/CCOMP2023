import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee3474 {

	public static void main (String args []) {
		Scanner s = new	Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double valor = s.nextDouble();
		int integrantes = s.nextInt();
		
		double divide = valor/integrantes;
		
		System.out.println(df.format(divide));
		
	}
}
