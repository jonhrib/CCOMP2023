package Ex5;
import java.util.Scanner;

public class Main {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		/*Conta cont1 = new ContaCorrente(300);
		Conta cont2 = new ContaPoupança(500);
		
		cont1.mostrarSaldo();
		cont1.sacar(350);
		cont1.depositar(100);
		cont1.atualiza(20);
		cont1.mostrarSaldo();
		System.out.println("-------------------------------------------");
		cont2.mostrarSaldo();
		cont2.sacar(200);
		cont2.depositar(100);
		cont2.atualiza(20);
		cont2.mostrarSaldo();*/
		
		int x = 1;
		while (x < 3) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|          BEM VINDO - DIGITE A OPÇÃO        |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - ACESSAR CONTA CORRENTE                 |");
			System.out.println ("| 2 - ACESSAR CONTA POUPANÇA                 |");
			System.out.println ("| 3 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					Corrente();
					break;
			case (2):
					Poupança();
					break;
			}
		}
	}
	
	public static void Poupança() {
		Scanner s = new Scanner (System.in);
		Conta cont2 = new ContaPoupança(500);
		int x = 1;
		double valor = 0.0;
		while (x < 5) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|       BEM VINDO A SUA CONTA POUPANÇA       |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - SACAR                                  |");
			System.out.println ("| 2 - DEPOSITAR                              |");
			System.out.println ("| 3 - ATUALIZAR SALDO                        |");
			System.out.println ("| 4 - MOSTRAR SALDO                          |");
			System.out.println ("| 5 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					System.out.println("Digite o valor do saque: "); valor = s.nextDouble();
					cont2.sacar(valor);
					break;
			case (2):
					System.out.println("Digite o valor do depósito: "); valor = s.nextDouble();
					cont2.depositar(valor);
					break;
			case (3):
					System.out.println("Digite o valor da taxa de atualização: "); int taxa = s.nextInt();
					cont2.atualiza(taxa);
				break;
			case (4):
					cont2.mostrarSaldo();
				break;
			}
		}
	}
	
	public static void Corrente() {
		Scanner s = new Scanner (System.in);
		Conta cont1 = new ContaCorrente(300);
		int x = 1;
		double valor = 0.0;
		while (x < 5) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|        BEM VINDO A SUA CONTA CORRENTE      |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - SACAR                                  |");
			System.out.println ("| 2 - DEPOSITAR                              |");
			System.out.println ("| 3 - ATUALIZAR SALDO                        |");
			System.out.println ("| 4 - MOSTRAR SALDO                          |");
			System.out.println ("| 5 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					System.out.println("Digite o valor do saque: "); valor = s.nextDouble();
					cont1.sacar(valor);
					break;
			case (2):
					System.out.println("Digite o valor do depósito: "); valor = s.nextDouble();
					cont1.depositar(valor);
					break;
			case (3):
					System.out.println("Digite o valor da taxa de atualização: "); int taxa = s.nextInt();
					cont1.atualiza(taxa);
				break;
			case (4):
					cont1.mostrarSaldo();
				break;
			}
		}
	}
}
