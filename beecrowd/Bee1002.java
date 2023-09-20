import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
 public static void main (String args []) { 
	Locale.setDefault(Locale.US);
	Scanner s = new Scanner (System.in);
	double raio = s.nextDouble();
	double pi = 3.14159;
	double raio2 = (raio*raio);
	double area = pi * raio2;
	System.out.printf ("A=%.4f %n",area);
	s.close ();
 }
 
}
