import java.util.Scanner;

public class Bee1018 {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println (n);
		int aux100 = 0;
		int aux50 = 0;
		int aux20 = 0;
		int aux10 = 0;
		int aux5 = 0;
		int aux2 = 0;
		int aux1 = 0;
		int nota;
		nota = 100;
	    while (n >= nota) {
	    	aux100++;
	    	n = n-100;
	    }
	    nota = 50;
	    while (n >= nota) {
	    	aux50++;
	    	n = n-50;
	    }
	    nota = 20;
	    while (n >= nota) {
	    	aux20++;
	    	n = n-20;
	    }
	    nota = 10;
	    while (n >= nota) {
	    	aux10++;
	    	n = n-10;
	    }
	    nota = 5;
	    while (n >= nota) {
	    	aux5++;
	    	n = n-5;
	    }
	    nota = 2;
	    while (n >= nota) {
	    	aux2++;
	    	n = n-2;
	    }
	    nota = 1;
	    while (n >= nota) {
	    	aux1++;
	    	n = n-1;
	    }
		System.out.println (aux100 + " nota(s) de R$ 100,00");
		System.out.println (aux50 + " nota(s) de R$ 50,00");
		System.out.println (aux20 + " nota(s) de R$ 20,00");
		System.out.println (aux10 + " nota(s) de R$ 10,00");
		System.out.println (aux5 + " nota(s) de R$ 5,00");
		System.out.println (aux2 + " nota(s) de R$ 2,00");
		System.out.println (aux1 + " nota(s) de R$ 1,00");
		s.close();
	}
}
