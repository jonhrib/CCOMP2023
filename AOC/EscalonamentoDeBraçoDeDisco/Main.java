//Aluno: João Vitor Souza Ribeiro 2º Ano C.Comp
package AtividadePratica_01_08;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("+---------------------------------------------+");
		System.out.println("| Trabalho de escalonamento de braço de disco |");
		System.out.println("|    Professor Guilherme Nakahata - UNESPAR   |");
		System.out.println("|         Aluno João Vitor Souza Ribeiro      |");
		System.out.println("+---------------------------------------------+");
		System.out.print("|Informe o tamanho do cilindro: ");
		int qtdcilindros = s.nextInt();
		int cilindro [] =  new int [qtdcilindros];
		
		
		System.out.print("|Informe a quantidade de pedidos de acesso: ");
		int qtdpedidos = s.nextInt();
	
		int vet [] = new int [qtdpedidos];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print ("|Digite o " + (i+1) + "º pedido de acesso: ");
			vet[i] = s.nextInt();
		}
		
		System.out.println("+---------------------------------------------+");
		
		Representar(qtdcilindros);
		
		for (int i = 0; i < (((qtdcilindros*4)-16)/2);i++) System.out.print(" "); System.out.print("VETOR DE PEDIDOS"); for (int i = 0; i < (((qtdcilindros*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < (qtdcilindros*4); i++) { //imprime --------------------------
			System.out.print("-");
		}
		
		System.out.println();
		for (int i = 0; i < (((qtdcilindros*4)-11)/2);i++) System.out.print(" "); System.out.print("INICIO FCFS"); for (int i = 0; i < (((qtdcilindros*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
		
		Modificar(qtdcilindros, vet);
		
		for (int i = 0; i < (((qtdcilindros*4)-8)/2);i++) System.out.print(" "); System.out.print("FIM FCFS"); for (int i = 0; i < (((qtdcilindros*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
		
		for (int i = 0; i < (qtdcilindros*4); i++) { //imprime --------------------------
			System.out.print("-");
		}

		System.out.println();
		for (int i = 0; i < (((qtdcilindros*4)-10)/2);i++) System.out.print(" "); System.out.print("INICIO SSF"); for (int i = 0; i < (((qtdcilindros*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
		
		int vetaux [] = new int[vet.length]; 
        int k = 0;

        vetaux[0] = vet[0];
        k++;
        int aux = vetaux[0];

        for (int j = 0; j < vetaux.length - 1; j++) {
            int diferenca = Integer.MAX_VALUE; //maior valor possível para a variável
            int pos = 0;

            for (int i = 0; i < vet.length; i++) {
                int repete = 0;

                for (int h = 0; h < k; h++) { //usando k ao invés de vet.length (k é a qtd de elementos adicionados)
                    if (vet[i] == vetaux[h]) {
                        repete++;
                        break;
                    }
                }

                if (aux != vet[i] && repete == 0) {
                    int diff = Math.abs(aux - vet[i]); //módulo
                    if (diff < diferenca) {
                        diferenca = diff;
                        pos = i;
                    }
                }
            }

            vetaux[k] = vet[pos];
            aux = vetaux[k];
            k++;
        }
        Modificar(qtdcilindros,vetaux);
        
        for (int i = 0; i < (((qtdcilindros*4)-7)/2);i++) System.out.print(" "); System.out.print("FIM SSF"); for (int i = 0; i < (((qtdcilindros*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
        
		/*for (int i = 0; i < vetaux.length; i++) {
			System.out.print(vetaux[i] + " "); //imprime vetor auxiliar (vetor do 1º número + o mais próximo dele, e, após, o mais próximo do númnero seguinte, e assim por diante)
		}*/
	}
	
	public static void Representar(int cilindro) {
		
		for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
			System.out.print("-");
		}
		
		System.out.println(); //imprime "representação do cilindro"
		for (int i = 0; i < (((cilindro*4)-25)/2);i++) System.out.print(" "); System.out.print("REPRESENTAÇÃO DO CILINDRO"); for (int i = 0; i < (((cilindro*4)-25)/2);i++) System.out.print(" ");
		System.out.println();
		
		for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 0; i < cilindro; i++) { //imprime visual
			if (i<10) {
				System.out.print("|0" + i + "|");
			}
			else {
				System.out.print("|" + i + "|");
			}
		}
		System.out.println();
		for (int i = 0; i < cilindro; i++) { //imprime visual
				System.out.print("|--|");
		}
		System.out.println();
		
		for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void Modificar(int cilindro, int[] vetor) {
		boolean[] pos = new boolean[cilindro];
		
		for (int j = 0; j < vetor.length; j++) {
			pos[vetor[j]] = true; //um vetor novo que controla se já passou pelo índice
			
			for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
				System.out.print("-");
			}
			
			System.out.println(); //imprime "representação do cilindro"
			for (int i = 0; i < (((cilindro*4)-25)/2);i++) System.out.print(" "); System.out.print("REPRESENTAÇÃO DO CILINDRO"); for (int i = 0; i < (((cilindro*4)-25)/2);i++) System.out.print(" ");
			System.out.println();
			
			for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
				System.out.print("-");
			}
			System.out.println();
			
			for (int i = 0; i < cilindro; i++) { //imprime visual
				if (i<10) {
					System.out.print("|0" + i + "|");
				}
				else {
					System.out.print("|" + i + "|");
				}
			}
			
			System.out.println();
			for (int i = 0; i < cilindro; i++) { //imprime visual
					if (pos[i]) {
						System.out.print("|XX|");
					}
					else System.out.print("|--|");
			}
			System.out.println();
			
			for (int i = 0; i < (cilindro*4); i++) { //imprime --------------------------
				System.out.print("-");
			}
			System.out.println();
		}
	}
} 

/* testes recomendados
 40		20		20		10
 7		3		5		5
 11		2		14		3
 1		6		1		6
 36		3		2		2
 16				6		1
 34				12		0
 9
 12
 */
