import java.util.Scanner;

public class Bee1072 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int[] a = new int [x];
		int ain = 0;
		int aout = 0;
		for (int i = 0; i < x; i++) {
			a[i] = s.nextInt();
			if (a[i] >= 10 && a[i] <= 20) ain++;
			else aout++;
		}
		System.out.println (ain + " in");
		System.out.println (aout + " out");
		s.close();
	}
}
