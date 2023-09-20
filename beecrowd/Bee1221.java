import java.util.Scanner;

public class Bee1221 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int num = s.nextInt();
			boolean teste = testarprimo(num);
			if (teste == false) System.out.println("Not Prime");
			else System.out.println("Prime");
		}
	}
	
	public static boolean testarprimo (int numero) {
		if (numero <= 1) {
	        return false;
	    }
	    
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
