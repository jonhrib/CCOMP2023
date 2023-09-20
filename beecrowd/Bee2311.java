import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2311 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int x = s.nextInt();
		double maior = 0.0,menor = 0.0,soma = 0.0, notafinal = 0.0;
		double [] notas = new double [7];
		for (int i = 0; i < x ; i++) {
			String nome = s.next();
			double notap = s.nextDouble();
			soma = 0;
			for (int j = 0; j < notas.length; j++) {
				notas[j] = s.nextDouble();
				if (j == 0) {
					maior = notas[j];
					menor = notas[j];
				}
				else if (j > 0) {
					if (notas[j] > maior) {
						maior = notas[j];
					}
					if (notas[j] < menor) {
						menor = notas[j];
					}
				}
				soma += notas[j]; 
			}
			soma = soma - (maior+menor);
			notafinal = soma*notap;
			System.out.println (nome + " " + df.format(notafinal));
		}
	}
}
