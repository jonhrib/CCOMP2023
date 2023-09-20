import java.util.Scanner;

public class Bee1329 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		
		while (qtd != 0) {
			int mary = 0; int john = 0;
			int vet [] = new int [qtd]; 
			
			for (int i = 0; i < qtd; i++) {
				vet[i] = s.nextInt();
				if (vet[i] == 0) mary++;
				else if (vet[i] == 1) john++;
			}
			System.out.println ("Mary won " + mary + " times and John won " + john + " times");
			qtd = s.nextInt();
		}
	}
}
