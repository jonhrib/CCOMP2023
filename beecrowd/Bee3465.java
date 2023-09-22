import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee3465 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		// Calcula a área do triângulo usando a fórmula de Heron
        double aux = (a + b + c) / 2.0; // Semiperímetro
        double area = Math.sqrt(aux * (aux - a) * (aux - b) * (aux - c));
        
        System.out.println(df.format(area) + " m2");
	}
}
