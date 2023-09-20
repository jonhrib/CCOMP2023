import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1043 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double maior;
		double soma;
		String triangulo = "false";
		if (a > b && a > c) maior = a;
		else if (b>c) maior = b;
		else maior = c;
		
		if (maior == a) soma = b+c;
		else if (maior == b) soma = a+c;
		else soma = a+b;
		
		if (soma > maior) triangulo = "true";
		else if (soma <= maior) triangulo = "false";
		
		if (triangulo == "true") {
			double perimetro = a+b+c;
			System.out.printf ("Perimetro = " +  df.format(perimetro) + "%n");
		} else {
			double area = ((a+b)*c)/2;
			System.out.printf ("Area = " +  df.format(area) + "%n");
		}
		s.close();
	}


}
