import java.util.Scanner;

public class Bee1171 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int vet [] = new int [qtd];
		int vetcopy [] = new int [qtd];
		int auxrep [] = new int [qtd];
		
		for (int i = 0; i < qtd; i++) {
			vet [i] = s.nextInt();
		}
		for (int i = 0; i < qtd; i++) {
			vetcopy [i] = vet[i];
		}
		
	
		// retirar repetições
		int rep = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (vetcopy[i] == vetcopy[j]) {
					rep++;
					if (rep > 1) {
						vetcopy[j] = 0;
					}
				}
			}
			rep = 0;
		}
		
		ordenarCrescente(vetcopy); //vetcopy ordenado
		
		int k = 0;
		for (int i = 0; i < qtd; i++) {
			if (vetcopy[i] != 0) {
				for (int j = 0; j < qtd; j++) {
					//System.out.print (vetcopy[i] + " ");
					//System.out.println ();
					//System.out.print (vet[j] + " ");
					//System.out.println ();
					if (vetcopy[i] == vet[j]) {
						auxrep[k]++;
						//System.out.println (auxrep[k] + " e o k: " + k);
					}
				}
				k++;
			}
		}
		
		k = 0;
		for (int i = 0; i < qtd; i++) {
			if (vetcopy[i] != 0) {
				System.out.println (vetcopy[i] + " aparece " + auxrep[k] + " vez(es)");
				k++;
			}
		}
	}
	public static void ordenarCrescente(int[] vetor) {
        int n = vetor.length;
        boolean trocado;
        
        for (int i = 0; i < n - 1; i++) {
            trocado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos adjacentes se estiverem fora de ordem
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocado = true;
                }
            }
            
            // Se não houver trocas na passagem, o vetor já está ordenado
            if (!trocado) {
                break;
            }
        }
    }
}
