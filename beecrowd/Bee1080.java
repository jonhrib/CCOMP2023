import java.util.Scanner;

public class Bee1080 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int maior = 0;
		int posmaior = 0;
		for (int i = 1; i <= 100;i++) {
			int x = s.nextInt();
			if (i == 1) {
				maior = x;
				posmaior = 1;
			}
			else if (x > maior) {
				maior = x;
				posmaior = i;
			}
		}
		System.out.println (maior);
		System.out.println (posmaior);
		s.close();
	}
}
