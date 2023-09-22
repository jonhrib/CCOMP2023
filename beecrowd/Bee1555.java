import java.util.Scanner;

public class Bee1555 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			double maior = 0.0;
			
			double rafael = (Math.pow(3*x, 2)) + (Math.pow(y,2));
			double beto = (2*(Math.pow(x,2))) + (Math.pow(5*y, 2));
			double carlos = (-100*x + (Math.pow(y,3)));
			
			if (rafael > beto && rafael > carlos) System.out.println("Rafael ganhou");
			else if (beto > rafael && beto > carlos) System.out.println("Beto ganhou");
			else if (carlos > rafael && carlos > beto) System.out.println("Carlos ganhou");
			
		}
	}
}
