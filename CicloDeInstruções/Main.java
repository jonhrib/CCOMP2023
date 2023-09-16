package CicloDeInstruções;
import java.util.Scanner; // importa biblioteca para o uso do Scanner na classe toda

//João Vitor de Souza Ribeiro || 2º Ano | C.Comp

public class Main {
	protected static int cont = 1; //cria-se uma variável global, para acesso em todas as funções, usada para a contagem de acesso nas instruções
	protected static int mbr = 0; //cria-se uma variável global, para acesso em todas as funções, usada para representar o mbr |quase um auxiliar|;
	protected static int inicio = 1; //cria-se uma variável global, para acesso em todas as funções, usada para representar uma variável de início (usado para retorno do jump)
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		System.out.println ("+--------------------------------------------------------------------------------+");
		System.out.println ("|               CICLO DE INTRUÇÕES - AOC - João Vitor Souza Ribeiro              |"); //impressão de título
		System.out.println ("+--------------------------------------------------------------------------------+");
		
		int[] vet = new int [251];// 0-250 (memórias)
		
		for (int i = 0; i < vet.length; i++) { // preenche o vetor com MIN_VALUE, garantindo que ele está "vazio"
			vet[i] = Integer.MIN_VALUE;
		}
		 
		int x = 1;
		while (x < 5 && x > 0) { //repetição do menu, sempre mantendo o usuário no ciclo, até escolher a opção 5 - SAIR
			System.out.println ("+--------------------------------+");
			System.out.println ("|         DIGITE A OPÇÃO         |");
			System.out.println ("+--------------------------------+");
			System.out.println ("| 1 - EXECUTAR INSTRUÇÕES        |");
			System.out.println ("| 2 - MOSTRAR INSTRUÇÕES         |");
			System.out.println ("| 3 - VER DADOS                  |");
			System.out.println ("| 4 - LIMPAR DADOS               |");
			System.out.println ("| 5 - SAIR                       |");
			System.out.println ("+--------------------------------+");
			System.out.println ("Opção escolhida: " + (x = s.nextInt()));
			switch (x) {
			case (1):
					ReceberDados(vet); // chama a função responsável por executar instruções, fornecendo o vetor como parâmetro
					break;
			case (2):
					Instruções(vet); // chama a função responsável por mostrar a tabela de instruções, fornecendo o vetor como parâmetro
					break;
			case(3):
					Impressao(" IMPRIMINDO OS DADOS "); // chama a função criada para ser responsável pela impressão de título
					System.out.println("O MBR atual: " + mbr); // mostra o mbr no momento de verificação
					ImprimirDado(vet); // chama a função responsável pela impressão dos dados, fornecendo o vetor como parâmetro
					break;
			case(4):
					Limpar(vet); // chama a função responsável por limpar o vetor ou o mbr, ou ambos, se o usuário desejar
					break;
			}
		}
		
