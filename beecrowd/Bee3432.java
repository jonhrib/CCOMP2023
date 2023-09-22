import java.util.Scanner;

public class Bee3432 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		boolean verifica = false;
		int bits[] = new int [8];
		
		for (int i = 0; i < bits.length; i++) {
			bits[i] = s.nextInt();
			if (bits[i] == 9) verifica = true;
		}
		
		if (verifica) System.out.println("F");
		else System.out.println("S");
	}
}
