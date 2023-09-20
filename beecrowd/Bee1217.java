import java.util.Scanner;
import java.text.*;

public class Bee1217 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int qtd = s.nextInt(); 
		s.nextLine();
		double soma = 0.0, mediavalor = 0.0, mediafrutas = 0; int cont = 0;
		
		for (int i = 0; i < qtd; i++) {
			double valor = s.nextDouble();
			s.nextLine();
			String frutas = s.nextLine();
			
			soma += valor;
			String fruta[] = frutas.split(" ");
			cont += fruta.length;
			
			System.out.println ("day " + (i+1) + ": " + fruta.length + " kg");
		}
		
		mediavalor = (double) soma/qtd;
		mediafrutas = (double) cont/qtd;
		System.out.println (df.format(mediafrutas) + " kg by day");
		System.out.println ("R$ " + df.format(mediavalor) + " by day");
	}
}
