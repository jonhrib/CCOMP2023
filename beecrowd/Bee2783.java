import java.util.Scanner;

public class Bee2783 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int fig = s.nextInt(); int carimbadas = s.nextInt(); int qtd = s.nextInt();
		int carimbos [] = new int [carimbadas]; int vet [] = new int [qtd];
		for (int i = 0; i < carimbadas; i++) {
			carimbos [i] = s.nextInt();
		}
		for (int i = 0; i < qtd; i++) {
			vet[i] = s.nextInt();
		}
		int rep = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (vet[i] == vet[j]) {
					rep++;
					if (rep > 1) {
						vet[j] = 0;
					}
				}
			}
			rep = 0;
		}
		//for (int i = 0; i < qtd; i++) {
		//	System.out.print (vet[i] + " ");
		//}
		int qtdc = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < carimbadas; j++) {
				if (vet[i] == carimbos[j]) qtdc++;
			}
		}
		int result = carimbadas - qtdc;
		System.out.println (result);
	}
}
