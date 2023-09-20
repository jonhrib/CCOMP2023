import java.util.Scanner;

public class Bee2356 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			String D = s.next(); String S = s.next();
			if (D.contains(S)) {
				System.out.println("Resistente");
			}
			else {
				System.out.println("Nao resistente");
			}
		}
	}
}
