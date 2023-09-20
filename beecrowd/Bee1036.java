import java.util.Scanner;

public class Bee1036 {
	public static void main (String args []) {
	Scanner s = new Scanner (System.in);
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c = s.nextDouble();
	double del = ((b*b)-(4*a*c));
	double div = 2*a;
	double bha1 = ((-b + Math.sqrt(del))/div);
	double bha2 = ((-b - Math.sqrt(del))/div);
	 if (Math.sqrt(del) == 0 || bha1 == 0 || bha2 == 0 || del < 0 || div ==0) {
		 System.out.println ("Impossivel calcular");
	 }
	 else {
		 System.out.printf ("R1 = %.5f%n", bha1);
		 System.out.printf ("R2 = %.5f%n", bha2);
	 }
	 s.close();
	}
	
}
