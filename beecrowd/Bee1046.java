import java.util.Scanner;

public class Bee1046 {

	public static void main (String args []) {
		Scanner s =  new Scanner (System.in);
		int inicial = s.nextInt();
		int tfinal =  s.nextInt();
		if (tfinal > inicial) {
			System.out.println ("O JOGO DUROU " + (tfinal - inicial) + " HORA(S)" );
		}
		else if (tfinal < inicial) {
			System.out.println ("O JOGO DUROU " + (24 - (inicial - tfinal)) + " HORA(S)");
		}
		else System.out.println ("O JOGO DUROU 24 HORAS");
		s.close();
	}
}
