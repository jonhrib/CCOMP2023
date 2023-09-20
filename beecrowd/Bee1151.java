import java.util.Scanner;

public class Bee1151 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int x1,x2,soma;
		x1 = 0;
		x2 = 1;
		soma = 0;
		System.out.print (x1 + " " + x2);
		for (int i = 0; i < x-2; i++) {
			soma = (x1+x2);
			System.out.print (" " + soma);
			x1 = x2;
			x2 = soma;
		}
	}
}
