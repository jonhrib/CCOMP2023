package Ex2;

import java.util.Scanner;

public class Principal1 {

	public static void main (String args []) throws ContaExcecao {
		Scanner s = new Scanner (System.in);
		
		Conta1 conta1 = new Conta1(500.0); //saldo padrão foi estipulado em 500
		
		int x = 1;
		double valor = 0.0;
		while (x < 4 && x > 0) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|       BEM VINDO A SUA CONTA POUPANÇA       |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - SACAR                                  |");
			System.out.println ("| 2 - DEPOSITAR                              |");
			System.out.println ("| 3 - MOSTRAR SALDO                          |");
			System.out.println ("| 4 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					try {
					System.out.print("Digite o valor que deseja sacar em sua conta: ");
					valor = s.nextDouble();
					conta1.saca(valor);
					break;
					}
					catch (ContaExcecao e) {
						System.err.println("Exceção " + e);
						break;
					}
			case (2):
					System.out.print("Digite o valor que deseja depositar em sua conta: ");
					valor = s.nextDouble();
					conta1.depositar(valor);
					break;
			case (3):
					conta1.mostrarSaldo();
				break;
			}
		}
	}
}
