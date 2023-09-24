import java.util.Scanner;

public class Bee3315 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int soma = 0, maior = 0; int [] valores = new int [7];
		
		for (int i = 0; i < 4; i++) {
			soma = 0;
			
			for (int j = 0; j < 7; j++) {
				valores[j] = s.nextInt();
				soma += valores[j];
			}
			
			if (i == 0) maior = soma;
			else if (soma > maior) maior = soma;
		}
		
		String binario = Integer.toBinaryString(maior);
		System.out.println(maior + " = " + binario);
	}
}
