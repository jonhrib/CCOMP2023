import java.util.Scanner;

public class Bee2416 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int c = s.nextInt();
		int n = s.nextInt();
		
		int inteiro = (int) c/n;
		int aux = inteiro*n;
		int qtd = (c-aux);
		
		System.out.println (qtd);
	}
}
