import java.util.Scanner;

public class Bee1743 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int vet1[] = new int [5];
		int vet2[] = new int [5];
		int cont = 0;
		
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = s.nextInt();
		}
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = s.nextInt();
		}
		for (int i = 0; i < vet1.length; i++) {
			if (vet1[i] == vet2[i]) cont++;
		}
		if (cont > 0) System.out.println ("N");
		else System.out.println ("Y");
	}
}
