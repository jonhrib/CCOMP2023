import java.util.Scanner;

public class Bee3224 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String j = s.nextLine();
		String m = s.nextLine();
		if (j.length() < m.length()) {
			System.out.println ("no");
		}
		if (j.length() > m.length()) {
			System.out.println ("go");
		}
		s.close();
	}
}
