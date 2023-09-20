import java.util.Scanner;

public class Bee1198 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			long hashmat = s.nextLong();
			long oponente = s.nextLong();
			long maior = 0, menor = 0;
			
			if (hashmat > oponente){
				maior = hashmat;
				menor = oponente;
			}
			else {
				maior = oponente;
				menor = hashmat;
			}
			
			long dif = maior-menor;
			
			System.out.println (dif);
		}
	}
}
