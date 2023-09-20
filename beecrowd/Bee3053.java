import java.util.Scanner;

public class Bee3053 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		char letra = s.next().charAt(0);
		for (int i = 0; i < qtd; i++) {
			int num = s.nextInt();
			if (num == 1) {
				if (letra == 'A') {
					letra = 'B';
				}
				else if (letra == 'B') {
					letra = 'A';
				}
			}
			else if (num == 2) {
				if (letra == 'B') {
					letra = 'C';
				}
				else if (letra == 'C') {
					letra = 'B';
				}
			}
			else if (num == 3) {
				if (letra == 'A') {
					letra = 'C';
				}
				else if (letra == 'C') {
					letra = 'A';
				}
			}
		}
		System.out.println (letra);
	}
}
