package PacotePrincipal;
import java.util.Scanner;

public class Main {
	
	private static String A;
	private static String Q;
	private static String M;
	private static String C;

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		Titulo(" MULTIPLICAÇÃO DE BINÁRIOS ","."); // imprime título para organização
		
		System.out.print("Insira o multiplicando: ");
		int multiplicando = s.nextInt(); //recebe o multiplicando
		while ((Integer.toBinaryString(multiplicando).length() > 15)){ //controla que o multiplicando tenha no máximo 15 bits positivos, numeros negativos não são aceitos
			System.out.print("Insira um multiplicando válido (no máximo 15 bits inteiros e positivos): ");
			multiplicando = s.nextInt();
		}
		System.out.print("Insira o multiplicador: ");
		int multiplicador = s.nextInt(); //recebe o multiplicador
		while ((Integer.toBinaryString(multiplicador).length() > 15)){ //controla que o multiplicador tenha no máximo 15 bits positivos, numeros negativos não são aceitos
			System.out.print("Insira um multiplicador válido (no máximo 15 bits inteiros e positivos): ");
			multiplicador = s.nextInt();
		}
		
		System.out.print("O multiplicando em Binário: "); imprime(Integer.toBinaryString(multiplicando)); //printa Q
		System.out.print("O multiplicador em Binário: "); imprime(Integer.toBinaryString(multiplicador));//printa M
		
		StringBuilder aux = new StringBuilder(); //cria uma String modificável aux
		aux.append(Integer.toBinaryString(multiplicando)); //adiciona o multiplicando a aux
		while (aux.length() < 15) { //preencher a esquerda de zeros até que o tamanho de aux seja 15
	            aux.insert(0, '0');//coloca '0' na posição 0 da String aux, ou seja, adiciona ao começo
	        }
		M = aux.toString(); // M recebe aux no tamanho correto
		
		aux = new StringBuilder(); //limpa a String aux
		aux.append(Integer.toBinaryString(multiplicador)); // adiciona o multiplicador em aux
		while (aux.length() < 15) { //preencher a esquerda de zeros até que o tamanho seja 15
	            aux.insert(0, '0'); // coloca '0' na posição 0 de aux
	        }
		Q = aux.toString(); // Q recebe aux no tamanho correto
		
		C = "0"; // C recebe como padrão o valor 0
		A = "000000000000000"; // A recebe como padrão o valor 0, com 15 casas
		
		
		Titulo("Executando","."); // imprime título para organização
		
		for (int i = 15; i > 0; i--) { // percorre a quantidade de vezes referente a quantidade de casas totais
			Titulo("","-"); // imprime título para organização
			System.out.println("Inicio da Iteração");
			System.out.println("Contador: " + i); // imprime o contador
			System.out.println("Qo: " + Q.charAt((Q.length()-1))); // imprime o Qo, último dígito de Q
			System.out.print("C: "); imprime(C);//printa C
			System.out.print("A: "); imprime(A); //printa A
			System.out.print("Q: "); imprime(Q);//printa Q
			System.out.print("M: "); imprime(M);//printa M
			
			
			if (Q.charAt((Q.length()-1)) == '1') { // o o último dígito de Q for 1
				System.out.println("Realizando a soma...");
				String [] resultadosoma = soma(A,M); //chamamos a função soma e colocamos os resultados em um vetor de String
				A = resultadosoma[0]; // A recebe o conteúdo da primeira posição do vetor de String
				C = resultadosoma[1]; // C recebe o conteúdo da segunda posição do vetor de String
				
				System.out.print("C: "); imprime(C);//printa C
				System.out.print("A: "); imprime(A); //printa A
				
				System.out.println("Realizando o deslocamento...");
				String[] resultado = deslocar(A, Q); // //chamamos a função deslocar e colocamos os resultados em um vetor de String
				A = resultado[0]; // A recebe o conteúdo da primeira posição do vetor de String
				Q = resultado[1]; // Q recebe o conteúdo da primeira segunda do vetor de String

				System.out.print("C: "); imprime(C);//printa C
				System.out.print("A: "); imprime(A); //printa A
				System.out.print("Q: "); imprime(Q);//printa Q
			}
			else if (Q.charAt((Q.length()-1)) == '0'){
				System.out.println("Realizando o deslocamento...");
				String[] resultado = deslocar(A, Q); //chamamos a função deslocar e colocamos os resultados em um vetor de String
				A = resultado[0]; // A recebe o conteúdo da primeira posição do vetor de String
				Q = resultado[1]; // Q recebe o conteúdo da primeira segunda do vetor de String

				System.out.print("C: "); imprime(C);//printa C
				System.out.print("A: "); imprime(A); //printa A
				System.out.print("Q: "); imprime(Q);//printa Q
			}
		}
		
		String total = A+Q; // a String total recebe a junção de A e Q
		
		Titulo(" FINAL DA OPERAÇÃO ","-"); // imprime título para organização
		System.out.println("Qo: " + Q.charAt((Q.length()-1)));
		System.out.print("C: "); imprime(C);//printa C
		System.out.print("A: "); imprime(A); //printa A
		System.out.print("Q: "); imprime(Q);//printa Q
		System.out.print("M: "); imprime(M);//printa M
		
