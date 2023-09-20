import java.util.Scanner;

public class Bee2455 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int p1 = s.nextInt();
		int c1 = s.nextInt();
		int p2 = s.nextInt();
		int c2 = s.nextInt();
		
		int aux1 = (p1*c1);
		int aux2 = (p2*c2);
		if (aux1 == aux2) System.out.println (0);
		else if (aux1 > aux2) System.out.println (-1);
		else if (aux2 > aux1) System.out.println (1);
	}
}
