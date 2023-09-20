import java.util.Scanner;

public class Bee2540 {

	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int votos = 0;
			for (int i = 0; i < N; i++) 
				votos += leitor.nextInt();
			double doisTercos = (2.0 * N) / 3.0;
			if (votos >= doisTercos)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}
	}
	
}