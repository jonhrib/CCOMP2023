//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex03;
import java.util.Scanner;

public class Main {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		Invoice fatura1 = new Invoice();
		
		double valor = 0;
		int x = 1;
		
		while (x < 4) {
			System.out.println ("+--------------------------------+");
			System.out.println ("|         DIGITE A OPÇÃO         |");
			System.out.println ("+--------------------------------+");
			System.out.println ("| 1 - INSERIR ITEM VENDIDO       |");
			System.out.println ("| 2 - CALCULAR TOTAL DA FATURA   |");
			System.out.println ("| 3 - IMPRIMIR FATURA            |");
			System.out.println ("| 4 - SAIR                       |");
			System.out.println ("+--------------------------------+");
			System.out.println ("Opção escolhida: " + (x = s.nextInt()));
			
			switch (x) {
			case(1):
				fatura1.Invoice();
				break;
			case(2):
				valor = fatura1.getInvoiceAmount();
				break;
			case(3):
				fatura1.print(valor);
				break;
			}
			
		}
		
	}
	
}
