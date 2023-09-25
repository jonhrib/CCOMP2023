import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2956 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		
		double area = ((num1*num2)/2.0);
		
		System.out.println("Concluimos que, dado o limite da entrada, a resposta seria:  y = f(x) = " + df.format(area) + ".");
	}
}
