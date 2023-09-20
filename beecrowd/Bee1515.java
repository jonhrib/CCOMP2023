import java.util.Scanner;

public class Bee1515 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		while (qtd != 0) {
			String menornome = ""; int menorano = 0;
			for (int i = 0; i < qtd; i++) {
				String nome = s.next();
				int ano = s.nextInt();
				int demora = s.nextInt();
				int aux = ano-demora;
				if (i == 0) {
					menornome = nome;
					menorano = aux;
				}
				else if (aux < menorano) {
					menornome = nome;
					menorano = aux;
				}
			}
			System.out.println (menornome);
			qtd = s.nextInt();
		}
	}
}
