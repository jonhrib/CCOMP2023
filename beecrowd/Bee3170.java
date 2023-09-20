import java.util.Scanner;
import java.text.*;

public class Bee3170 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0");
		int bolinhas = s.nextInt();
		int galhos = s.nextInt();
		int compra = (galhos/2)-bolinhas;
		if (compra > 0) {
			if (galhos%2 == 0) System.out.println ("Faltam " + compra + " bolinha(s)");
			else System.out.println ("Faltam " + df.format(Math.floor(compra)) + " bolinha(s)");
		}
		else System.out.println ("Amelia tem todas bolinhas!");
	}
}
