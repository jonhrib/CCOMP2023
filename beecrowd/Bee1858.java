import java.util.Scanner;

public class Bee1858 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int x;
		int menor = 0, posmenor = 0;
		for (int i = 1; i <= a; i++) {
			x = s.nextInt();
			if (i == 1) {
				menor = x;
				posmenor = 1;
			}
			else if (x < menor){
				menor = x;
				posmenor = i;
			}
		}
		System.out.println (posmenor);
		s.close();
	}
}
