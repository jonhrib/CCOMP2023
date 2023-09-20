import java.util.Scanner;

public class Bee3126 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt(); int cont = 0;
		
		for (int i = 0; i < qtd; i++) {
			int num = s.nextInt();
			if (num == 1) cont++;
		}
		
		System.out.println (cont);
	}
}
