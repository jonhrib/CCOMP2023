import java.util.Scanner;

public class Bee1212 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int num1 = -1; int num2 = -1;
		
		while (true) {
			num1 = s.nextInt();
			num2 = s.nextInt();
			
			if (num1 == 0 && num2 == 0) {
                break; // Sai do laço quando ambos os números forem zero
            }
			//
			int[] vetor1 = new int[String.valueOf(num1).length()];
			int[] vetor2 = new int[String.valueOf(num2).length()];
			
			int indice = vetor1.length - 1;
			while (num1 > 0) {
			    vetor1[indice] = num1 % 10;
			    num1 /= 10;					//transforma os inteiros para vetores de inteiros
			    indice--;
			}
			
			indice = vetor2.length - 1;
			while (num2 > 0) {
			    vetor2[indice] = num2 % 10;
			    num2 /= 10;
			    indice--;
			}
			//
			int cont = 0;
			for (int i = 0; i < vetor1.length; i++) {
				if ((vetor1[i] + vetor2[i])>=10) cont++;
			}
			if (cont == 0) {
				System.out.println("No carry operation.");
			}
			else if (cont == 1) System.out.println (cont + " carry operation.");
			else System.out.println (cont + " carry operations.");
		}
	}
}
