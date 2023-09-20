import java.util.Scanner;

public class Bee1794 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int roupas = s.nextInt();
		int la = s.nextInt(); int lb = s.nextInt();
		int sa = s.nextInt(); int sb = s.nextInt();
		if (roupas >= la && roupas <= lb) {
			if (roupas >= sa && roupas <= sb) {
				System.out.println ("possivel");
			}
			else System.out.println ("impossivel");
		}
		else {
			System.out.println ("impossivel");
		}
	}
}
