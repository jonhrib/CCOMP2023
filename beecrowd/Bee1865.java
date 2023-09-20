import java.util.Scanner;

public class Bee1865 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String nome = s.next();
			int forca = s.nextInt();
			if (nome.equalsIgnoreCase("Thor")) System.out.println ("Y");
			else System.out.println ("N");
		}
	}
}
