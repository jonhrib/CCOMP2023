import java.util.Scanner;

public class Bee2770 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			int tamanhoa = s.nextInt(); int tamanhob = s.nextInt(); int qtd = s.nextInt();
			for (int i = 0; i < qtd; i++) {
				int pcia = s.nextInt(); int pcib = s.nextInt();
				if ((pcia > tamanhoa && pcia > tamanhob)||(pcib > tamanhoa && pcib > tamanhob)) {
					System.out.println ("Nao");
				}
				else if ((pcia <= tamanhoa && pcia <= tamanhob)||(pcib <= tamanhoa && pcib <= tamanhob)) {
					System.out.println ("Sim");
				}
				else System.out.println ("Nao");
			}
		}
	}
}
