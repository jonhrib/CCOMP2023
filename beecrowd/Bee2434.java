import java.util.Scanner;

public class Bee2434 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int operações = s.nextInt(); int saldo = s.nextInt(); int aux = saldo, menor = 0;
		
		for (int i = 0; i < operações; i++) {
			int atual = s.nextInt();
			aux += atual;
			if (i == 0) menor = aux;
			else if (aux < menor) menor = aux; 
		}
		System.out.println (menor);
	}
}
