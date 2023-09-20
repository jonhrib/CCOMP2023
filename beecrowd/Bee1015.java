import java.util.Scanner;

public class Bee1015 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double x1 = s.nextDouble ();
		double y1 = s.nextDouble ();
		double x2 = s.nextDouble ();
		double y2 = s.nextDouble ();
		double dist = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		dist = Math.sqrt(dist);
		System.out.printf ("%.4f%n", dist);
		s.close();
	}
}
