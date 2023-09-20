/*import java.util.Scanner;

public class Bee2812 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int qtd = s.nextInt();
			int vet [] = new int[qtd];
			int vetaux [] = new int [qtd];
			for (int j = 0; j < qtd; j++) {
				vet[j] = s.nextInt();
			}
			for (int k = 0; k < qtd; k++) {
				int auxt = 0;
				if (vet[k] % 2 != 0) {
					vetaux[auxt] = vet[k];
					auxt++;
				}
			}
			for (int l = 0; l < qtd; l++) {
				System.out.print (vetaux[l] + " ");
			}
		}
	}
}*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee2812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }

        // Criação da lista de números ímpares
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                impares.add(vetor[i]);
            }
        }

        // Ordenação da lista de números ímpares
        Collections.sort(impares);

        // Criação do vetor ordenado com base na especificação
        int[] ordenado = new int[tamanho];
        int indiceMaior = impares.size() - 1;
        int indiceMenor = 0;

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                ordenado[i] = impares.get(indiceMaior);
                indiceMaior--;
            } else {
                ordenado[i] = impares.get(indiceMenor);
                indiceMenor++;
            }
        }

        // Impressão do vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(ordenado[i] + " ");
        }

        sc.close();
    }
}

