import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1214 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.000");
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int n = s.nextInt();
			int soma = 0;
			int valor [] = new int [n];
			
			for (int j = 0; j < n; j++) {
				valor[j] = s.nextInt();
				soma += valor[j];
			}
			
			double media = soma/n;
			double cont = 0;
			
			for (int j = 0; j < n; j++) {
				if (valor[j] > media) cont++;
			}
			
			double porc = (cont/n);
			porc = porc*100;
			
			System.out.println (df.format(porc) + "%");
		}
	}
}
