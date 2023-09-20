import java.util.*;

public class Bee2850 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			String comando= s.nextLine().replace(" ","");
			if (comando.equalsIgnoreCase("esquerda")) System.out.println ("ingles");
			else if (comando.equalsIgnoreCase("direita")) System.out.println ("frances");
			else if (comando.equalsIgnoreCase("nenhuma")) System.out.println ("portugues");
			else if (comando.equalsIgnoreCase("asduas")) System.out.println ("caiu");
		}
	}
}
