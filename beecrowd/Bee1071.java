import java.util.Scanner;

public class Bee1071 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int soma = 0;
		if (y > x) {
			for (int aux = x+1; aux < y ; aux++) {
				if (aux%2 != 0) {
					soma = soma + aux;
				}
			}	
		}
		else if (x > y) {
			for (int aux = y+1; aux < x ; aux++) {
				if (aux%2 != 0) {
					soma = soma + aux;
				}
			}	
		}
		System.out.println (soma);
		s.close();
	}
}