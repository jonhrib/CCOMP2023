import java.util.Scanner;

public class Bee3343 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int x = s.nextInt();
		String tamanhos = s.next();
		char vettita [] = tamanhos.toCharArray();
		int vetvalores [] = new int [3];
		for (int i = 0; i < vetvalores.length; i++) {
			vetvalores [i] = s.nextInt();
		}
		int tita [] = new int [qtd];
		for (int i = 0; i < qtd; i++) {
			if (vettita [i] == 'P') {
				tita[i] = vetvalores [0];  
			}
			else if (vettita [i] == 'M') {
				tita[i] = vetvalores [1];  
			}
			else if (vettita [i] == 'G') {
				tita[i] = vetvalores [2];  
			}
		}
		
		int muralhas[] = new int [qtd];
		for (int i = 0; i < muralhas.length; i++) {
			muralhas [i] = x;
		}
		
		int i = 0;
		while (i<qtd) {
			for(int j=0; j<qtd; j++) {
				if (muralhas[j]>=tita[i]) {
					muralhas[j]-=tita[i];
					break;
				}
				else if(tita[i]>muralhas[j]) {
					continue;
				}
			}i++;
		}
		int cont = 0;
		for(i=0; i<qtd; i++) {
			if (muralhas[i] != x) {
				cont++;;
			}
		}
		System.out.println(cont);
	}
}