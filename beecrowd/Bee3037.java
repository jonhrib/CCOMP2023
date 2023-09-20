import java.util.Scanner;

public class Bee3037 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		for (int i = 0; i < qtd; i++) {
			int pjoao = 0, pmaria = 0;
			for (int j = 0; j < 3; j++) {
				int x = s.nextInt(); int y = s.nextInt();
				pjoao += (x*y);
			}
			for (int j = 0; j < 3; j++) {
				int x = s.nextInt(); int y = s.nextInt();
				pmaria += (x*y);
			}
			if (pjoao > pmaria) System.out.println ("JOAO");
			else System.out.println ("MARIA");
		}
	}
}
