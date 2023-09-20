import java.util.Scanner;

public class Bee2523 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			String alfabeto = s.next();
			int x = s.nextInt();
			int[] pos = new int [x];
			for (int i = 0; i < x; i++) {
				pos[i] = s.nextInt();
			}
			for (int i = 0; i < x; i++) {
				System.out.print (alfabeto.substring(pos[i],pos[i]));
			}
		}		
	}
}
