import java.util.Scanner;

public class Bee1038 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int cod = s.nextInt();
		int qtd = s.nextInt();
		if (cod == 1) {
			System.out.printf ("Total: R$ %.2f%n", qtd*4.00);
		}
		if (cod == 2) {
			System.out.printf ("Total: R$ %.2f%n", qtd*4.50);
		}
		if (cod == 3) {
			System.out.printf ("Total: R$ %.2f%n", qtd*5.00);
		}
		if (cod == 4) {
			System.out.printf ("Total: R$ %.2f%n", qtd*2.00);
		}
		if (cod == 5) {
			System.out.printf ("Total: R$ %.2f%n", qtd*1.50);
		}
		s.close();
	}
}
