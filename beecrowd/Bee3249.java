import java.util.Scanner;

public class Bee3249 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), cont = 0;
		for (int i = 0; i < x; i++) {
			String palavra = s.next();
			int pos = -1;
			String cd = "CD";
			pos = palavra.indexOf(cd,pos);
			if (pos > -1) cont++; 
		}
		if (cont < x) System.out.println (x - cont);
		else System.out.println ("0");
	}
}
