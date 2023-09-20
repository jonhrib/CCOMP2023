import java.util.Scanner;

public class Bee1158 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int soma = 0;
		for (int i = 0; i < n;i++) {
			soma = 0;
			int aux = 0;
			int x = s.nextInt();
			int y = s.nextInt();
			while (aux < y){
				if (x%2 != 0) {
					soma += x;
					aux++;
				}
				x++;
			}
			System.out.println (soma);
		}
		s.close();
	}
}
