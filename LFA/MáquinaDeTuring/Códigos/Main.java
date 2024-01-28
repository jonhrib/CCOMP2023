package MaquinaDeTuring;

// João Vitor de Souza Ribeiro || 2º Ano | C.Comp

import java.util.Scanner;

public class Main {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		char vet [] = new char [60];
		
		/*Impressao("=", " LINGUAGENS FORMAIS, AUTÔMATOS E COMPUTABILIDADE ");
		System.out.println();
		Impressao("="," PROFESSOR GUILHERME HENRIQUE DE SOUZA NAKAHATA ");
		System.out.println();*/
		Impressao("="," MÁQUINA DE TURING ");
		
		Recebimento(vet);
		
	}
	
	public static void Executar(char vet[], Transições mat[][], char alfabetogeral[],String finais [], int estadoinicial) {
		Scanner s = new Scanner (System.in);
		int cont = 1;
	    int estadoAtual = estadoinicial;
	    int estadoAtualaux = estadoAtual;

	    while (estadoAtual != -1) {
	        char leitura = vet[cont]; //o que está sendo lido agora na fita
	        int indiceAlfabeto = -1;

	        for (int i = 0; i < alfabetogeral.length; i++) { // encontra o índice do símbolo de leitura no alfabeto geral
	            if (leitura == alfabetogeral[i]) {
	                indiceAlfabeto = i;
	                break;
	            }
	        }

	        if (indiceAlfabeto != -1) {
	            Transições transicao = mat[estadoAtual][indiceAlfabeto]; //pega as transições baseado no estado atual e no símbolo que está sendo lido agora

	            if (transicao != null && !transicao.getVetaux()[0].equals("Sx")) { //se transição não está vazia e se não é x,x,x
	            	String aux = String.valueOf(transicao.getVetaux()[0].charAt(1)); //aux recebe o estado futuro, somente o número
	                estadoAtual = Integer.parseInt(aux);
	                estadoAtualaux = estadoAtual;
	                char novoSimbolo = transicao.getVetaux()[1].charAt(0); //novoSimbolo recebe o alfabeto futuro
	                char direcao = transicao.getVetaux()[2].charAt(0); //direcao recebe a direção

	                vet[cont] = novoSimbolo; // substitui na fita
	                
	                if (direcao == 'D') { //vai para a direita
	                    cont++; // o cabeçote da fita vai uma posição à direita
	                } 
	                else if (direcao == 'E') { //vai para a esquerda
	                    cont--; // o cabeçote da fita vai uma posição à esquerda
	                }
	                		
	            } 
	            else {
	                estadoAtual = -1; // transição inválida (nula ou igual a Sx), encerra a execução
	            }
	        } 
	        else {
	            estadoAtual = -1; // símbolo da fita lido não foi encontrado no alfabeto geral, encerra a execução
	        }

	        //VisualizarVetor(vet, " FITA FINAL ");// para visualizar todas as alterações na fita
	    }

	    VisualizarVetor(vet, " FITA FINAL ");// para visualizar somente a última fita
	    
	    boolean aceita = false;
	    for (String estadoFinal : finais) { // verifica se chegou a um estado final
	    	String aux = String.valueOf(estadoFinal.charAt(1));
	    	//System.out.println("aux = " + aux + "| estadoatual = " + estadoAtualaux);
	        if (Integer.parseInt(aux) == estadoAtualaux) {
	            aceita = true;
	            break;
	        }
	    }

	    if (aceita) {
	        System.out.println("A palavra foi aceita!");
	    } else {
	        System.out.println("A palavra não foi aceita!");
	    }
	    
	    System.out.println("Deseja testar outra palavra? 1 - SIM | 2 - NÃO");
	    System.out.print("Opção Escolhida: "); int escolha = s.nextInt();
	    if (escolha == 1) {
	    	
	    	s.nextLine();
	    	System.out.print("Digite uma palavra para ser testada: ");
			String teste = s.nextLine();
			
			vet[0]= alfabetogeral[alfabetogeral.length-2];
			for (int i = 0; i < teste.length(); i++) {
				vet[i+1] = teste.charAt(i);
			}
			
			for (int i = teste.length()+1; i < vet.length; i++) {
				vet[i] = alfabetogeral[alfabetogeral.length-1];
			}
			
			VisualizarVetor(vet, " FITA INICIAL");
			
	    	Executar(vet, mat, alfabetogeral,finais,estadoinicial);
	    }
	    else {
	    	Impressao("=","");
	    	Impressao("="," OBRIGADO POR UTILIZAR A MÁQUINA DE TURING ");
	    	Impressao("=","");
	    }
	}
	
	public static void VisualizarVetor (char vet[], String texto) {
		Impressao ("*", texto);
		for (int i = 0; i < vet.length; i++) {
			if (i == vet.length-1) System.out.print (vet[i] + "\n");
			else System.out.print (vet[i] + " ");
		}
		Impressao ("*","*");
	}
	
	public static void Recebimento (char vet[]) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de letras do alfabeto: ");
		int qtdalfabeto = s.nextInt();
		char alfabeto[] = new char [qtdalfabeto];
		
		for (int i = 0; i < alfabeto.length; i++) {
			System.out.print ("Informe a letra " + (i+1) + " do alfabeto: ");
			alfabeto[i] = s.next().charAt(0);
		}
		
		System.out.print("Informe uma letra para representar os estados: "); char estado = s.next().charAt(0);
		
		System.out.print("Digite a quantidade total de estados: "); int qtdestados = s.nextInt();
		String estados [] =  new String [qtdestados];
		
		System.out.print("Digite o estado inicial - somente o nº -: "); String numinicial = s.next(); int estadoinicial = Integer.parseInt(numinicial);

		int x = Integer.parseInt(numinicial);
		for (int i = 0; i < qtdestados; i++) {
			String aux = Integer.toString(x);
			estados[i] = estado+aux;
			x++;
		}
		
		System.out.print("Digite a quantidade de  estados finais: "); int qtdfinais = s.nextInt();
		String finais [] =  new String [qtdfinais];
		for (int i = 0; i < qtdfinais; i++) {
			System.out.print("Digite o " + (i+1) +"º estado final - somente o nº -:  ");
			finais [i] = estado+s.next();
		}
		
		System.out.print("Digite o marcador de início: ");
		char marcador = s.next().charAt(0);
		
		System.out.print("Digite o marcador de branco: ");
		char branco = s.next().charAt(0);
		
		//Impressão da Descrição Formal
		Impressao("*"," Descrição Formal ");
		System.out.print("∑ = {");
		for (int i = 0; i < alfabeto.length; i++) {
			if (i < alfabeto.length-1) System.out.print(alfabeto[i] + ",");
			else System.out.print(alfabeto[i]);
		}
		System.out.print("} \n");
		
		System.out.print("E = {");
		for (int i = 0; i < qtdestados; i++) {
			if (i < qtdestados-1) System.out.print(estados[i] + ",");
			else System.out.print(estados[i]);
		}
		System.out.print("} \n");
		
		System.out.println("i =  " + estado + estadoinicial);
		
		System.out.print("F = {");
		for (int i = 0; i < qtdfinais; i++) {
			if (i < qtdfinais-1) System.out.print(finais[i] + ",");
			else System.out.print(finais[i]);
		}
		System.out.print("} \n");
		
		System.out.println("γ =  {" + marcador + "," + branco + "}");
		
		System.out.println("< =  " + marcador);
		
		System.out.println("β =  " + branco);
		
		//
		
		Impressao ("*"," Tabela de Transição ");
		
		for (int i = 0; i < (qtdestados+1); i++) {
			for (int j = 0; j < (qtdalfabeto + 3); j++) {
				if (i == 0) {
					if (j == 0) System.out.print("δ     ");
					else if (j < (qtdalfabeto + 1)){
						System.out.print(alfabeto[j-1] + "     ");
					}
					else if (j == qtdalfabeto + 1) System.out.print(marcador + "     ");
					else System.out.print(branco);
				}
				else if (j == 0) {
					System.out.print(estados[i-1] + "   ");
				}
				else {
					System.out.print(i + "," + j + "   ");
				}
			}
			System.out.println();
		}
		
		Impressao ("*"," Transições ");
		
		System.out.println("Obs: Se não existir uma transição, insira x");
		System.out.println("Obs: Uma transição inválida fará com que o campo seja anulado");
		
		Impressao("-", " Digite as transições ");
		
		char alfabetogeral [] = new char [qtdalfabeto+2]; // junção do alfabeto e do alfabeto auxiliar
		for (int i = 0; i < alfabetogeral.length; i++) {
			if (i < qtdalfabeto) alfabetogeral[i] = alfabeto[i];
			else if (i == qtdalfabeto) alfabetogeral[i] = marcador;
			else alfabetogeral[i] = branco;
		}
				
		Transições mat [][] = new Transições [qtdestados][alfabetogeral.length];
		for (int i = 0; i < (qtdestados); i++) {
			for (int j = 0; j < (alfabetogeral.length); j++) {
				Impressao("-","");
				System.out.print ("Digite o estado futuro da transição {" + (i+1) + "," + (j+1) + "}: ");
				String estadofuturo = s.next();
				if (estadofuturo.equalsIgnoreCase(("x"))) {
					Impressao(" "," O campo foi anulado! ");
					mat[i][j] = new Transições ("Sx","x","x");
				}
				else {
					System.out.print ("Digite o alfabeto futuro da transição {" + (i+1) + "," + (j+1) + "}: ");
					String alfabetofuturo = s.next();
					if (alfabetofuturo.equalsIgnoreCase("x")) {
						Impressao(" "," O campo foi anulado! ");
						mat[i][j] = new Transições ("Sx","x","x");
					}
					else {
						System.out.print ("Digite a direção da transição {" + (i+1) + "," + (j+1) + "}: ");
						String direção = s.next();
						if (direção.equalsIgnoreCase("x")) {
							Impressao(" "," O campo foi anulado! ");
							mat[i][j] = new Transições ("Sx","x","x");
						}
						else {
							mat[i][j] = new Transições (estadofuturo,alfabetofuturo,direção);
						}
					}
				}
			}
		}
		Impressao ("*"," Tabela de Transição ");
		
		for (int i = 0; i < (qtdestados+1); i++) {
			for (int j = 0; j < (qtdalfabeto + 3); j++) {
				if (i == 0) {
					if (j == 0) System.out.print("δ     ");
					else if (j < (qtdalfabeto + 1)){
						System.out.print(alfabeto[j-1] + "        ");
					}
					else if (j == qtdalfabeto + 1) System.out.print(marcador + "       ");
					else System.out.print(branco);
				}
				else if (j == 0) {
					System.out.print(estados[i-1] + "   ");
				}
				else {
					for(int k = 0; k < 3; k++) {
						if (k < 2) System.out.print(mat[i-1][j-1].getVetaux()[k] + ",");
						else System.out.print(mat[i-1][j-1].getVetaux()[k]);
					}
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
		
		Impressao ("*","*");
		
		/*for (int i = 0; i < (qtdestados); i++) {
			for (int j = 0; j < (alfabetogeral.length); j++) {
				for(int k = 0; k < 3; k++) {
					System.out.print(mat[i][j].getVetaux()[k] + " ");
				}
			}
			System.out.println();
		}*/
		
		//recebendo palavra a ser testada
		s.nextLine();
		System.out.print("Digite uma palavra para ser testada: ");
		String teste = s.nextLine();
		
		vet[0]= marcador;
		for (int i = 0; i < teste.length(); i++) {
			vet[i+1] = teste.charAt(i);
		}
		
		for (int i = teste.length()+1; i < vet.length; i++) {
			vet[i] = branco;
		}
		
		VisualizarVetor(vet, " FITA INICIAL ");
		
		Executar(vet, mat, alfabetogeral, finais, estadoinicial);
	}
	
	public static void Impressao (String separador, String conteúdo) { // função que imprime títulos adequados ao tamanho padronizado da tela de impressão
		
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print(separador); 
		}
		System.out.print(conteúdo);  //imprime o conteúdo recebido por parâmetro, entre cadeias de "="
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print(separador);
		}
		 System.out.println();
	}
	
}
