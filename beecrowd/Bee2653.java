import java.util.Scanner;

public class Bee2653 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int tipos = 0, diferente = 0;
		while (s.hasNext()) {
			int i = 1;
			String[] joia = new String [i];
			joia[i] = s.nextLine();
			i++;
			if (i > 1) {
				for (int j = 1; j <= i; j++) {
					if (joia[i] != joia[j]) diferente++;
				}
				if (diferente != i) tipos++; 
			}
		}
		System.out.println (tipos);
	}
}
