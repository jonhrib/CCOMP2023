import java.util.Scanner;

public class Bee3047 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		int m = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c, maior, soma;
		soma = a+b;
		c = m-soma;
		maior = a;
		if (b > maior) maior = b;
		if (c > maior) maior = c;
		System.out.println (maior);
	}
}
