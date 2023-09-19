package Ex3;
import java.util.Scanner;
public class Cardápio { //main

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int x = 1;
		System.out.println ("+--------------------------------------------+");
		System.out.println ("|                 CARDÁPIO                   |");
		while (x < 5) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|               DIGITE A OPÇÃO               |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - VER RECEITA 1 - CARNE DE PANELA        |");
			System.out.println ("| 2 - VER RECEITA 2 - BOLO DE CHOCOLATE      |");
			System.out.println ("| 3 - VER RECEITA 3 - LASANHA                |");
			System.out.println ("| 4 - VER RECEITA 4 - PANQUECAS AMERICANAS   |");
			System.out.println ("| 5 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					CarneDePanela r1 = new CarneDePanela();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println(r1.getTipoReceita());
					System.out.println(r1.getIngredientes());
					System.out.println(r1.getModoDeFazer());
					r1.cozinhar();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					break;
			case (2):
					BoloDeChocolate r2 = new BoloDeChocolate();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println(r2.getTipoReceita());
					System.out.println(r2.getIngredientes());
					System.out.println(r2.getModoDeFazer());
					r2.assar();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					break;
			case(3):
					Lasanha r3 = new Lasanha();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println(r3.getTipoReceita());
					System.out.println(r3.getIngredientes());
					System.out.println(r3.getModoDeFazer());
					r3.assar();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					break;
			case(4):
					Panquecas r4 = new Panquecas();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println(r4.getTipoReceita());
					System.out.println(r4.getIngredientes());
					System.out.println(r4.getModoDeFazer());
					r4.cozinhar();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					break;
			}
		}
	}
}

