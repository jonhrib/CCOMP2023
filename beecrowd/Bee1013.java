import java.util.Scanner;

public class Bee1013 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int aux = 0;
		int maior = 0;
		if (aux == 0) {
			maior = a;
			aux++;
		}
		if (b>maior) {
			maior = b;
		}
		if (c>maior) {
			maior = c;
		}
		System.out.println (maior + " eh o maior");
		s.close();
	}
	
}
