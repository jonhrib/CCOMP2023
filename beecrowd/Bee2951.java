import java.util.Scanner;

public class Bee2951 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int gollum = s.nextInt();
		char runas [] = new char [qtd]; int amizade [] = new int [qtd];
		for (int i = 0; i < qtd; i++) {
			runas [i] = s.next().charAt(0);
			amizade [i] = s.nextInt();
		}
		int x = s.nextInt(), soma = 0;
		for (int i = 0; i < x; i++) {
			char teste = s.next().charAt(0);
			for (int j = 0; j < qtd; j++) {
				if (teste == runas[j]) soma += amizade[j];
			}
		}
		System.out.println (soma);
		if (soma >= gollum) System.out.println ("You shall pass!");
		else System.out.println ("My precioooous");
	}
}
