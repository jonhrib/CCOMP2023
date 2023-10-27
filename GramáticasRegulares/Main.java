package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import Objeto.Produções;

public class Main {
	
	//tratar a possibilidade de um estado inicial possuir mais de uma produção, como S>aA e S>bB (recomendável utilizar pilha);
	
	protected static ArrayList<Produções> ordens = new ArrayList <Produções>();
	protected static ArrayList<String> completos = new ArrayList <String>();
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("\u001B[1m\u001B[33m"); //negrito + amarelo
		Titulo (" Gramática Regular LFA ", "-");
		System.out.print("\u001B[0m"); //reset
		
		System.out.print("Digite 1 para GLUD e 2 para GLUE: "); 
		int escolha = s.nextInt();
		while (escolha != 1 && escolha != 2) {
			System.out.print("Digite 1 para GLUD e 2 para GLUE: "); 
			escolha = s.nextInt();
		}
		
		Recebe (escolha);
	}
	
	public static void Recebe (int escolha) {
		Scanner s = new Scanner (System.in);

		System.out.print ("Digite a quantidade de variáveis (V): "); int tamanhoV = s.nextInt();
		
		char variaveis [] = new char [tamanhoV];
		
		for (int i = 0; i < tamanhoV; i++) {
			System.out.print("Digite a " + (i+1) + "ª variável: "); variaveis[i] = s.next().charAt(0);
		}
		
		System.out.print ("Digite a quantidade de alfabeto da linguagem (T) - terminal: "); int tamanhoT = s.nextInt();
		
		char terminais [] = new char [tamanhoT];
		
		for (int i = 0; i < tamanhoT; i++) {
			System.out.print("Digite o " + (i+1) + "º caractere do alfabeto: "); terminais[i] = s.next().charAt(0);
		}
		
		System.out.print("Digite o símbolo de inicio: "); char inicio = s.next().charAt(0);
		
		System.out.print ("Digite a quantidade de ordens de produção: "); int tamanhoordens = s.nextInt();
		
		if (escolha == 1) {
			System.out.print("\u001B[1m");
			Titulo("","-");
			System.out.println("--> Digite no padrão A>bC ");
			System.out.println("--> A e C pertencentes à V ");
			System.out.println("--> b pertencente à T");
			System.out.println("--> para simbolizar brancos utilize * ");
			Titulo("","-");
			System.out.print("\u001B[0m"); //reset
			
			for (int i = 0; i < tamanhoordens; i++) {
				System.out.println("Digite a " + (i+1) + "ª ordem de produção: ");
				String ordem = s.next();
				
				Produções p = new Produções(ordem,escolha);
				
				ordens.add(p);
				
			}
		}
		else if (escolha == 2) {
			System.out.print("\u001B[1m");
			Titulo("","-");
			System.out.println("--> Digite no padrão A>Bc ");
			System.out.println("--> A e B pertencentes à V ");
			System.out.println("--> c pertencente à T");
			System.out.println("--> para simbolizar brancos utilize * ");
			Titulo("","-");
			System.out.print("\u001B[0m");
			
			for (int i = 0; i < tamanhoordens; i++) {
				System.out.println("Digite a " + (i+1) + "ª ordem de produção: ");
				String ordem = s.next();
				
				Produções p = new Produções(ordem,escolha);
				
				ordens.add(p);
			}
		}
		
		System.out.print("\u001B[1m\u001B[33m");
		Titulo(" Descrição Formal ","-");
		
		System.out.print("V = {"); 
		for (int i = 0; i < variaveis.length; i++) {
			if (i < variaveis.length-1) {
				System.out.print(variaveis[i] + ",");
			}
			else System.out.print(variaveis[i] + "}\n");
		}
		System.out.print("T = {"); 
		for (int i = 0; i < terminais.length; i++) {
			if (i < terminais.length-1) {
				System.out.print(terminais[i] + ",");
			}
			else System.out.print(terminais[i] + "}\n");
		}
		System.out.println("S = " + inicio);
		System.out.print("P = {"); 
		for (int i = 0; i < ordens.size(); i++) {
			if (i == 0) System.out.println(ordens.get(i).getTotal());
			else if (i < ordens.size() -1) System.out.println("     " + ordens.get(i).getTotal());
			else System.out.print("     " + ordens.get(i).getTotal());
		}
		System.out.print("}\n");
		Titulo("","-");
		System.out.print("\u001B[0m"); //reset
		
		System.out.print("Digite a palavra: "); String palavra = s.next();
		
		Executa (palavra,inicio,escolha);
		
//		for (Produções aux : ordens) {
//			System.out.println("Atual: " + aux.getAtual());
//			System.out.println("Futuro: " + aux.getFuturo());
//			System.out.println("Terminal: " + aux.getTerminal());
//		}
	}
	
	public static void Executa (String palavra, char inicio, int escolha) {
		Scanner s = new Scanner(System.in);
		
		char inicioaux = inicio;
		completos.clear();
		
		if (escolha == 1) {
		
			StringBuilder auxiliar = new StringBuilder();
			auxiliar.append(palavra);
			auxiliar.append('*');
			String palavraaux = auxiliar.toString();
			
			char atual = inicio;
			
			for (int i = 0; i < palavraaux.length(); i++) {
				for (Produções aux : ordens) {
					if (atual == aux.getAtual()) {
						if (palavraaux.charAt(i) == aux.getTerminal()) {
							atual = aux.getFuturo();
						//	aux.setPassou(1);
							completos.add(aux.getTotal());
							break;
						}
					}
				}
			}
			
			if (completos.size() == palavraaux.length()) {
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA FOI ACEITA ", "-");
				System.out.print("\u001B[0m"); //reset
				Imprime(escolha);
			}
			else {
				System.out.print("\u001B[1m"); //negrito
				Titulo(" A PALAVRA NÃO FOI ACEITA ", "-");
				System.out.print("\u001B[0m"); //reset
				Titulo("","."); 
			}
		}
		else if (escolha == 2){
			StringBuilder auxiliar = new StringBuilder();
			auxiliar.append(palavra);
			auxiliar.insert(0,'*');
			String palavraaux = auxiliar.toString();
			
			char atual = inicio;
			
			for (int i = palavraaux.length()-1; i >= 0; i--) {
				for (Produções aux : ordens) {
					if (atual == aux.getAtual()) {
						if (palavraaux.charAt(i) == aux.getTerminal()) {
							atual = aux.getFuturo();
						//	aux.setPassou(1);
							completos.add(aux.getTotal());
							break;
						}
					}
				}
			}
			
			
//			if (completos.size() == palavraaux.toString().length()) {
//				Titulo(" A PALAVRA FOI ACEITA ", "-");
//				Imprime(escolha);
//			}
			boolean teste = Verifica(palavra,escolha);
			if (teste) {
				Titulo(" A PALAVRA FOI ACEITA ", "-");
				Imprime(escolha);
			}
			else {
				Titulo(" A PALAVRA NÃO FOI ACEITA ", "-");
				Titulo("","."); 
			}
		}
		
		System.out.println("Deseja testar outra palavra? 1 - SIM | 2 - NÃO"); int e = s.nextInt();
		
		if (e == 1) {
			System.out.print("Digite a palavra: "); String palavraaux = s.next();
			Executa(palavraaux,inicioaux,escolha);
		}
		else {
			System.out.print("\u001B[1m");
			Titulo(" Obrigado ",".");
			System.out.print("\u001B[0m");
		}
	}
	
	public static boolean Verifica (String palavra, int escolha) {
		//Scanner s = new Scanner (System.in);
		boolean teste = false;
		
		if (escolha == 1) {

		int cont = 0; int contadorpos = 0;
		
		for (Produções aux: ordens) {
			cont++;
			if (aux.getPos()== 0) aux.setPos(cont);
		}
		
		StringBuilder auxiliar = new StringBuilder();
		
		for (String aux : completos) {
			for (Produções aux1 : ordens) {
				if (aux1.getTotal().equals(aux)) {
					if (aux1.getPos() == 1 || contadorpos == 0) {
						auxiliar.append(aux1.getTerminal());
						auxiliar.append(aux1.getFuturo());
						contadorpos++;
					}
					else {
							auxiliar.setCharAt(auxiliar.length()-1, aux1.getTerminal());
							auxiliar.append(aux1.getFuturo());
					}
				}
			}
		}
		
		int indice = auxiliar.indexOf("*");
		
		while (indice != -1) {
			auxiliar.deleteCharAt(indice);
			indice = auxiliar.indexOf("*");
		}
		
		if (auxiliar.toString().equals(palavra)) teste = true;
		

		}
		else if (escolha == 2) {
			int cont = 0; int contadorpos = 0;
			
			for (Produções aux: ordens) {
				cont++;
				if (aux.getPos()== 0) aux.setPos(cont);
			}
			
			StringBuilder auxiliar = new StringBuilder();
			
			for (String aux : completos) {
				for (Produções aux1 : ordens) {
					if (aux1.getTotal().equals(aux)) {
						if (aux1.getPos() == 1 || contadorpos == 0) {
							auxiliar.insert(0,aux1.getTerminal());
							auxiliar.insert(0,aux1.getFuturo());
							contadorpos++;
						}
						else {
								auxiliar.setCharAt(0, aux1.getTerminal());
								auxiliar.insert(0,aux1.getFuturo());
						}
					}
				}
			}
			
			int indice = auxiliar.indexOf("*");
			
			while (indice != -1) {
				auxiliar.deleteCharAt(indice);
				indice = auxiliar.indexOf("*");
			}
			
			if (auxiliar.toString().equals(palavra)) teste = true;
			
		}
		
		return teste;
	}
	
	public static void Imprime (int escolha) {
		//Scanner s = new Scanner (System.in);
		
		if (escolha == 1) {
		
		Titulo(" Ordens de produção passadas pelo algoritmo ", ".");
		int cont = 0; int contadorpos = 0;
		
		for (Produções aux: ordens) {
			cont++;
			if (aux.getPos()== 0) aux.setPos(cont);
		}
		
		StringBuilder auxiliar = new StringBuilder();
		
		for (String aux : completos) {
			for (Produções aux1 : ordens) {
				if (aux1.getTotal().equals(aux)) {
					System.out.println("<" + aux1.getPos() + "> " + aux);
					if (aux1.getPos() == 1 || contadorpos == 0) {
						auxiliar.append(aux1.getTerminal());
						auxiliar.append(aux1.getFuturo());
						contadorpos++;
					}
					else {
							auxiliar.setCharAt(auxiliar.length()-1, aux1.getTerminal());
							auxiliar.append(aux1.getFuturo());
					}
					
					int indice = auxiliar.indexOf("*");
					
					while (indice != -1) {
						auxiliar.deleteCharAt(indice);
						indice = auxiliar.indexOf("*");
					}
					
					System.out.println(auxiliar.toString());	
				}
			}
		}
		Titulo("","."); 
	
		}
		else if (escolha == 2) {
			Titulo(" Ordens de produção passadas pelo algoritmo ", ".");
			int cont = 0; int contadorpos = 0;
			
			for (Produções aux: ordens) {
				cont++;
				if (aux.getPos()== 0) aux.setPos(cont);
			}
			
			StringBuilder auxiliar = new StringBuilder();
			
			for (String aux : completos) {
				for (Produções aux1 : ordens) {
					if (aux1.getTotal().equals(aux)) {
						System.out.println("<" + aux1.getPos() + "> " + aux);
						if (aux1.getPos() == 1 || contadorpos == 0) {
							auxiliar.insert(0,aux1.getTerminal());
							auxiliar.insert(0,aux1.getFuturo());
							contadorpos++;
						}
						else {
								auxiliar.setCharAt(0, aux1.getTerminal());
								auxiliar.insert(0,aux1.getFuturo());
						}
						
						int indice = auxiliar.indexOf("*");
						
						while (indice != -1) {
							auxiliar.deleteCharAt(indice);
							indice = auxiliar.indexOf("*");
						}
						
						System.out.println(auxiliar.toString());	
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
