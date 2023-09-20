import java.util.Scanner;

public class Bee1017 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
	    double t = s.nextDouble();
		double vm = s.nextDouble();
		double distancia = t*vm;
		double total = distancia/12;
		System.out.printf ("%.3f %n", total);
		s.close();
	}
}
