import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2584 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.000");
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int lado = s.nextInt();
			double angulo = (36 * (Math.PI / 180.0));
			double apotema = (lado/(2*(Math.tan(angulo))));
			double area = (5*lado*apotema)/2;
			
			System.out.println(df.format(area));
		}
	}
}
