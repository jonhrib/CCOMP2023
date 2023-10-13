package PacotePrincipal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Titulo(" Recebendo os dados ", "=");
		Recebimento();
		Titulo(" Finalizado ", ".");
	}
	
	public static void Recebimento () {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de estágios das instruções: ");
		int qtd = s.nextInt();
		Estagios vet [] = new Estagios [qtd];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Informe o nome do " + (i+1) + "º estágio: ");
			String nome = s.next();
			if (i > 0) {
				boolean teste = false;
				
				for (Estagios confere : vet) {
					if (confere != null) {
						if (confere.getNome().equals(nome)) {
							teste = true;
							break;
						}
					}
				}
				while (teste) {
					for (Estagios confere : vet) {
						if (confere != null) {
							if (confere.getNome().equals(nome)) {
								teste = true;
								break;
							}
							else teste = false;
						}
					}
					if (teste) {
						System.out.print("Informe um nome válido para o " + (i+1) + "º estágio: ");
						nome = s.next();
					}
				}
			}
			
			System.out.print("Informe o tempo necessário para o " + (i+1) + "º estágio: ");
			int tempo = s.nextInt();
			while (tempo < 1) {
				System.out.print("Informe um tempo válido (maior que 0) para o " + (i+1) + "º estágio: ");
				tempo = s.nextInt();
			}
			
			Estagios aux = new Estagios(nome,tempo);
			vet[i] = aux;
		}
		
		int soma = 0;
		
		for (Estagios aux : vet) {
			soma += aux.getTempo();
		}
		
		System.out.print("Digite a quantidade de tempo (x): ");
		int auxtempo = s.nextInt();
		System.out.print("Digite a quantidade de instruções (y): ");
		int auxinstrucoes = s.nextInt();
		
		Titulo(" Iniciando Impressão do Diagrama de Tempo ", "=");
		Impressao(auxtempo,auxinstrucoes, soma, vet, qtd);
	}
	
	public static void Impressao (int tempo, int instrucoes, int soma, Estagios[] vet, int qtd) {
		int cont = 0;
		
		Titulo("Tempo"," ");
		
		for (int i = 0; i < tempo; i++) {
			if (i == 0) System.out.print("   " + (i+1) + "   ");
			else System.out.print((i+1) + "   ");
		}
		System.out.println("");
		
		for (int i = 0; i < instrucoes; i++) { //linha
			
			if (i >= 9)System.out.print((i+1) + " "); 
			else System.out.print((i+1) + "  "); 
			
			int h = 0, j = 0;
			while (h < tempo) { //coluna 
				if (cont != 0 && h < cont) {
					if (h < tempo) {
						if (h >= 9) System.out.print("X    ");
						else System.out.print("X   ");
						h++;
					}
					else {
						System.out.print("X\n");
						h++;
					}
				}
				else if (h < soma+cont) {
					if (vet[j].getTempo() == 1) {
						if (h >= 9) System.out.print(vet[j].getNome() + "   ");
						else System.out.print(vet[j].getNome() + "  ");
						h++;
					}
					else {
						int limite = h + vet[j].getTempo();
						if (limite > (tempo)) {
							int dif = (limite-tempo);
							int result = (limite-dif)-h;
							for (int k = 0; k < result; k++) {
								if (h >= 9) System.out.print(vet[j].getNome() + "   ");
								else System.out.print(vet[j].getNome() + "  ");
								h++;
							}
						}
						else {
							for (int k = 0; k < vet[j].getTempo(); k++) {
							if (h >= 9) System.out.print(vet[j].getNome() + "   ");
							else System.out.print(vet[j].getNome() + "  ");
							h++;
							} 
						}
					}
					j++;
				}
				else {
					if (h < tempo) {
						if (h >= 9) System.out.print("X    ");
						else System.out.print("X   ");
						h++;
					}
					else {
						System.out.print("X\n");
						h++;
					}
				}
			}
			cont++; //cont é igual a i
			System.out.println("");
		}
	}
	
	public static void Titulo (String texto, String tipo) {
		for (int i = 0; i < ((80-texto.length())/2); i++) {
			System.out.print(tipo); 
		}
		System.out.print(texto);  //imprime o conteúdo recebido por parâmetro, entre cadeias de "="
		for (int i = 0; i < ((80-texto.length())/2); i++) {
			System.out.print(tipo);
		}
		 System.out.println();
	}
}
