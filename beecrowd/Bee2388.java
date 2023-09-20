import java.util.Scanner;

public class Bee2388 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt(); int soma = 0;
	
		for (int i = 0; i < qtd; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			soma += (x*y); 
		}
		System.out.println (soma);
	}
}
