import java.util.Scanner;

public class Bee2708 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int soma = 0, jipes = 0;
		String entrada = s.next();
		while (entrada.equalsIgnoreCase("ABEND") == false) {
			int pass = s.nextInt();
			if (entrada.equalsIgnoreCase("SALIDA")) {
				soma += pass;
				jipes++;
			}
			else if (entrada.equalsIgnoreCase("VUELTA")) {
				soma -= pass;
				jipes--;
			}
			entrada = s.next();
		}
		System.out.println (soma);
		System.out.println (jipes);
	}
}
