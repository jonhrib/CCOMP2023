import java.util.Scanner;

public class Bee3303 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String palavra = s.nextLine();
		if (palavra.length() >= 10) {
			System.out.println ("palavrao");
		}
		else {
			System.out.println ("palavrinha");
		}
		s.close();
	}
}
