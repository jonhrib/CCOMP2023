import java.util.Scanner;

public class Bee1132 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y =  s.nextInt();
		int soma = 0;
		if (x < y) {
			for (int i = x; i <= y;i++) {
				if ((i%13 != 0)) {
					soma = soma + i;
				}
			}	
		}
		else if (x > y) {
			for (int i = y; i <= x;i++) {
				if ((i%13 != 0)) {
					soma = soma + i;
				}
			}
		}

		System.out.println (soma);
		s.close();
	}
}
