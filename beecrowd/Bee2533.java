import java.util.Scanner;

public class Bee2533 {

	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int M = leitor.nextInt();
			int totalC = 0;
			int totalNC = 0;
			for (int i = 0; i < M; i++) {
				double N = leitor.nextInt();
				double C = leitor.nextInt();
				totalNC += N * C;
				totalC += C;
			}
			double resultado = totalNC / (totalC * 100.0);
			System.out.println(String.format("%.4f", resultado));
		}
	}
	
}