import java.util.Scanner;

public class Bee1173 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int[] a = new int [10]; 
		int x = s.nextInt();
		int aux = x;
		for (int i = 0; i < a.length; i++) {
			a[i] = aux;
			aux *= 2;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println ("N[" + i + "] = " + a[i]);
			}
		s.close();
	}
}