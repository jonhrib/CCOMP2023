import java.util.Scanner;
import java.util.Arrays;
public class Bee3065 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int m = s.nextInt(), qtd = 0;
		while (m != 0) {
			String conta = s.next();
			String valores[] = conta.split("[\\W]"); // \\W significa o conjunto dos caracteres que não formam palavras
			String operacoes [] = conta.split("[\\w]"); // \\w significa o conjunto dos caracteres que formam palavras
			int j = 0, k = 0;
			int valor = 0;
			
			Integer [] values = Arrays.stream(valores) // array de strings em array de inteiros
					.map (Integer::parseInt)
					.toArray(Integer[]::new);
			
			String operacoesfinal [] = new String [conta.length()-1];
			
			for (int i = 0; i < operacoes.length; i++) {
				if (operacoes[i].equalsIgnoreCase("+") || operacoes[i].equalsIgnoreCase("-")) {
					operacoesfinal[j] = operacoes[i];
					j++;
				}
			}
			/*
			for (int i = 0; i < values.length; i++) {
				System.out.print (values[i] + " ");
			}
			System.out.println ();
			for (int i = 0; i < operacoesfinal.length; i++) {
				System.out.print (operacoesfinal[i] + " ");
			}
			System.out.println ();
			*/
			j = 0;
			for (int i = 0; i < values.length; i++) {
				if (i == 0) valor = values[i];
				else if (i < values.length) {
					if (operacoesfinal[j].equalsIgnoreCase("+")) {
						valor += values[i];
					}
					else valor -= values[i];
					j++;
				}
			}
			qtd++;
			System.out.println ("Teste " + qtd);
			System.out.println (valor);
			System.out.println ();
			m = s.nextInt();
		}
	}
}
