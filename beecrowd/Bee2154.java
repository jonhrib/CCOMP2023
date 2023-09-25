import java.util.Scanner;

public class Bee2154 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			int elementos = s.nextInt(); 
			String nova = ""; String aux = nova;
			char sinal = '+';
			
			for (int i = 0; i < elementos; i++) {
				String elemento = s.next();
				if (i < elementos-1) {
					sinal = s.next().charAt(0);
				}
				String elementonum [] = elemento.split("x");
				
				int num1 = Integer.parseInt(elementonum[0]);
				int num2 = Integer.parseInt(elementonum[1]);
				
				if (i == 0) {
					if ((num2 -1) == 1) {
						nova = ((num1*num2) + "x");
						aux = nova;
					}
					else if ((num2 - 1) == 0) {
						nova = ((num1*num2) + "");
						aux = nova;
					}
					else {
						nova = ((num1*num2) + "x" + (num2-1));
						aux = nova;
					}
				}
				
				else {
					if ((num2 -1) == 1) {
						nova = (aux + " " + sinal + " " + (num1*num2) + "x");
						aux = nova;
					}
					else if ((num2 - 1) == 0) {
						nova = (aux + " " + sinal + " " + (num1*num2) + "");
						aux = nova;
					}
					else {
						nova = (aux + " " + sinal + " " + (num1*num2) + "x" + (num2-1));
						aux = nova;
					}
				}
			}
			System.out.println(nova);
		}
	}
}
