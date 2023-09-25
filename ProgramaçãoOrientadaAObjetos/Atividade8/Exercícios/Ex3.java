package Atividade8;
import java.text.DecimalFormat;

public class Ex3 {

	public static void main (String args []) {
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double numeros [] = {10.5,-32.5,-0.1,-0.9,3.9,3.1};
		char letras [] = {'a','b','c','d','e','f'};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(letras[i] + ": " + Math.abs(numeros[i]));
			System.out.println(letras[i] + ": " + Math.floor(numeros[i]));
			System.out.println(letras[i] + ": " + Math.ceil(numeros[i]));
			System.out.println(letras[i] + ": " + Math.rint(numeros[i]));
			System.out.println(letras[i] + ": " + Math.round(numeros[i]));
			System.out.println("-------------------------");
		}
	}
}
