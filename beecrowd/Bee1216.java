import java.util.Scanner;
import java.math.RoundingMode;
import java.text.*;

public class Bee1216 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int qtd = 0, somadist = 0; 
		double result = 0;
		
		while (s.hasNext()) {
			String nome = s.nextLine();
			int distancia = s.nextInt();
			s.nextLine();
			
			qtd++;
			somadist += distancia;
		}
		result = (double) somadist/qtd;
		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println (df.format(result));
		s.close();
	}
}
