import java.util.Scanner;

public class Bee1021 {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		double n = s.nextDouble();
		int aux100 = 0;
		int aux50 = 0;
		int aux20 = 0;
		int aux10 = 0;
		int aux5 = 0;
		int aux2 = 0;
		int aux1 = 0;
		int aux05 = 0;
		int aux025 = 0;
		int aux010 = 0;
		int aux005 = 0;
		int aux01 = 0;
	    double nota;
	    double moeda;
		nota = 100.00;
	    while (n >= nota) {
	    	aux100++;
	    	n = n-100.00;
	    }
	    nota = 50.00;
	    while (n >= nota) {
	    	aux50++;
	    	n = n-50.00;
	    }
	    nota = 20.00;
	    while (n >= nota) {
	    	aux20++;
	    	n = n-20.00;
	    }
	    nota = 10.00;
	    while (n >= nota) {
	    	aux10++;
	    	n = n-10.00;
	    }
	    nota = 5.00;
	    while (n >= nota) {
	    	aux5++;
	    	n = n-5.00;
	    }
	    nota = 2.00;
	    while (n >= nota) {
	    	aux2++;
	    	n = n-2.00;
	    }
	    nota = 1.00;
	    while (n >= nota) {
	    	aux1++;
	    	n = n-1.00;
	    }
	    moeda = 0.50;
	    while (n >= moeda) {
	    	aux05++;
	    	n = n-0.50;
	    }
	    moeda = 0.25;
	    while (n >= moeda) {
	    	aux025++;
	    	n = n-0.25;
	    }
	    moeda = 0.10;
	    while (n >= moeda) {
	    	aux010++;
	    	n = n-0.10;
	    }
	    moeda = 0.05;
	    while (n >= moeda) {
	    	aux005++;
	    	n = n-0.05;
	    }
	    moeda = 0.01;
	    while (n >= moeda) {
	    	aux01++;
	    	n = n-0.01;
	    }
	    System.out.println ("NOTAS: ");
		System.out.println (aux100 + " nota(s) de R$ 100.00");
		System.out.println (aux50 + " nota(s) de R$ 50.00");
		System.out.println (aux20 + " nota(s) de R$ 20.00");
		System.out.println (aux10 + " nota(s) de R$ 10.00");
		System.out.println (aux5 + " nota(s) de R$ 5.00");
		System.out.println (aux2 + " nota(s) de R$ 2.00");
		System.out.println ("MOEDAS: ");
		System.out.println (aux1 + " moeda(s) de R$ 1.00");
		System.out.println (aux05 + " moeda(s) de R$ 0.50");
		System.out.println (aux025 + " moeda(s) de R$ 0.25");
		System.out.println (aux010 + " moeda(s) de R$ 0.10");
		System.out.println (aux005 + " moeda(s) de R$ 0.05");
		System.out.println (aux01 + " moeda(s) de R$ 0.01");
		s.close();
	}
}