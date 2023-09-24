import java.util.Scanner;

public class Bee3454 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		String teste = s.next().toUpperCase();
		int cont = 0, contx = 0;
		
		for (int i = 0; i < teste.length(); i++) {
			if (teste.charAt(i) == 'O') cont++;
			if (teste.charAt(i) == 'X') contx++;
		}
		
		if (cont >= 2 || contx == 3) System.out.println("?");
		else if ((teste.charAt(0) == 'X' && teste.charAt(1) == 'O' && teste.charAt(2) == 'X')) {
			System.out.println("*");
		}
		else {
			System.out.println("Alice");
		}
	}
}
