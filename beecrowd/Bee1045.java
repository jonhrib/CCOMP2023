import java.util.Scanner;

public class Bee1045 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double maior;
		double menor;
		double meio = 0;
		
		if (a > b && a > c) maior = a;
		else if (b > c) maior = b;
		else maior = c;
		
		if (a < b && a < c) menor = a;
		else if (b < c) menor = b;
		else menor = c;
		
		if ((maior == a || menor == a) && (menor == b || maior == b)) meio = c;
		if ((maior == b || menor == b) && (menor == c || maior == c)) meio = b;
		if ((maior == c || menor == c) && (menor == b || maior == b)) meio = a;
		if ((maior == a || menor == a) && (menor == c || maior == c)) meio = b;
		
		a = maior;
		b = meio;
		c = menor;

		if (a >= b + c) System.out.println ("NAO FORMA TRIANGULO");
		else {
		if ((a*a) == (b*b)+(c*c)) System.out.println ("TRIANGULO RETANGULO");
		if (a*a > ((b*b)+(c*c)) && a < b +c) System.out.println ("TRIANGULO OBTUSANGULO");
		if (a*a < ((b*b)+(c*c))) System.out.println ("TRIANGULO ACUTANGULO");
		if (a == b && b == c) System.out.println ("TRIANGULO EQUILATERO");
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))  System.out.println ("TRIANGULO ISOSCELES");
		}
		s.close();
	}
	
}
