package Atividade8;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Para a equação 'a', informe a: "); int a = s.nextInt();
		System.out.print("Para a equação 'a', informe b: "); int b = s.nextInt();
		
		double x = (Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("x = " + df.format(x));
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Para a equação 'b', informe a: "); a = s.nextInt();
		while (a == 0) {
			System.out.print("Para a equação 'b', informe a (diferente de 0): "); a = s.nextInt();
		}
		System.out.print("Para a equação 'b', informe b: "); b = s.nextInt();
		System.out.print("Para a equação 'b', informe c: "); int c = s.nextInt();
		
		double delta = ((Math.pow(b, 2))-4*a*c);
		if (delta < 0) System.out.println("Delta negativo, não possui raizes");
		else {
			x = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("xPositivo = " + df.format(x));
			System.out.println("|xPositivo| = " + df.format(Math.abs(x)));
		}
	}
}
