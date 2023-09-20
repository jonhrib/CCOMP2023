import java.util.Scanner;

public class Bee2160 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String nome = s.nextLine();
		if (nome.length() > 80)System.out.println ("NO");
		else System.out.println ("YES");
	}
}
