import java.util.Scanner;

public class Bee2031 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String jog1 = s.next();
			String jog2 = s.next();
			if (jog1.equalsIgnoreCase("papel") && (jog2.equalsIgnoreCase("papel"))) System.out.println ("Ambos venceram");
			else if (jog1.equalsIgnoreCase("pedra") && (jog2.equalsIgnoreCase("pedra"))) System.out.println ("Sem ganhador");
			else if (jog1.equalsIgnoreCase("ataque") && (jog2.equalsIgnoreCase("ataque"))) System.out.println ("Aniquilacao mutua");
			else if (jog1.equalsIgnoreCase("ataque") && (jog2.equalsIgnoreCase("pedra"))) System.out.println ("Jogador 1 venceu");
			else if (jog1.equalsIgnoreCase("pedra") && (jog2.equalsIgnoreCase("ataque"))) System.out.println ("Jogador 2 venceu");
			else if (jog1.equalsIgnoreCase("pedra") && (jog2.equalsIgnoreCase("papel"))) System.out.println ("Jogador 1 venceu");
			else if (jog1.equalsIgnoreCase("papel") && (jog2.equalsIgnoreCase("pedra"))) System.out.println ("Jogador 2 venceu");
			else if (jog1.equalsIgnoreCase("ataque") && (jog2.equalsIgnoreCase("papel"))) System.out.println ("Jogador 1 venceu");
			else if (jog1.equalsIgnoreCase("papel") && (jog2.equalsIgnoreCase("ataque"))) System.out.println ("Jogador 2 venceu");
		}
	}
}
