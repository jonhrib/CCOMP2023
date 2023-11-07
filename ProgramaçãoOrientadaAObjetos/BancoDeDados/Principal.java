package banco;

import java.sql.SQLException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner (System.in);
		Produtos p = new Produtos();
		
		int x = 1;
		while (x < 5) { 
			System.out.println ("+--------------------------------------------+");
			System.out.println ("|          BEM VINDO - DIGITE A OPÇÃO        |");
			System.out.println ("+--------------------------------------------+");
			System.out.println ("| 1 - INSERIR                                |");
			System.out.println ("| 2 - MOSTRAR                                |");
			System.out.println ("| 3 - APAGAR                                 |");
			System.out.println ("| 4 - ATUALIZAR                              |");
			System.out.println ("| 5 - SAIR                                   |");
			System.out.println ("+--------------------------------------------+");
			System.out.print ("Opção escolhida: " ); x = s.nextInt();
			switch (x) {
			case (1):
					System.out.println ("+--------------------------------------------+");
					System.out.println ("| 1 - INSERIR PRODUTOS NACIONAIS             |");
					System.out.println ("| 2 - INSERIR PRODUTOS INTERNACIONAIS        |");
					System.out.println ("+--------------------------------------------+");
					System.out.print ("Opção escolhida: " ); int escolha = s.nextInt();
					if (escolha == 1) {
						System.out.print("Digite o código do produto: "); int cod = s.nextInt();
						boolean teste = p.verificar("nacional",cod);
						if (teste) {
							while (teste) { // caso existir, mantem o usuário em um loop até que ele digite um nome válido
								teste = p.verificar("nacional2",cod);
								if (teste) { // se um nome foi encontrada sendo igual ao digitado, pedimos que seja digitado um novo
									System.out.print("Informe um código não repetido para o produto: ");
									cod = s.nextInt();
								}
							}
						}
						s.nextLine();
						System.out.print("Digite o nome do produto: "); String nome = s.nextLine();
						System.out.print("Digite o valor do produto: "); double valor = s.nextDouble();
						System.out.print("Digite a quantidade do produto: "); int qtd = s.nextInt();
						System.out.println();
						
						p = new Produtos (cod,nome,valor,qtd);
						p.inserir("nacional");
					}
					
					else if (escolha == 2) {
						System.out.print("Digite o código do produto: "); int cod = s.nextInt();
						boolean teste = p.verificar("internacional",cod);
						if (teste) {
							while (teste) { // caso existir, mantem o usuário em um loop até que ele digite um nome válido
								teste = p.verificar("internacional2",cod);
								if (teste) { // se um nome foi encontrada sendo igual ao digitado, pedimos que seja digitado um novo
									System.out.print("Informe um código não repetido para o produto: ");
									cod = s.nextInt();
								}
							}
						}
						s.nextLine();
						System.out.print("Digite o nome do produto: "); String nome = s.nextLine();
						System.out.print("Digite o valor do produto: "); double valor = s.nextDouble();
						System.out.print("Digite a quantidade do produto: "); int qtd = s.nextInt();
						System.out.println();
						
						p = new Produtos (cod,nome,valor,qtd);
						p.inserir("internacional");
					}
					break;
			case (2):
					System.out.println ("+--------------------------------------------+");
					System.out.println ("| 1 - MOSTRAR PRODUTOS NACIONAIS             |");
					System.out.println ("| 2 - MOSTRAR PRODUTOS INTERNACIONAIS        |");
					System.out.println ("| 3 - MOSTRAR TODOS OS PRODUTOS              |");
					System.out.println ("+--------------------------------------------+");
					System.out.print ("Opção escolhida: " ); escolha = s.nextInt();
					if (escolha == 1) {
						p.recuperar("nacional");
					}
					else if (escolha == 2) {
						p.recuperar("internacional");
					}
					else if (escolha == 3) {
						p.recuperar("nacional");
						p.recuperar("internacional");
					}
					break;
			case (3):
					System.out.println ("+--------------------------------------------+");
					System.out.println ("| 1 - APAGAR PRODUTOS NACIONAIS              |");
					System.out.println ("| 2 - APAGAR PRODUTOS INTERNACIONAIS         |");
					System.out.println ("+--------------------------------------------+");
					System.out.print ("Opção escolhida: " ); escolha = s.nextInt();
					if (escolha == 1) {
						p.apagar("nacional");
					}
					else if (escolha == 2) {
						p.apagar("internacional");
					}
					break;
			case (4):
					System.out.println ("+--------------------------------------------+");
					System.out.println ("| 1 - ATUALIZAR PRODUTOS NACIONAIS           |");
					System.out.println ("| 2 - ATUALIZAR PRODUTOS INTERNACIONAIS      |");
					System.out.println ("+--------------------------------------------+");
					System.out.print ("Opção escolhida: " ); escolha = s.nextInt();
					if (escolha == 1) {
						p.atualizar("nacional");
					}
					else if (escolha == 2) {
						p.atualizar("internacional");
					}
					break;
			}
		}
	}
}

