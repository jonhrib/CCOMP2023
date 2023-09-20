import java.util.Scanner;

public class Bee2930 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int entrega = s.nextInt();
		int datafinal = s.nextInt();
		if (entrega > datafinal) System.out.println ("Eu odeio a professora!");
		else if (entrega < datafinal) {
			if (entrega+3 <= datafinal) System.out.println ("Muito bem! Apresenta antes do Natal!");
			else if (entrega+3 > datafinal) {
				System.out.println ("Parece o trabalho do meu filho!");
				entrega += 2;
				if (entrega < 24) System.out.println ("TCC Apresentado!");
				else System.out.println ("Fail! Entao eh nataaaaal!");
			}
		}
	}
}
