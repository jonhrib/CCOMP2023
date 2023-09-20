import java.util.Scanner;

public class Bee1397 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt(); int auxa = 0, auxb = 0;
		
		while (qtd != 0) {
			 auxa = 0; auxb = 0;
			for (int i = 0; i < qtd; i++) {
				int a = s.nextInt(); int b = s.nextInt();
				if (a > b) auxa++;
				else if (b > a) auxb++;
			}
			System.out.println (auxa + " " + auxb);
			qtd = s.nextInt();
		}
	}
}
