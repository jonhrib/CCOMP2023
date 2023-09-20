import java.util.*;

public class Bee3306 {

	public static void MDC (int vetmdc[]) {
		int maior = 0; int x = 2; int auxm = 1; int ct =0; int parada = 0;
		for (int i = 0; i < vetmdc.length; i++) {
			if (i == 0) maior = vetmdc[i];
			else if (vetmdc[i] > maior) maior = vetmdc[i];
		}
		//for (int j = 0; j < vetmdc.length; j++) {
		//	System.out.print (vetmdc[j] + " ");
		//}
		//System.out.println();
		while (x <= maior && parada == 0) {
			ct = 0;
			for (int i = 0; i < vetmdc.length; i++) {
				if (vetmdc[i] % x == 0) {
					ct++;
					vetmdc[i] /= x;
					if (vetmdc[i] == 1) parada++;
				}
			}
			//for (int j = 0; j < vetmdc.length; j++) {
			//	System.out.print (vetmdc[j] + " ");
			//}
			//System.out.println();
			if (ct == vetmdc.length) auxm *= x;
			else if (ct == 0) x++;
		}
		System.out.println (auxm);
	}
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x,y;
		x = s.nextInt();
		y = s.nextInt();
		int vetor [] = new int [x];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = s.nextInt();
		}
		for (int i = 0; i < y; i++) {
			int indice = s.nextInt();
			if (indice == 1) {
				int auxvet [] = new int [3];
				for (int k = 0; k < auxvet.length; k++) {
					auxvet[k] = s.nextInt();
				}
				for (int j = (auxvet[0]-1); j < (auxvet[1]-1); j++) {
					vetor[j] += auxvet[2];
				}
			}
			else if (indice == 2) {
				i = 0;
				int auxvet [] = new int [2];
				for (int k = 0; k < auxvet.length; k++) {
					auxvet[k] = s.nextInt();
				}
				int vetmdc [] = new int [(auxvet[1]-auxvet[0])+1];
				for (int j = (auxvet[0]-1); j <= (auxvet[1]-1); j++) {
					vetmdc[i] = vetor[j];
					i++;
				}
				MDC (vetmdc);
			}
		}
		//for (int i = 0; i < vetor.length; i++) {
		//	System.out.print (vetor[i] + " ");
		//}
		//System.out.println ();
	}
}
