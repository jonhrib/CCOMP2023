import java.util.Scanner;

public class Bee2694 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			String frase = s.next();
			String numeros [] = frase.split("\\D+");//pega somente números;
			int soma = 0;
			
			for (int j = 0; j < numeros.length; j++) {
				if (!numeros[j].isEmpty()) {
				    int aux = Integer.parseInt(numeros[j]);
				    soma += aux;
				}
			}
			System.out.println (soma);
		}
	}
}
