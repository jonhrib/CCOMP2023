import java.util.Scanner;

public class Bee2003 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			String[] horario = s.nextLine().split(":");
			int y = Integer.parseInt(horario[0]);
			int x = Integer.parseInt(horario[1]);
			switch (y) {
			case (7) :
				System.out.println ("Atraso máximo: " + x); break;
			case (8) :
				System.out.println ("Atraso máximo: " + (x + 60)); break;
			case (9) : 
				System.out.println ("Atraso máximo: " + (120 + x)); break;
			default : System.out.println ("Atraso máximo: 0");
				
			}
		}
	}
}
