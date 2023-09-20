import java.util.Scanner;

public class Bee2006 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int aux = 0;
		int [] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
			if (a[i]==x) aux++;
		}
		System.out.println (aux);
	}
}
