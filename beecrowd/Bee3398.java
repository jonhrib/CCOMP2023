import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee3398 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double moeda = s.nextDouble();
		int qtd = s.nextInt();
		double pagar = moeda*qtd;
		
		System.out.println(df.format(pagar));
	}
}
