import java.util.Scanner;

public class Bee3342 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt(), brancas = 0, pretas = 0;
		n = (int) Math.pow(n, 2);
		pretas = (int) Math.ceil(n/2);
		brancas = n - pretas;
		System.out.println (brancas + " casas brancas e " + pretas + " casas pretas");
	}
}
