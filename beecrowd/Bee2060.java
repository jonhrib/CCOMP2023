import java.util.Scanner;

public class Bee2060 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int [] vet = new int [x];
		int cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0;
		for (int i = 0; i < x; i++) {
			vet[i] = s.nextInt();
			if (vet[i]%2 == 0) cont2++;
			if (vet[i]%3 == 0) cont3++;
			if (vet[i]%4 == 0) cont4++;
			if (vet[i]%5 == 0) cont5++;
		}
		System.out.println (cont2 + " Multiplo(s) de 2");
		System.out.println (cont3 + " Multiplo(s) de 3");
		System.out.println (cont4 + " Multiplo(s) de 4");
		System.out.println (cont5 + " Multiplo(s) de 5");
	}
}
