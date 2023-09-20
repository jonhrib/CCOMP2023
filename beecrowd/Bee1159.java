import java.util.Scanner;

public class Bee1159 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int soma = 0;
		while (x != 0) {
			soma = 0;
			int aux = 0;
			while (aux < 5){
				if (x%2 == 0) {
					soma += x;
					aux++;
				}
				x++;
			}
			System.out.println (soma);
			x = s.nextInt();
		}
		s.close();
	}
}
