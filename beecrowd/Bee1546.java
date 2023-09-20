import java.util.Scanner;

public class Bee1546 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int dias = s.nextInt();
		
		for (int i = 0; i < dias; i++) {
			int feedbacks = s.nextInt();
			for (int j = 0; j < feedbacks; j++) {
				int cod = s.nextInt();
				if (cod == 1) System.out.println ("Rolien");
				if (cod == 2) System.out.println ("Naej");
				if (cod == 3) System.out.println ("Elehcim");
				if (cod == 4) System.out.println ("Odranoel");
			}
		}
	}
}
