import java.util.Scanner;

public class Bee3039 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), qtdc = 0, qtdb = 0;
		for (int i = 0; i < x; i++) {
			String nome = s.next();
			char sexo = s.next().charAt(0);
			if (sexo == 'M') qtdc++;
			else qtdb++;
		}
		System.out.println (qtdc + " carrinhos");
		System.out.println (qtdb + " bonecas");
	}
}
