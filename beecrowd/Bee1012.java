import java.util.Scanner;

public class Bee1012 {
	public static void main (String args []) {
	Scanner s = new Scanner (System.in);
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c = s.nextDouble();
	double area = (c*a)/2;
	double areac = (3.14159*(c*c));
	double areat = ((a+b)*c)/2;
	double areaq = (b*b);
	double arear = (a*b);
	System.out.printf ("TRIANGULO: %.3f%n", area);
	System.out.printf ("CIRCULO: %.3f%n", areac);
	System.out.printf ("TRAPEZIO: %.3f%n", areat);
	System.out.printf ("QUADRADO: %.3f%n", areaq);
	System.out.printf ("RETANGULO: %.3f%n", arear);
	s.close();
	}

}
