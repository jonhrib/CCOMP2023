import java.util.*;

public class Bee3299 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String n = s.next();
		int pos = 0, cont = 0; String num = ("13");
		pos = n.indexOf (num, 0);
		if (pos > -1) System.out.println (n + " es de Mala Suerte");
		else System.out.println (n + " NO es de Mala Suerte");
	}
}