		int totaln = Integer.parseInt(total,2); // totaln recebe o total transformado em decimal
		System.out.println("Resultado em Binário: " + total); //printa o resultado em binario
		System.out.println("Resultado em Decimal: " + totaln); //printa o resultado em decimal
		
		Titulo("","-"); // imprime título para organização
	}
	
	public static String[] soma (String A, String M) { // função responsável por realizar a soma entre dois números binários
		StringBuilder resultado = new StringBuilder(); //cria-se uma StringBuilder resultado que receberá a soma
		String carry = "0"; // cria-se a String carry, para o caso de "resta um"
		
		char vetA [] = A.toCharArray(); //transforma A em um vetor de caracteres
        char vetM [] = M.toCharArray(); //transforma m em um vetor de caracteres
        
        int tamanho = A.length();  // tamanho recebe o tamanho de A, que, igual ao de M, é 15
        
        for (int i = tamanho-1; i >= 0; i--) {
        	if (carry == "0") { // se o meu carry é atualmente 0
        		if ((vetA[i] == '0' && vetM[i] == '1') || (vetA[i] == '1' && vetM[i] == '0')) { // se o número para o qual estou olhando em A é 0 e o de B é 1, ou o inverso, o resultado será 1
        			resultado.insert(0, '1'); // colocamos 1 na posição 0 da String resultado, ou seja, no começo dela
        			carry = "0"; //carry continua 0
        		}
        		else if (vetA[i] == '0' && vetM[i] == '0') { // se o numero para o qual estamos olhando em A é 0 e em B também encontramos 0, o resultado será 0
        			resultado.insert(0, '0'); // colocamos 0 na posição 0 da String, ou seja, no começo dela
        			carry = "0"; //carry continua 0
        		}
        		else if (vetA[i] == '1' && vetM[i] == '1') { // se o numero para o qual estamos olhando em A e B é 1, recebe-se 0 e o resto é 1
        			resultado.insert(0, '0'); // colocamos 0 na posição 0 da String, ou seja, no começo dela
        			carry = "1"; //carry recebe 1
        		}
        	}
        	else if (carry == "1") { // se o meu carry é atualmente 1
        		if ((vetA[i] == '0' && vetM[i] == '1') || (vetA[i] == '1' && vetM[i] == '0')) { // se o número para o qual estou olhando em A é 0 e o de B é 1, ou o inverso, o resultado será 0
        			resultado.insert(0, '0'); // colocamos 0 na posição 0 da String, ou seja, no começo dela
        			carry = "1"; //carry recebe 1
        		}
        		else if (vetA[i] == '0' && vetM[i] == '0') {// se o numero para o qual estamos olhando em A é 0 e em B também encontramos 0, o resultado será 1
        			resultado.insert(0, '1'); // colocamos 1 na posição 0 da String resultado, ou seja, no começo dela
        			carry = "0"; //carry continua 0
        		}
        		else if (vetA[i] == '1' && vetM[i] == '1') { // se o numero para o qual estamos olhando em A e B é 1, recebe-se 1 e o resto é 1
        			resultado.insert(0, '1'); // colocamos 1 na posição 0 da String resultado, ou seja, no começo dela
        			carry = "1"; //carry recebe 1
        		}
        	}
        	
        }
        
        String[] vetresultado = {resultado.toString(),carry}; // o vetor de String vetresultado recebe o resultado e carry, respectivamente
		
		return vetresultado; // retorna o vetor de String
	}
	
	public static String[] deslocar (String A, String Q) {
	        char vetA [] = A.toCharArray(); //transforma A em um vetor de caracteres
	        char vetQ [] = Q.toCharArray(); //transforma Q em um vetor de caracteres

	        int tamanhoA = vetA.length - 1; // tamanhoA recebe o tamanho total da String A
	        int tamanhoQ = vetQ.length - 1; // tamanhoQ recebe o tamanho total da String Q
	        
	        for (int i = tamanhoQ; i > 0; i--) { //percorro, da direita para a esquerda, até que o meu i encontre 1
	            vetQ[i] = vetQ[i - 1]; //troco as posições do anterior com o atual, movendo a estrutura toda para a direita
	        }
	        
	        vetQ[0] = vetA[tamanhoA]; // o meu primeiro número de Q recebe o último de A
	        
	        vetA[0] = C.charAt(0); // o meu primeiro número de A recebe o carry C
			C = "0"; //C recebe 0 novamente
	        
	        for (int i = tamanhoA; i > 0; i--) { //percorro, da direita para a esquerda, até que o meu i encontre 1
	            vetA[i] = vetA[i - 1]; //troco as posições do anterior com o atual, movendo a estrutura toda para a direita
	        }

	        A = new String(vetA); //coloco a nova String em A, atualizando-a
	        Q = new String(vetQ); //coloco a nova String em Q, atualizando-a
	        
	        String [] resultado = {A,Q}; // cria um vetor de Strings, com as duas novas Strings, para poder retornar de uma vez pela função
			return resultado;
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
	
	public static void imprime (String binario) { //função que imprime o número binário formatado no estilo [x,x,x,x,x,x,x,x,x]
		char vet [] = binario.toCharArray(); //transforma A em um vetor de caracteres
		
		System.out.print("[");
		for (int i = 0; i < vet.length; i++) { 
			if (i < vet.length-1) System.out.print(vet[i] + ", ");
			else System.out.print(vet[i] + "");
		}
		System.out.println("]");
	}
}
