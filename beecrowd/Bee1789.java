import java.util.Scanner;

public class Bee1789 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int maior;
		while (s.hasNext()) {
			int x = s.nextInt();
			maior = 0;
			for (int i = 0; i < x; i++) {
				int a = s.nextInt();
				if (i == 0) maior = a;
				else if (a >= maior) maior = a;
			}
			if (maior < 10) System.out.println ("1");
			else if (maior >= 10 && maior < 20)  System.out.println ("2");
			else if (maior == 20 || maior > 20)  System.out.println ("3");
		}
		s.close();
	}
}
