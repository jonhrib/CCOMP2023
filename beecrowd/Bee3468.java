import java.util.Scanner;

public class Bee3468 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		String teste = s.next();
		
		if (teste.equalsIgnoreCase("oposicao") || teste.equalsIgnoreCase("contrariedade")) {
			System.out.println("mas");
		}
		else if (teste.equalsIgnoreCase("quantidade") || teste.equalsIgnoreCase("intensidade")) {
			System.out.println("mais");
		}
	}
}
