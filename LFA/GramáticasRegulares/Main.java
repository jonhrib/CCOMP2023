package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import Objeto.Produções;

public class Main {
	
	//tratar a possibilidade de um estado inicial possuir mais de uma produção, como S>aA e S>bB (recomendável utilizar pilha);
	
	protected static ArrayList<Produções> ordens = new ArrayList <Produções>(); // Lista para armazenar as ordens de produções recebidas
	protected static ArrayList<String> completos = new ArrayList <String>(); // Lista para armazenar as ordens de produção na ordem em que são usadas
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("\u001B[1m\u001B[33m"); // negrito + amarelo
		Titulo (" Gramática Regular LFA ", "-"); // chama a função que imprime títulos
		System.out.print("\u001B[0m"); //reset
		
		System.out.print("Digite 1 para GLUD e 2 para GLUE: "); 
		int escolha = s.nextInt(); // recebe a escolha do usuário
		while (escolha != 1 && escolha != 2) { // se o valor recebido não for correspondente nem a GLUD e nem a GlUE, pedimos o valor novamente
			System.out.print("Digite 1 para GLUD e 2 para GLUE: "); 
				escolha = s.nextInt();
		}
		
		Recebe (escolha); // chama a função que recebe os dados, passando a escolha de parâmetro para controlar o recebimento das ordens de produção
	}
	
	public static void Recebe (int escolha) { // a função Recebe recebe os dados referentes a descrição formal, incluindo as ordens de produção
		Scanner s = new Scanner (System.in);

		System.out.print ("Digite a quantidade de variáveis (V): "); int tamanhoV = s.nextInt(); // recebe a quantidade de variáveis
		
		char variaveis [] = new char [tamanhoV]; //  cria o vetor variáveis
		
		for (int i = 0; i < tamanhoV; i++) {
			System.out.print("Digite a " + (i+1) + "ª variável: "); variaveis[i] = s.next().charAt(0); // recebe cada uma das variáveis
		}
		
		System.out.print ("Digite a quantidade de alfabeto da linguagem (T) - terminal: "); int tamanhoT = s.nextInt(); // recebe a quantidade de terminais
		
		char terminais [] = new char [tamanhoT]; // cria o vetor terminais
		
		for (int i = 0; i < tamanhoT; i++) {
			System.out.print("Digite o " + (i+1) + "º caractere do alfabeto: "); terminais[i] = s.next().charAt(0); // recebe cada um dos terminais
		}
		
		System.out.print("Digite o símbolo de inicio: "); char inicio = s.next().charAt(0); // recebe o símbolo inicial
		
		System.out.print ("Digite a quantidade de ordens de produção: "); int tamanhoordens = s.nextInt(); // recebe a quantidade de ordens de produção
		
		if (escolha == 1) { // se a escolha foi GLUD
			System.out.print("\u001B[1m"); // negrito
			Titulo("","-");
			System.out.println("--> Digite no padrão A>bC "); // imprime as orientações para o recebimento das ordens de produção do tipo GLUD
			System.out.println("--> A e C pertencentes à V ");
			System.out.println("--> b pertencente à T");
			System.out.println("--> para simbolizar brancos utilize * ");
			Titulo("","-");
			System.out.print("\u001B[0m"); //reset
			
			for (int i = 0; i < tamanhoordens; i++) {
				System.out.println("Digite a " + (i+1) + "ª ordem de produção: ");
				String ordem = s.next(); // recebe a ordem de produção atual em uma String "auxiliar"
				
				Produções p = new Produções(ordem,escolha); // passa a ordem e a escolha para a classe objeto
				
				ordens.add(p); // adiciona o objeto à lista de ordens de produção
				
			}
		}
		else if (escolha == 2) { // se a escolha foi GLUE
			System.out.print("\u001B[1m"); // negrito
			Titulo("","-");
			System.out.println("--> Digite no padrão A>Bc "); // imprime as orientações para o recebimento das ordens de produção do tipo GLUD
			System.out.println("--> A e B pertencentes à V ");
			System.out.println("--> c pertencente à T");
			System.out.println("--> para simbolizar brancos utilize * ");
			Titulo("","-");
			System.out.print("\u001B[0m"); // reset
			
			for (int i = 0; i < tamanhoordens; i++) {
				System.out.println("Digite a " + (i+1) + "ª ordem de produção: ");
				String ordem = s.next(); // recebe a ordem de produção tual em uma String "auxiliar"
				
				Produções p = new Produções(ordem,escolha); // passa a ordem e a escolha para a classe objeto
				
				ordens.add(p); // adiciona o objeto à lista de ordens de produção
			}
		}
		
		System.out.print("\u001B[1m\u001B[33m"); // negrito + amarelo
		Titulo(" Descrição Formal ","-");
		
		System.out.print("V = {"); 
		for (int i = 0; i < variaveis.length; i++) { // imprime as variáveis recebidas
			if (i < variaveis.length-1) {
				System.out.print(variaveis[i] + ",");
			}
			else System.out.print(variaveis[i] + "}\n");
		}
		System.out.print("T = {"); 
		for (int i = 0; i < terminais.length; i++) { // imprime os terminais recebidos
			if (i < terminais.length-1) {
				System.out.print(terminais[i] + ",");
			}
			else System.out.print(terminais[i] + "}\n");
		}
		System.out.println("S = " + inicio); // imprime o símbolo de partida
		System.out.print("P = {"); 
		for (int i = 0; i < ordens.size(); i++) { // imprime as ordens de produção recebidas
			if (i == 0) System.out.println(ordens.get(i).getTotal());
			else if (i < ordens.size() -1) System.out.println("     " + ordens.get(i).getTotal());
			else System.out.print("     " + ordens.get(i).getTotal());
		}
		System.out.print("}\n");
		Titulo("","-");
		System.out.print("\u001B[0m"); //reset
		
		System.out.print("Digite a palavra: "); String palavra = s.next(); // recebe a palavra a ser testada
		
		Executa (palavra,inicio,escolha); // chama a função de execução, passando a palavra a ser testada, o símbolo de inicio e a escolha de GLUD ou GLUE
		
//		for (Produções aux : ordens) {
//			System.out.println("Atual: " + aux.getAtual());
//			System.out.println("Futuro: " + aux.getFuturo());
//			System.out.println("Terminal: " + aux.getTerminal());
//		}
		
	}
	
	public static void Executa (String palavra, char inicio, int escolha) { // função que executa a passagem e conferência pelas ordens de produção
		Scanner s = new Scanner(System.in);
		
		char inicioaux = inicio; // guarda o símbolo inicial em um auxiliar, para não sofrer as mudanças
		completos.clear(); // limpa a lista das ordens de produção passadas, garantindo que está sempre vazio ao entrar na execução
		
		if (escolha == 1) { // se o usuário escolheu GLUD
		
			StringBuilder auxiliar = new StringBuilder(); // cria-se uma StringBuilder auxiliar
			auxiliar.append(palavra); // coloca-se a palavra nessa StringBuilder
			auxiliar.append('*'); //coloca-se um símbolo de vazio ao final dessa StringBuilder
			String palavraaux = auxiliar.toString(); // a String palavraaux recebe a StringBuilder auxiliar
			
			char atual = inicio; // atual recebe o símbolo inicial, indicando que começamos a execução por ele
			
			for (int i = 0; i < palavraaux.length(); i++) { // uma repetição que percorre cada caractere da palavraaux (palavra+*)
				for (Produções aux : ordens) { // uma repetição que percorre todas as ordens recebidas
					if (atual == aux.getAtual()) { // se o "estado" atual é igual ao atual da ordem atual
						if (palavraaux.charAt(i) == aux.getTerminal()) { // se o caractere atual da palavraaux é igual ao caractere terminal da ordem atual
							atual = aux.getFuturo(); // atual recebe o "estado" futuro, ou seja, a variável futura
						//	aux.setPassou(1);
							completos.add(aux.getTotal()); // adicionamos a ordem de produção em sua totalidade a Lista de ordens de produção que passamos
							break; // encerra a repetição das ordens
						}
					}
				}
			}
			
			boolean teste = Verifica(palavra,escolha); // executa a função que verifica se a palavra gerada pelas ordens passadas é igual a palavra que o usuário forneceu
			if (teste) { // se as palavras são iguais
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA FOI ACEITA ", "-"); // imprime que a palavra foi aceita
				Imprime(escolha); //imprime as ordens de produção que passamos e a formação da palavra
				System.out.print("\u001B[0m"); //reset
			}
			else {
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA NÃO FOI ACEITA ", "-"); // imprime que a palavra não foi aceita
				Titulo("","."); 
				System.out.print("\u001B[0m"); //reset
			}
		}
		else if (escolha == 2){ // se o usuário escolheu GLUE
			StringBuilder auxiliar = new StringBuilder(); // cria-se uma StringBuilder auxiliar
			auxiliar.append(palavra); // adiciona-se a palavra original a StringBuilder
			auxiliar.insert(0,'*'); // adiciona-se o caractere * no começo da palavra
			String palavraaux = auxiliar.toString(); // palavraaxiliar recebe a StringBuilder
			
			char atual = inicio; // atual recebe o símbolo de inicio, indicando que começamos a execução por ele
			
			for (int i = palavraaux.length()-1; i >= 0; i--) { // percorre a palavraaux(*+palavra), mas começando do final dela e indo até o segundo caractere (sem o *)
				for (Produções aux : ordens) { // percorre as ordens de produção recebidas
					if (atual == aux.getAtual()) { // se a variável atual for igual a variável atual da minha ordem de produção
						if (palavraaux.charAt(i) == aux.getTerminal()) { // se o caractere atual da palavraaux for igual ao terminal da ordem de produção
							atual = aux.getFuturo(); // atual recebe a variável futura
						//	aux.setPassou(1);
							completos.add(aux.getTotal()); //adiciona a ordem de produção a lista de ordens que passamos
							break; // interrompe a repetição das ordens
						}
					}
				}
			}
			
//			if (completos.size() == palavraaux.toString().length()) {
//				Titulo(" A PALAVRA FOI ACEITA ", "-");
//				Imprime(escolha);
//			}
			
			boolean teste = Verifica(palavra,escolha); // executa a função que verifica se a palavra gerada pelas ordens passadas é igual a palavra que o usuário forneceu
			if (teste) { // se as palavras são iguais
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA FOI ACEITA ", "-"); // imprime que a palavra foi aceita
				Imprime(escolha); //imprime as ordens de produção que passamos e a formação da palavra
				System.out.print("\u001B[0m"); //reset
			}
			else {
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA NÃO FOI ACEITA ", "-"); // imprime que a palavra não foi aceita
				Titulo("","."); 
				System.out.print("\u001B[0m"); //reset
			}
		}
		
		System.out.println("Deseja testar outra palavra? 1 - SIM | 2 - NÃO"); int e = s.nextInt(); // recebe do usuário a informação se devemos testar uma nova palavra ou encerrar a execução
		
		if (e == 1) {
			System.out.print("Digite a palavra: "); String palavraaux = s.next(); // se formos testar outra palavra, recebemos ela
			Executa(palavraaux,inicioaux,escolha); // chama-se a função de execução, passando a nova palavra e o símbolo de partida que salvamos
		}
		else { 
			System.out.print("\u001B[1m");
			Titulo(" Obrigado ","."); // "encerra a execução" com uma mensagem
			System.out.print("\u001B[0m");
		}
	}
	
	public static boolean Verifica (String palavra, int escolha) { // função que verifica a palavra produzida pelas ordens de produção passadas e a compara com aquela que o usuário forneceu
		boolean teste = false; // cria-se uma variável para, quando verdadeira, indicar que as palavras são iguais
		
		if (escolha == 1) { // se GLUD

			int cont = 0; int contadorpos = 0; // cont e contadorpos são criados, inicalizando em 0
			
			for (Produções aux: ordens) { // percorremos as ordens originais, contando elas
				cont++;
				if (aux.getPos()== 0) aux.setPos(cont); // se o campo pos da ordem de produção estiver vazio (zero), colocamos o contador nele, ou seja, estamos enumerando as posições existentes
			}
			
			StringBuilder auxiliar = new StringBuilder(); // cria-se uma StringBuilder auxiliar
			
			for (String aux : completos) { // uma repetição que percorre as ordens que passamos na execução
				for (Produções aux1 : ordens) { // uma repetição que percorre as ordens originais
					if (aux1.getTotal().equals(aux)) { // se a ordem total original for igual a ordem da lista completos
						if (aux1.getPos() == 1 || contadorpos == 0) { // se a posição da orde original for 1 ou o contadopos, ou seja, se é a minha primeira ordem a ser verificada
							auxiliar.append(aux1.getTerminal()); // auxiliar (StringBuilder) recebe o terminal da ordem ao seu final
							auxiliar.append(aux1.getFuturo()); // auxiliar recebe, ao seu final, a variável futura
							contadorpos++; // contadorpos aumenta, indicando que uma ordem já passou
						}
						else { // se não
							auxiliar.setCharAt(auxiliar.length()-1, aux1.getTerminal()); // auxiliar substitui a sua última posição (variável futura) pelo terminal da ordem
							auxiliar.append(aux1.getFuturo()); //coloca ao final do auxiliar a variável futura
						}
					}
				}
			}
			
			int indice = auxiliar.indexOf("*"); // encontra a primeira aparição do asterisco na palavra auxiliar
			
			while (indice != -1) { // enquanto a posição não for -1 (naço existir mais aparições)
				auxiliar.deleteCharAt(indice); // apagamos a posição que aparece o *
				indice = auxiliar.indexOf("*"); // encontramos a próxima posição em que * aparece
			}
			
			if (auxiliar.toString().equals(palavra)) teste = true; // se auxiliar (sem *) for igual a palavra, devolvo true
			
		}
		else if (escolha == 2) { // se GLUE
			int cont = 0; int contadorpos = 0; // cont e contadorpos são criados, inicalizando em 0
			
			for (Produções aux: ordens) { // percorremos as ordens originais, contando elas
				cont++;
				if (aux.getPos()== 0) aux.setPos(cont); // se o campo pos da ordem de produção estiver vazio (zero), colocamos o contador nele, ou seja, estamos enumerando as posições existentes
			}
			
			StringBuilder auxiliar = new StringBuilder(); // cria-se uma StringBuilder auxiliar
			
			for (String aux : completos) { // uma repetição que percorre as ordens que passamos na execução
				for (Produções aux1 : ordens) { // uma repetição que percorre as ordens originais
					if (aux1.getTotal().equals(aux)) { // se a ordem total original for igual a ordem da lista completos
						if (aux1.getPos() == 1 || 	contadorpos == 0) { // se a posição da orde original for 1 ou o contadopos, ou seja, se é a minha primeira ordem a ser verificada
							auxiliar.insert(0,aux1.getTerminal()); // auxiliar recebe em seu início o terminal da ordem
							auxiliar.insert(0,aux1.getFuturo()); // auxiliar recebe em seu inicio a variável futura
							contadorpos++; // contadorpos aumenta, indicando que uma ordem já passou
						}
						else {
							auxiliar.setCharAt(0, aux1.getTerminal()); // trocamos a primeira posição do auxiliar (a variável futura) pelo terminal da ordem
							auxiliar.insert(0,aux1.getFuturo()); // colocamos na primeira posição a variável futura
						}
					}
				}
			}
			
			int indice = auxiliar.indexOf("*"); // encontra a primeira aparição do asterisco na palavra auxiliar
			
			while (indice != -1) { // enquanto a posição não for -1 (naço existir mais aparições)
				auxiliar.deleteCharAt(indice); // apagamos a posição que aparece o *
				indice = auxiliar.indexOf("*"); // encontramos a próxima posição em que * aparece
			}
			
			if (auxiliar.toString().equals(palavra)) teste = true; // se auxiliar (sem *) for igual a palavra, devolvo true
			
		}
		
		return teste; // retorna o resultado
	}
	
	public static void Imprime (int escolha) { // função que imprime as ordens de produção passadas pela execução e as palavras sendo formadas
		//Scanner s = new Scanner (System.in);
		
		if (escolha == 1) { // se GLUD
		
		Titulo(" Ordens de produção passadas pelo algoritmo ", "."); // imprime título
		int contadorpos = 0; // contadorpos recebe 0
		
//		for (Produções aux: ordens) {
//			cont++;
//			if (aux.getPos()== 0) aux.setPos(cont);
//		}
		
		StringBuilder auxiliar = new StringBuilder(); // criamos uma StringBuilder auxiliar
		
		for (String aux : completos) { // percorre a lista de ordens passadas
			for (Produções aux1 : ordens) { // percorre a lista de ordens originais
				if (aux1.getTotal().equals(aux)) { // se a ordem original for igual a ordem que passamos
					System.out.println("<" + aux1.getPos() + "> " + aux); // imprime a posição da ordem em referência ao recebimento
					if (aux1.getPos() == 1 || contadorpos == 0) { // se a posição for 1 ou se o contadorpos for 0, ou seja, não tivermos acessado nenhuma ordem ainda
						auxiliar.append(aux1.getTerminal()); // auxiliar recebe em sua última posição o terminal
						auxiliar.append(aux1.getFuturo()); // auxiliar recebe em sua última posição a variável futura
						contadorpos++; // contadorpos aumenta
					}
					else {
						auxiliar.setCharAt(auxiliar.length()-1, aux1.getTerminal()); // modificamos a última inserção do auxiliar (variável futura) pelo terminal
						auxiliar.append(aux1.getFuturo()); // adicionamos a variável futura a última posição
					}
					
					int indice = auxiliar.indexOf("*"); // encontra a primeira aparição do asterisco na palavra auxiliar
					
					while (indice != -1) { // enquanto a posição não for -1 (naço existir mais aparições)
						auxiliar.deleteCharAt(indice); // apagamos a posição que aparece o *
						indice = auxiliar.indexOf("*"); // encontramos a próxima posição em que * aparece
					}
					
					System.out.println(auxiliar.toString()); //imprime cada interação da StringBuilder auxiliar
				}
			}
		}
		Titulo("","."); 
	
		}
		else if (escolha == 2) { // se 	GLUE
			Titulo(" Ordens de produção passadas pelo algoritmo ", "."); // imprime título
			int contadorpos = 0; // contadorpos recebe 0
			
//			for (Produções aux: ordens) {
//				cont++;
//				if (aux.getPos()== 0) aux.setPos(cont);
//			}
			
			StringBuilder auxiliar = new StringBuilder(); // criamos uma StringBuilder auxiliar
			
			for (String aux : completos) { // percorre a lista de ordens passadas
				for (Produções aux1 : ordens) { // percorre a lista de ordens originais
					if (aux1.getTotal().equals(aux)) { // se a ordem original for igual a ordem que passamos
						System.out.println("<" + aux1.getPos() + "> " + aux); // imprime a posição da ordem em referência ao recebimento
						if (aux1.getPos() == 1 || contadorpos == 0) { // se a posição for 1 ou se o contadorpos for 0, ou seja, não tivermos acessado nenhuma ordem ainda
							auxiliar.insert(0,aux1.getTerminal()); // auxiliar recebe em sua primeira posição o terminal
							auxiliar.insert(0,aux1.getFuturo()); // auxiliar recebe em sua primeira posição a variável futura
							contadorpos++; // contadorpos aumenta
						}
						else {
							auxiliar.setCharAt(0, aux1.getTerminal()); // modificamos a primeira posição do auxiliar (variável futura) pelo terminal
							auxiliar.insert(0,aux1.getFuturo()); // adicionamos a variável futura a primeira posição
						}
						
						int indice = auxiliar.indexOf("*"); // encontra a primeira aparição do asterisco na palavra auxiliar
						
						while (indice != -1) { // enquanto a posição não for -1 (naço existir mais aparições)
							auxiliar.deleteCharAt(indice); // apagamos a posição que aparece o *
							indice = auxiliar.indexOf("*"); // encontramos a próxima posição em que * aparece
						}
						
						System.out.println(auxiliar.toString()); //imprime cada interação da StringBuilder auxiliar
					}
				}
			}
			Titulo("","."); 	
		}
	}
	
	public static void Titulo (String texto, String tipo) { // função que imprime um "cabeçalho"
		for (int i = 0; i < ((70-texto.length())/2); i++) {
			System.out.print(tipo); 
		}
		System.out.print(texto);  //imprime o conteúdo recebido por parâmetro, entre cadeias de do texto escolhido, intitulado tipo
		for (int i = 0; i < ((70-texto.length())/2); i++) {
			System.out.print(tipo);
		}
		 System.out.println();
	}
}
