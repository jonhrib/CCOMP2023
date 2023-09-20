import java.util.Scanner;

public class Bee1042 {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int aux = 0;
		int maior = 0;
		int menor = 0;
		int outro = 0;
		if (aux == 0) {
			menor = a;
			aux++;
		}
		if (b<menor) {
			menor = b;
		}
		if (c<menor) {
			menor = c;
		}
		if (aux == 0) {
			maior = a;
			aux++;
		}
		if (b>maior) {
			maior = b;
		}
		if (c>maior) {
			maior = c;
		}
		if (a != maior && a!= menor) {
			outro = a;
		}
		else if (b != maior && b!= menor) {
			outro = b;
		}
		else if (c != maior && c!= menor) {
			outro = c;
		}
		System.out.println (menor);
		System.out.println (outro);
		System.out.println (maior);
		System.out.println ("");
		System.out.println (a);
		System.out.println (b);
		System.out.println (c);
		s.close();
	}
}
