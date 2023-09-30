import java.util.Scanner;

public class Bee2108 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String maiorpalavra = "";
		int maior = 0, cont = 0;
		
		String frase = s.nextLine();
		while (!frase.equals("0")) {
			
			String vet [] = frase.split(" ");
			
			for (int i = 0; i < vet.length; i++) {
				
				if (cont == 0) {
					maior = vet[i].length();
					maiorpalavra = vet[i];
				}
				else if (vet[i].length() >= maior) {
					maior = vet[i].length();
					maiorpalavra = vet[i];
				}
				
				if (i != vet.length-1) System.out.print(vet[i].length() + "-");
				else System.out.print(vet[i].length() + "\n");
				
				cont++;
			}
			frase = s.nextLine();
		}
		
		System.out.println("The biggest word: " + maiorpalavra);
	}
}
