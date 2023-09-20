import java.util.Scanner;

public class Bee2717 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int total = s.nextInt();
		int p = s.nextInt(); int f = s.nextInt();
		if ((f+p) <= total) System.out.println ("Farei hoje!");
		else System.out.println ("Deixa para amanha!");
	}
}
