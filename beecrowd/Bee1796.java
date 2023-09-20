import java.util.Scanner;

public class Bee1796 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int cont1 = 0; int cont0 = 0; int aux = 0;
		
		for (int i = 0; i < qtd; i++) {
			int escolha = s.nextInt();
			if (escolha == 1) {
				cont1++;
			}
			else if (escolha == 0) {
				cont0++;
			}
		}
		if (qtd%2 == 0) {
			aux = (qtd/2)+1;
		}
		else aux = (int) Math.ceil(qtd/2) + 1;
		//System.out.println (aux);
		if (cont0 >= aux) System.out.println ("Y");
		else System.out.println ("N");
	}
}
