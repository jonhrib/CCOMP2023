import java.util.Scanner;

public class Bee3479 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String data = s.next();
		
		String dataaux[] = data.split("/");
		int dia = Integer.parseInt(dataaux[0]);
		int mes = Integer.parseInt(dataaux[1]);
		
		if (mes == 1) {
			if (dia <= 19) {
				System.out.println("capricornio");
			}
			else System.out.println("aquario");
		}
		else if (mes == 2) {
			if (dia <= 18) {
				System.out.println("aquario");
			}
			else System.out.println("peixes");
		}
		else if (mes == 3) {
			if (dia <= 20) {
				System.out.println("peixes");
			}
			else System.out.println("aries");
		}
		else if (mes == 4) {
			if (dia <= 20) {
				System.out.println("aries");
			}
			else System.out.println("touro");
		}
		else if (mes == 5) {
			if (dia <= 20) {
				System.out.println("touro");
			}
			else System.out.println("gemeos");
		}
		else if (mes == 6) {
			if (dia <= 20) {
				System.out.println("gemeos");
			}
			else System.out.println("cancer");
		}
		else if (mes == 7) {
			if (dia <= 22) {
				System.out.println("cancer");
			}
			else System.out.println("leao");
		}
		else if (mes == 8) {
			if (dia <= 22) {
				System.out.println("leao");
			}
			else System.out.println("virgem");
		}
		else if (mes == 9) {
			if (dia <= 22) {
				System.out.println("virgem");
			}
			else System.out.println("libra");
		}
		else if (mes == 10) {
			if (dia <= 22) {
				System.out.println("libra");
			}
			else System.out.println("escorpiao");
		}
		else if (mes == 11) {
			if (dia <= 21) {
				System.out.println("escorpiao");
			}
			else System.out.println("sagitario");
		}
		else if (mes == 12) {
			if (dia <= 21) {
				System.out.println("sagitario");
			}
			else System.out.println("capricornio");
		}
	}
}
