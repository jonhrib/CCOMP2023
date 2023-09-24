import java.util.Scanner;

public class Bee1161 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			int num = s.nextInt();
			int num1 = s.nextInt();
			
			long fat = 1;
			for (int i = num; i > 0; i--) fat *= i;
			long soma = fat;
	
			fat = 1;
			for (int i = num1; i > 0; i--) fat *= i;
			soma += fat;
			
			System.out.println(soma);
		}
	}
}
