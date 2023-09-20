import java.util.Scanner;

public class Bee3147 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int h = s.nextInt();
		int e = s.nextInt();
		int a = s.nextInt();
		int o = s.nextInt();
		int w = s.nextInt();
		int x = s.nextInt();
		int somabem = (h+e+a+x);
		int somamal = (o+w);
		if (somabem > somamal) System.out.println ("Middle-earth is safe.");
		else System.out.println ("Sauron has returned.");
	}
}
