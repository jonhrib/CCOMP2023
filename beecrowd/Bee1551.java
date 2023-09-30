import java.util.Scanner;

public class Bee1551 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		s.nextLine();
		char [] alfa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','v','w','x','y','z'};
		
		for (int i = 0; i < qtd; i++) {
			int cont = 0;
			String frase = s.nextLine();
			
			for (int k = 0; k < alfa.length; k++) {
				for (int j = 0; j < frase.length(); j++) {
					//System.out.println(frase.charAt(j) + " " + alfa[k] + " " + cont);
					if (frase.charAt(j) == alfa[k]) {
						cont++;
						break;
					}
				}
			}
			
			//System.out.println(cont);
			if (cont == 25) System.out.println("frase completa");
			else if (cont >= 13) System.out.println("frase quase completa");
			else System.out.println("frase mal elaborada");
		}
	}
}
