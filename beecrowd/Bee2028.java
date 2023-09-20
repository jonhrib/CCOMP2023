import java.util.Scanner;

public class Bee2028 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x, num;
		int aux = 1;
		while (s.hasNext()) {
			x = s.nextInt();
			num = 1;
			for (int i = 1; i <= x; i++) {
				num += i;
			}
			System.out.println ("Caso " + aux + ": " + num + " numero" + (num == 1 ? "" :"s"));
			for (int i = 0; i <= x; i++) {
				if (i == 0) {
					System.out.println ( x > 0 ? "0 ": "0");
					for (int j = 0; j < i; j++) {
						if (i == x && j == x-1) System.out.print(i);
						else System.out.print (i + " ");
					}
				}
			}
			System.out.println ("\n");
			aux++;
		}
	}
}
