import java.util.Scanner;

public class Bee3241 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String operacao = s.next();
			int pos = operacao.indexOf("+",0); 
			if (operacao.equalsIgnoreCase("P=NP")) System.out.println ("skipped");
			else {
				int num1 = Integer.parseInt(operacao.substring(0,pos));
				int num2 = Integer.parseInt(operacao.substring(pos,operacao.length()));
				System.out.println (num1+num2);
			}
		}
	}
}
