import java.util.Scanner;
import java.text.*;

public class Bee1985 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int x = s.nextInt();
		double soma = 0;
		for (int i = 0; i < x; i++) {
			int cod = s.nextInt();
			int quant = s.nextInt();
			if (cod == 1001) soma += (quant * 1.50);
			if (cod == 1002) soma += (quant * 2.50);
			if (cod == 1003) soma += (quant * 3.50);
			if (cod == 1004) soma += (quant * 4.50);
			if (cod == 1005) soma += (quant * 5.50);
		}
		System.out.println (df.format(soma));
		s.close();
	}
}
