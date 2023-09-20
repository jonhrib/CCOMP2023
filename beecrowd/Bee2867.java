import java.util.*;

public class Bee2867 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int num = s.nextInt();
			int num2 = s.nextInt();
			double fin = (Math.pow(num, num2));
			int numero = (int) (Math.floor(Math.log10(fin)) +1);
			System.out.println (numero);
		}
	}
}
