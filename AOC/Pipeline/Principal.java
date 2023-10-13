package PacotePrincipal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
		Scanner s = new Scanner (System.in);
		Titulo(" Recebendo os dados ", "="); //chama a função título, responsável por imprimir uma espécie de "cabeçalho"
		Recebimento(); // chama a função recebimento, responsável por realizar o recebimento das informações necessárias
		Titulo(" Finalizado ", "."); //chama a função título, responsável por imprimir uma espécie de "cabeçalho"
	}
	
	public static void Recebimento () { // função que realiza o recebimento das informações por meio do usuário
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de estágios das instruções: "); 
		int qtd = s.nextInt(); // recebe a quantidade de estágios de instruções desejadas
		Estagios vet [] = new Estagios [qtd]; // cria um vetor de objetos Estagios, para receber os nomes e tempos de cada um
		
		for (int i = 0; i < vet.length; i++) { // for para percorrer o vetor, preenchendo-o
			System.out.print("Informe o nome do " + (i+1) + "º estágio: ");
			String nome = s.next(); // recebe o nome
			if (i > 0) { //somente testa se o nome se repete após o primeiro nome, se houver
				boolean teste = false;
				
				for (Estagios confere : vet) { // verifica se o nome digitado não existe no vetor
					if (confere != null) {
						if (confere.getNome().equals(nome)) { // se o nome que foi recebido for igual a algum nome do vetor, teste recebe true e a procura para
							teste = true;
							break;
						}
					}
				}
				while (teste) { // caso existir, mantem o usuário em um loop até que ele digite um nome válido
					for (Estagios confere : vet) {
						if (confere != null) {
							if (confere.getNome().equals(nome)) { // a conferência é realizada de novo, dessa vez esperando que o usuário tenha digitado um valor válido
								teste = true; // se o usuário digitou um nome que ainda existe no vetor, o loop continua
								break;
							}
							else teste = false; // se o nome digitado agora é diferente de todos os nomes do vetor, o programa continua
						}
					}
					if (teste) { // se um nome foi encontrada sendo igual ao digitado, pedimos que seja digitado um novo
						System.out.print("Informe um nome válido para o " + (i+1) + "º estágio: ");
						nome = s.next();
					}
				}
			}
			
			System.out.print("Informe o tempo necessário para o " + (i+1) + "º estágio: "); 
			int tempo = s.nextInt(); // recebendo o tempo necessário para o estágio
			while (tempo < 1) { // caso o tempo informado seja menor que 1, um loop é acionado, exigindo um valor válido ao usuário
				System.out.print("Informe um tempo válido (maior que 0) para o " + (i+1) + "º estágio: ");
				tempo = s.nextInt();
			}
			
			Estagios aux = new Estagios(nome,tempo); // cria-se um objeto aux com o nome e tempo recebidos
			vet[i] = aux; //o objeto aux é colocado na posição correspondente do vetor vet
		}
		
		int soma = 0; // cria-se um variável soma, responsável por armazenar a soma de todos os tempos, de todos os estágios
		
		for (Estagios aux : vet) { // percorremos o vetor vet, captando a soma total dos tempos
			soma += aux.getTempo();
		}
		
		System.out.print("Digite a quantidade de tempo (x): ");
		int auxtempo = s.nextInt(); // recebe-se a quantidade de tempo desejada
		while (auxtempo < 1) { // caso o tempo informado seja menor que 1, um loop é acionado, exigindo um valor válido ao usuário
			System.out.print("Informe um tempo válido (maior que 0) para a quantidade de tempo: ");
			auxtempo = s.nextInt();
		}
		System.out.print("Digite a quantidade de instruções (y): ");
		int auxinstrucoes = s.nextInt(); // recebe-se a quantidade de instruções desejada
		
		Titulo(" Iniciando Impressão do Diagrama de Tempo ", "="); //imprime um título
		Impressao(auxtempo,auxinstrucoes, soma, vet, qtd); //chama a função Impressao, responsável por imprimir a representação do pipeline
	}
	
	public static void Impressao (int tempo, int instrucoes, int soma, Estagios[] vet, int qtd) { // função responsável pela impressão da representação do pipeline, em formato semelhante ao de uma matriz
		int cont = 0; // cria-se a variável cont que auxiliará na contagem de casas a frente da representação que serão "puladas"
		
		Titulo("Tempo"," "); // impressão de título
		
		for (int i = 0; i < tempo; i++) { // for que imprime os números referentes ao tempo
			if (i == 0) System.out.print("   " + (i+1) + "   ");
			else System.out.print((i+1) + "   ");
		}
		System.out.println("");
		
		for (int i = 0; i < instrucoes; i++) { //linha // for principal da estrutura de impressão, percorre as linhas (instruções)
			
			if (i >= 9)System.out.print((i+1) + " "); // impressão dos números referentes as instruções
			else System.out.print((i+1) + "  "); 
			
			int h = 0, j = 0; // h será a variável que controla as colunas, j a variável que acessa o vetor vet
			while (h < tempo) { // while que controla que h (coluna) é do tamanho de tempo
				if (cont != 0 && h < cont) { // se o contador for maior que 0 e a coluna for menor que esse contador, deve ser colocar um X no lugar (isso sempre acontece antes da impressão dos estágios)
					if (h < tempo) { //controla o tipo de impressão - quantidade de espaços e etc
						if (h >= 9) System.out.print("X    ");
						else System.out.print("X   ");
						h++; // o número de colunas aumenta 1
					}
					else { //controla o tipo de impressão - quantidade de espaços e etc
						System.out.print("X\n");
						h++; // o número de colunas aumenta 1
					}
				}
				else if (h < soma+cont) { // se a coluna for menor que soma+cont, ou seja, se estivermos no intervalo dos estágios, devemos realizar o seguinte
					if (vet[j].getTempo() == 1) { // se só existe uma unidade de tempo, imprimimos normalmente o nome do estágio
						if (h >= 9) System.out.print(vet[j].getNome() + "   ");
						else System.out.print(vet[j].getNome() + "  ");
						h++; // o número de colunas aumenta 1
					}
					else { // se a quantidade de tempo é maior que 1
						int limite = h + vet[j].getTempo(); // delimitei um limite, sendo o número da coluna+os tempos do estágio, para verificar se esse não excederá a quantidade geral de tempos
						if (limite > (tempo)) { // se o limite for maior que o tempo, ou seja, se a quantidade de tempo do estágio excederia a quantidade restante de tempo geral
							int dif = (limite-tempo); // calcula-se a diferença entre o limite e o tempo geral
							int result = (limite-dif)-h; // result encontra a quantidade que podemos imprimir daquele estágio
							for (int k = 0; k < result; k++) { // imprimo a quantidade necessária
								if (h >= 9) System.out.print(vet[j].getNome() + "   ");
								else System.out.print(vet[j].getNome() + "  ");
								h++; // o número de colunas aumenta 1
							}
						}
						else { // se o limite é menor que o tempo geral
							for (int k = 0; k < vet[j].getTempo(); k++) { // imprimimos normalmente o nome para cada tempo existente para o estágio
							if (h >= 9) System.out.print(vet[j].getNome() + "   ");
							else System.out.print(vet[j].getNome() + "  ");
							h++; // o número de colunas aumenta 1
							} 
						}
					}
					j++; // passamos a olhar para a próxima posição do vetor vet
				}
				else { // nenhuma das duas opções acima forem seguidas, devemos imprimir um X em cada posição, significando que estão vazias
					if (h < tempo) { //controla o tipo de impressão - quantidade de espaços e etc
						if (h >= 9) System.out.print("X    ");
						else System.out.print("X   ");
						h++; // o número de colunas aumenta 1
					}
					else { //controla o tipo de impressão - quantidade de espaços e etc
						System.out.print("X\n");
						h++; // o número de colunas aumenta 1
					}
				}
			}
			cont++; //cont é igual a i //cont aumenta 1 a cada linha que se passa
			System.out.println("");
		}
	}
	
	public static void Titulo (String texto, String tipo) { // função que imprime um "cabeçalho"
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
