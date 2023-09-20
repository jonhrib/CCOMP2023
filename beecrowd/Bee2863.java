import java.util.*;

public class Bee2863 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double menor = 0;
		while (s.hasNext()) {
			int x =  s.nextInt();
			for (int i = 0;i < x;i++) {
				double valor = s.nextDouble();
				if (i == 0) menor = valor;
				else if (valor < menor) menor = valor;
			}
			System.out.println (menor);
		}
		s.close();
	}
}
