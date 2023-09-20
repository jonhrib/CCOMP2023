import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee3058 {

	public static void main (String args []) {
		DecimalFormat df = new DecimalFormat ("0.00");
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		double vetvalores [] = new double [qtd]; int vetqtd [] = new int [qtd];
		
		for (int i = 0; i < qtd; i++) {
			vetvalores [i] = s.nextDouble();
			vetqtd [i] = s.nextInt();
		}
		
		double valores [] = new double [qtd];
		double menor = 0;
		
		for (int i = 0; i < qtd; i++) {
			valores[i] = (vetvalores[i]*1000)/vetqtd[i];
			if (i == 0) {
				menor = valores[i];
			}
			else if (valores[i] < menor) menor = valores[i];
		}
		
		System.out.println (df.format(menor));
	}
}
