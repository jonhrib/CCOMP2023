import java.util.Scanner;

public class Bee2826 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String A = s.next();
		String B = s.next();
		if (A.compareTo(B) < 0) { //compare devolve negativo se A vier antes de B, 0 se forem iguais e um valor > 0 se A for depois de B
			System.out.println (A);
			System.out.println (B);
		}
		else if (A.compareTo(B) == 0) {
			if (A.length() > B.length()) {
				System.out.println (B);
				System.out.println (A);
			}
			else {
				System.out.println (A);
				System.out.println (B);
			}
		}
		else {
			System.out.println (B);
			System.out.println (A);
		}
	}
}
