import java.util.Scanner;

public class Bee1240 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			String num1 = s.next();
			String num2 = s.next();
			if (num1.endsWith(num2)) System.out.println("encaixa"); //verifica se num1 termina com num2 (basicamente se num2 é sufixo de num1)
			else System.out.println("nao encaixa");
		}
	}
}
