import java.util.*;

public class Bee1871 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (true) {
			int x = s.nextInt();
			int y = s.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			
			int soma = x+y;
			String valor = Integer.toString(soma);
			valor = valor.replace("0","");
			soma = Integer.parseInt(valor);
			System.out.println (soma);
		}
	}
}
