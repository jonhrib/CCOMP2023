import java.util.Scanner;

public class Bee3004 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		for (int i = 0; i < qtd; i++) {
			int x1 = s.nextInt();
			int x2 = s.nextInt();
			int x3 = s.nextInt();
			int x4 = s.nextInt();
			
			if ((x1 < x3) && (x2 < x4) || (x1 < x4) && (x2 < x3)) System.out.println("S");
			else System.out.println("N");
		}
	}
}