		Impressao(" !! OBRIGADO POR USAR O CICLO DE INSTRUÇÕES !! ");
		
	}
	
	public static void Instruções(int [] vet) { //função que mostra a lista de instruções dispoíveis para execução no programa
		Scanner s = new Scanner (System.in);
		int op = 0; String str = "";
		
		System.out.println("+-------------------+-------------+----------------------+");
		System.out.println("| Cod. da Instrução |  Operandos  |       Resultados     |"); //mbr é um auxiliar, basicamente
		System.out.println("+-------------------+-------------+----------------------+");
		System.out.println("|       000001      |     #pos    |      MBR <-- #pos    |"); //coloca o dado da posição x no mbr
		System.out.println("|       000010      |  #pos #dado |    #pos <-- #dado    |"); //coloca um dado na posição x
		System.out.println("|       000011      |     #pos    |  MBR <-- MBR + #pos  |"); //mbr recebe mbr + dado na posição x
		System.out.println("|       000100      |     #pos    |  MBR <-- MBR - #pos  |"); //mbr recebe mbr - dado na posição x
		System.out.println("|       000101      |     #pos    |  MBR <-- MBR * #pos  |"); //mbr recebe mbr * dado na posição x
		System.out.println("|       000110      |     #pos    |  MBR <-- MBR / #pos  |"); //mbr recebe mbr / dado na posição x
		System.out.println("|       000111      |     #lin    |     JUMP to #lin     |"); //pula a execução para a linha/posição x
		System.out.println("|       001000      |     #lin    |   JUMP IF Z to #lin  |"); //se tiver zero no mbr pula para o programcount x
		System.out.println("|       001001      |     #lin    |   JUMP IF N to #lin  |"); //se tiver negativo no mbr pula para o programcount x
		System.out.println("|       001010      |             |   MBR <-- sqrt(MBR)  |"); //mbr recebe a raiz quadrada do mbr atual
		System.out.println("|       001011      |             |    MBR <-- - (MBR)   |"); //mbr recebe módulo de mbr
		System.out.println("|       001111      |     #pos    |     #pos <-- MBR     |"); //posição x recebe o conteúdo de mbr
		System.out.println("|       001100      |             |          NOP         |"); //para a execução (a operação é de parada)
		System.out.println("+-------------------+-------------+----------------------+");
		
		System.out.println("Deseja Inserir uma instrução? 1 - SIM | 2 - NÃO ");
		op = s.nextInt();
		if (op == 1) str = "INSERIR INSTRUÇÃO";
		else if (op == 2) str = "NÃO INSERIR INSTRUÇÃO";
		System.out.println ("Opção escolhida " + (op) + ": " + str); 
		if (op == 1) ReceberDados(vet); //se o usuário desejar, a partir dessa mesma opção do menu ele poderá inserir instruções, chamando a função responsável por tal (Inserir)
	}
	
	public static void ReceberDados (int vet[]) { //recebe os dados referentes as instruções e armazena em vetores
		Scanner s = new Scanner (System.in);
		cont = 1;
		inicio = 1;
		int tam = 51;
		int opcode[]= new int [tam]; //vetor destinado aos opcodes
		int pos_lin[] = new int [tam]; //vetor destinado as posições/linhas de jump
		int dado[]  = new int [tam]; //vetor destinado aos dados
		
		for (int  i = 1; i < tam; i++) { // percorre o for inteiro
			
			Impressao("");
			System.out.println("PC: " + i); //programcounter
			System.out.println("Digite o opcode: "); opcode [i] = s.nextInt();
			
			if (opcode[i] == 10) { // confere se o opcode digitado precisa receber um ou dois operandos
				System.out.println("Digite o operando 1 (pos): "); pos_lin[i] = s.nextInt();
				while (pos_lin[i] > 250 || pos_lin[i] < 0) { // obriga que o usuário digite um valor válido
					System.out.println("# ATENÇÃO - A POSIÇÃO DEVE ESTAR ENTRE 0 e 250");
					System.out.print("Digite o operando 1 (pos): "); pos_lin[i] = s.nextInt();
				}
				System.out.println("Digite o operando 2 (dado): "); dado[i] = s.nextInt();
			}
			
			else if (opcode[i] == 111 || opcode[i] == 1000 || opcode[i] == 1001) { // confere o opcode e recebe apenas a linha (jumps)
				System.out.println("Digite o operando 1 (lin): "); pos_lin[i] = s.nextInt();
				//while (pos_lin[i] > cont || pos_lin[i] < 1) { // obriga que o usuário digite um valor válido
				//	System.out.println("ATENÇÃO - A LINHA DEVE ESTAR ENTRE 1 e " + cont);
				//	System.out.print("Digite o operando 1 (lin): "); pos_lin[i] = s.nextInt();
				//}
			}
			
			else if (opcode[i] == 1010 || opcode[i] == 1011) { // confere o opcode e destina ele ao não recebimento de operandos
				System.out.println();
			}
			
			else if (opcode[i] == 1100) { //opcode referente ao encerraento das instruções
				System.out.println("Operações Encerradas");
				break;
			}
			
			else if (opcode[i] == 1 || opcode[i] == 11 || opcode[i] == 100 || opcode[i] == 101 || opcode[i] == 110 || opcode[i] == 1111) { // confere se o opcode digitado precisa receber um ou dois operandos
				System.out.println("Digite o operando 1 (pos): "); pos_lin[i] = s.nextInt();
				while (pos_lin[i] > 250 || pos_lin[i] < 0) { // obriga que o usuário digite um valor válido
					System.out.println("# ATENÇÃO - A POSIÇÃO DEVE ESTAR ENTRE 0 e 250");
					System.out.print("Digite o operando 1 (pos): "); pos_lin[i] = s.nextInt();
				}
			}
			
			else { //caso o opcode esteja incorreto
				System.out.println("Você digitou um opcode inválido!!");
				opcode[i] = 0; i--; //desconsidera o opcode recebido e volta uma posição no for, recebendo outro opcode
				cont--; //contador volta a ser o valor antes do código incorreto, desconsiderando o opcode atual
			}
			
			cont++;	//aumenta o contador geral, indicando que mais uma instrução foi registrada
			Impressao("");
			
		}
		
		Impressao(" FINALIZANDO RECEBIMENTO DAS INSTRUÇÕES ");
		Executar(vet,opcode,pos_lin,dado); //chama a função responsável por executar as instruções recebidas
	}
	
	public static void Executar (int [] vet, int[] opcode, int[] pos_lin, int[] dados) { // função para executar as instruções
		Scanner s = new Scanner (System.in);
		
		//impressão do título "EXECUTANDO..."
		for (int i = 0; i < 80; i++) System.out.print("-"); System.out.println();
		for (int i = 0; i < ((80-13)/2); i++) System.out.print(" "); System.out.print("EXECUTANDO..."); for (int i = 0; i < ((80-13)/2); i++) System.out.print(" "); System.out.println();
		for (int i = 0; i < 80; i++) System.out.print("-"); System.out.println();
		//
		
		for (int valor = inicio; valor <= cont; valor++) {
		
			Impressao(" BUSCA DO ENDEREÇO DE INSTRUÇÃO "); // chama a função responsável por imprimir títulos
			System.out.println("Program Counter: " + valor); //contagem de acessos/contagem de instruções geradas
			
			Impressao(" BUSCA DA INSTRUÇÃO "); // chama a função responsável por imprimir títulos
			int escolhaint = opcode[valor];
			
			int pos = 0; int dado = 0; int lin = 0;// cria-se variáveis para armazenar os operandos
			
			switch(escolhaint) { // switch case com a variável escolhaint, controlando a execução de cada opcode, de acordo com suas especificações únicas
					
				case(1): // caso em que o opcode é 000001 
					System.out.println ("Opcode: 00000" + escolhaint);
					pos = pos_lin[valor];
					if (vet[pos] == Integer.MIN_VALUE) {
						System.out.println("A posição está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!");
					}
					else {
						System.out.println ("Posição (operando): " + pos);
						Impressao(" DECODIFICANDO INSTRUÇÃO ");
						System.out.println("MBR <-- #pos");
						System.out.println(mbr + " <-- #" + pos);
						Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
						System.out.println("Endereço: " + pos);
						Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
						System.out.println("!! Operando encontrado !!");
						Impressao(" OPERAÇÃO DE DADOS ");
						System.out.println("Valor do MBR: " + mbr);
						System.out.println("Valor na memória: " + vet[pos]);
						mbr = vet[pos];
						System.out.println("Valor do MBR após a operação: " + mbr);
						System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					}
					break;
						
				case(10): // caso em que o opcode é 000010
					System.out.println ("Opcode: 0000" + escolhaint);
					pos = pos_lin[valor];
					System.out.println ("Posição (1ºoperando): " + pos);
					dado = dados[valor];
					System.out.println ("Dado (2ºoperando): " + dado);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println("#pos <-- #dado");
					System.out.println("#" + pos + " <-- " + dado);
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: " + pos);
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
					System.out.println("!! Operando encontrado !!");
					Impressao(" CALCULANDO O ENDEREÇO DO SEGUNDO OPERANDO ");
					System.out.println("Endereço: " + dado);
					Impressao(" BUSCANDO O SEGUNDO OPERANDO NA POSIÇÃO #" + dado + " ");
					System.out.println("!! Operando encontrado !!");
					Impressao(" OPERAÇÃO DE DADOS ");
					System.out.println ("Armazenando " + dado + " na posição " + pos);
					vet[pos] = dado;
					Impressao(" CALCULANDO ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: " + pos);
					Impressao(" ARMAZENANDO O OPERANDO NO ENDEREÇO CALCULADO ");
					System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					break;
						
				case(11): // caso em que o opcode é 000011
					System.out.println ("Opcode: 0000" + escolhaint);
					pos = pos_lin[valor];
					if (vet[pos] == Integer.MIN_VALUE) {
						System.out.println("A posição está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!");
					}
					else {
						System.out.println("Posição (operando): " + pos);
						Impressao(" DECODIFICANDO INSTRUÇÃO ");
						System.out.println("MBR <-- MBR + #pos");
						System.out.println("MBR <-- " + mbr  + " + #" + pos);
						Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
						System.out.println("Endereço: " + pos);
						Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
						System.out.println("!! Operando encontrado !!");
						Impressao(" OPERAÇÃO DE DADOS ");
						System.out.println("Valor do MBR: " + mbr);
						System.out.println("Valor na memória: " + vet[pos]);
						mbr += vet[pos];
						System.out.println("Valor do MBR após a operação: " + mbr);
						System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					}
					break;
						
				case(100): // caso em que o opcode é 000100
					System.out.println ("Opcode: 000" + escolhaint);
					pos = pos_lin[valor];
					if (vet[pos] == Integer.MIN_VALUE) {
						System.out.println("A posição está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!");
					}
					else {
						System.out.println("Posição (operando): " + pos);
						Impressao(" DECODIFICANDO INSTRUÇÃO ");
						System.out.println("MBR <-- MBR - #pos");
						System.out.println("MBR <-- " + mbr  + " - #" + pos);
						Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
						System.out.println("Endereço: " + pos);
						Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
						System.out.println("!! Operando encontrado !!");
						Impressao(" OPERAÇÃO DE DADOS ");
						System.out.println("Valor do MBR: " + mbr);
						System.out.println("Valor na memória: " + vet[pos]);
						mbr -= vet[pos];
						System.out.println("Valor do MBR após a operação: " + mbr);
						System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					}
					break;
						
				case(101): // caso em que o opcode é 000101
					System.out.println ("Opcode: 000" + escolhaint);
					pos = pos_lin[valor];
					if (vet[pos] == Integer.MIN_VALUE) {
						System.out.println("A posição está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!");
					}
					else {
						System.out.println("Posição (operando): " + pos);
						Impressao(" DECODIFICANDO INSTRUÇÃO ");
						System.out.println("MBR <-- MBR * #pos");
						System.out.println("MBR <-- " + mbr  + " * #" + pos);
						Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
						System.out.println("Endereço: " + pos);
						Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
						System.out.println("!! Operando encontrado !!");
						Impressao(" OPERAÇÃO DE DADOS ");
						System.out.println("Valor do MBR: " + mbr);
						System.out.println("Valor na memória: " + vet[pos]);
						mbr *= vet[pos];
						System.out.println("Valor do MBR após a operação: " + mbr);
						System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					}
					break;
						
				case(110): // caso em que o opcode é 000110
					System.out.println ("Opcode: 000" + escolhaint);
					pos = pos_lin[valor];
					if (vet[pos] == Integer.MIN_VALUE) {
						System.out.println("A posição está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!");
					}
					else {
						System.out.println("Posição (operando): " + pos);
						Impressao(" DECODIFICANDO INSTRUÇÃO ");
						System.out.println("MBR <-- MBR / #pos");
						System.out.println("MBR <-- " + mbr  + " / #" + pos);
						Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
						System.out.println("Endereço: " + pos);
						Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
						System.out.println("!! Operando encontrado !!");
						Impressao(" OPERAÇÃO DE DADOS ");
						System.out.println("Valor do MBR: " + mbr);
						System.out.println("Valor na memória: " + vet[pos]);
						mbr /= vet[pos];
						System.out.println("Valor do MBR após a operação: " + mbr);
						System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					}
					break;
						
				case(111): // caso em que o opcode é 000111
					System.out.println ("Opcode: 000" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println(" JUMP to #lin ");
					lin = pos_lin[valor];
					System.out.println(" JUMP to #" + lin);
					if (lin <= cont) {
						inicio = lin; //inicio recebe a linha do jump
						Impressao(" EXECUTANDO JUMP "); //executa de novo, como inicio é a linha, ele percorre da linha até o final
						Executar(vet,opcode,pos_lin,dados);
						valor = cont;  //encerra o for
					}
					else System.out.println("A linha indicada está fora das instruções recebidas");
					break;
						
				case (1000):
					System.out.println ("Opcode: 00" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println(" JUMP if Z to #lin ");
					lin = pos_lin[valor];
					System.out.println(" JUMP if (" + mbr + " == 0) to #" + lin);
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: MBR");
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #MBR ");
					System.out.println("!! Operando encontrado !!");
					if (mbr == 0) {
						if (lin <= cont) {	
							inicio = lin; //inicio recebe a linha do jump
							Impressao(" VERIFICANDO CONDIÇÃO ");
							System.out.println(mbr + " = 0");
							System.out.println("Condição aceita");
							Impressao(" EXECUTANDO JUMP ");
							Executar(vet,opcode,pos_lin,dados); //executa de novo, como inicio é a linha, ele percorre da linha até o final
							valor = cont;  //encerra o for 
						}
						else System.out.println("A linha indicada está fora das instruções recebidas");
					}
					else {
						Impressao(" VERIFICANDO CONDIÇÃO ");
						System.out.println(mbr + " != 0");
						System.out.println("Condição recusada");
					}
					break;
					
				case(1001): // caso em que o opcode é 001000
					System.out.println ("Opcode: 00" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println(" JUMP if N to #lin ");
					lin = pos_lin[valor];
					System.out.println(" JUMP if (" + mbr + " < 0) to #" + lin);
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: MBR");
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #MBR ");
					System.out.println("!! Operando encontrado !!");
					if (mbr < 0) {
						if (lin <= cont) {
							inicio = lin; //inicio recebe a linha do jump
							Impressao(" VERIFICANDO CONDIÇÃO ");
							System.out.println(mbr + " < 0");
							System.out.println("Condição aceita");
							Impressao(" EXECUTANDO JUMP "); //executa de novo, como inicio é a linha, ele percorre da linha até o final
							Executar(vet,opcode,pos_lin,dados);
							valor = cont; //encerra o for
						}
						else System.out.println("A linha indicada está fora das instruções recebidas");
					}
					else {
						Impressao(" VERIFICANDO CONDIÇÃO ");
						System.out.println(mbr + " > 0");
						System.out.println("Condição recusada");
					}
					break;
						
				case(1010): // caso em que o opcode é 001010
					System.out.println ("Opcode: 00" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println("MBR <-- sqrt(MBR) ou MBR <-- raiz_quadrada(MBR)");
					System.out.println("MBR <-- raiz_quadrada(" + mbr + ")");
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: MBR");
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #MBR ");
					System.out.println("!! Operando encontrado !!");
					Impressao(" OPERAÇÃO DE DADOS ");
					System.out.println("Valor do MBR: " + mbr);
					mbr = (int) Math.sqrt(mbr);
					System.out.println("Valor do MBR após a operação: " + mbr);
					System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					break;
						
				case(1011): //caso em que o opcode é 001011
					System.out.println ("Opcode: 00" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println("MBR <-- - MBR");
					System.out.println("MBR <-- -" + mbr);
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: MBR");
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #MBR ");
					System.out.println("!! Operando encontrado !!");
					Impressao(" OPERAÇÃO DE DADOS ");
					System.out.println("Valor do MBR: " + mbr);
					mbr *= -1;
					System.out.println("Valor do MBR após a operação: " + mbr);
					System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					break;
						
				case(1111): // caso em que o opcode é 001111
					System.out.println ("Opcode: 00" + escolhaint);
					pos = pos_lin[valor];
					System.out.println("Posição (operando): " + pos);
					Impressao(" DECODIFICANDO INSTRUÇÃO ");
					System.out.println("#pos <-- MBR");
					System.out.println("# " + pos + " <-- " + mbr);
					Impressao(" CALCULANDO O ENDEREÇO DO OPERANDO ");
					System.out.println("Endereço: " + pos);
					Impressao(" BUSCANDO O OPERANDO NA POSIÇÃO #" + pos + " ");
					System.out.println("!! Operando encontrado !!");
					Impressao(" OPERAÇÃO DE DADOS ");
					System.out.println("Valor do MBR: " + mbr);
					if (vet[pos] == Integer.MIN_VALUE) System.out.println("Valor na memória: " + "\u001B[33mVAZIA\u001B[0m"); // verifica se o conteúdo presente na posição é o vazio (MIN_VALUE)
					else System.out.println("Valor na memória: " + vet[pos]);
					vet[pos] = mbr;
					System.out.println("Valor na memória após a operação: " + vet[pos]);
					System.out.println("!! O VALOR FOI ARMAZENADO COM SUCESSO !!");
					break;
						
				case(1100):
					System.out.println ("Opcode: 00" + escolhaint);
					Impressao(" DECODIFICANDO INSTRUÇÃO "); 
					System.out.println("NOP");
					System.out.println("ENCERRANDO AS OPERAÇÕES!");
					System.out.println("!! OPERAÇÕES ENCERRADAS COM SUCESSO !!");
					break;
			}
				
				// impressão de "título" indicando  que a instrução atual foi finalizada
			for (int i = 0; i < 80; i++) System.out.print("-"); System.out.println();
			for (int i = 0; i < ((80-20)/2); i++) System.out.print(" "); System.out.print("INSTRUÇÃO FINALIZADA"); for (int i = 0; i < ((80-13)/2); i++) System.out.print(" "); System.out.println();
			for (int i = 0; i < 80; i++) System.out.print("-"); System.out.println();
			
		}
	}
	
	public static void ImprimirDado(int[] vet) { // função que imprime um dado ou posição de memória requisitado pelo usuário
		Scanner s = new Scanner (System.in);
		int dado = 0; 
		
		Impressao("");
		System.out.println("Posição de memória que deseja ver: "); dado = s.nextInt(); // recebe o dado ou posição de memória que o usuário deseja observar
		
		if (vet[dado] == Integer.MIN_VALUE) System.out.println("A posição " + dado + " está \u001B[33mvazia\u001B[0m ou ainda não foi acessada!"); // se a memória vale o MIN_VALUE, esta ainda não foi acessada
		else System.out.println("A posição " + dado + " contém o dado: " + vet[dado]); // imprime o valor em memória
	}
	
	public static void Limpar(int[] vet) { // função responsável por limpar o vetor e mbr, de acordo com o desejado pelo usuário
		Scanner s = new Scanner (System.in);
		
		//cont = 1; // contador recebe 1, reiniciando a contagem das instruções acessadas
		Impressao(" APAGANDO DADOS... "); // chama função que exibe títulos
		
		System.out.println("Deseja mesmo apagar todos os dados e posições do vetor? 1 - SIM | 2 - NÃO"); // conferência da limpeza
		int confere = s.nextInt();
		
		if (confere == 1) { // se o usuário realmente desejar apagar todos os dados do vetor principal, o mesmo é preenchido, novamente, com MIN_VALUE, deixando-o, para o programa, todo "vazio"
			for (int i = 0; i < vet.length; i++) {
				vet[i] = Integer.MIN_VALUE;
			}
			Impressao(" TODOS OS DADOS FORAM APAGADOS ");
		}
		
		confere = 0;// garantia que a variável não leve o resultado anterior para a próxima conferência
		
		System.out.println("Deseja apagar os dados presentes no mbr? 1 - SIM | 2 - NÃO"); // confere se o usuário deseja apagar o mbr
		confere = s.nextInt();
		
		if (confere == 1) { // apagar o mbr
			mbr = 0;
			Impressao(" O MBR FOI APAGADO ");
		}
	}
	
	public static void Impressao (String conteúdo) { // função que imprime títulos adequados ao tamanho padronizado da tela de impressão
		
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print("="); 
		}
		System.out.print(conteúdo);  //imprime o conteúdo recebido por parâmetro, entre cadeias de "="
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print("=");
		}
		 System.out.println();
	}
}
