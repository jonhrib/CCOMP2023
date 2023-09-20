import java.util.Scanner;

public class Bee2982 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), governo = 0, custo = 0; 
		for (int i = 0; i < x; i++) {
			char letra = s.next().charAt(0);
			int valor = s.nextInt();
			if (letra == 'V') governo += valor;
			else if (letra == 'G') custo += valor;
		}
		if (governo > custo) System.out.println ("A greve vai parar.");
		else if (custo > governo) System.out.println ("NAO VAI TER CORTE, VAI TER LUTA!");
	}
}
