import java.util.Scanner;

public class Bee3302 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < x;i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < x; i++) {
			System.out.println ("resposta " + (i+1) + " : " + a[i]);
		}
		s.close();
	}
}
