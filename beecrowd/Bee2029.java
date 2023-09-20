import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2029 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double altura = 0, area = 0, r = 0;
		while (s.hasNext()) {
			double volume = s.nextDouble();
			double diametro = s.nextDouble();
			r = diametro/2;
			altura = (volume/(3.14*(Math.pow(r,2))));
			area = (3.14*(Math.pow(r,2)));
			System.out.println ("ALTURA = "+ df.format(altura));
			System.out.println ("AREA = "+ df.format(area));
		}
	}
}
