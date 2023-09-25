import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2489 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		while (s.hasNext()) {
			double altura = s.nextDouble();
			double distancia = s.nextDouble();
			double angulo = s.nextDouble();
			double radianos = (angulo-90.0) * (Math.PI / 180.0); //transforma os graus em radianos
			
			double result = ((Math.tan(radianos)*distancia) + altura);
			
			System.out.println(df.format(result));
		}
	}
}
