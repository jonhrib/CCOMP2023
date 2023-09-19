//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex04;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		Empregado empregado1 = new Empregado();
		Empregado empregado2 = new Empregado();
		
		double valor = 0;
		int x = 1, cont = 0;
		
		while (x < 4) {
			System.out.println ("+--------------------------------+");
			System.out.println ("|         DIGITE A OPÇÃO         |");
			System.out.println ("+--------------------------------+");
			System.out.println ("| 1 - INSERIR O EMPREGADO 1      |");
			System.out.println ("| 2 - INSERIR O EMPREGADO 2      |");
			System.out.println ("| 3 - IMPRIMIR SALÁRIOS          |");
			System.out.println ("| 4 - SAIR                       |");
			System.out.println ("+--------------------------------+");
			System.out.println ("Opção escolhida: " + (x = s.nextInt()));
			
			switch (x) {
			case(1):
				cont++;
				empregado1.Empregado();
				break;
			case(2):
				cont++;
				empregado2.Empregado();
				break;
			case(3):
				if (cont >= 2) {
					System.out.println();
					System.out.println("O salário anual de " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome() + " é de R$" + df.format(empregado1.salarioAnual()));
					System.out.println("O salário anual de " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome() + " é de R$" + df.format(empregado2.salarioAnual()));
				
					System.out.println();
					System.out.println ("Atualizando o salário...");
					System.out.println ("Salário atualizado em 10%!");
					System.out.println();
				
					empregado1.aumento(); empregado2.aumento();
				
					System.out.println("O salário anual atualizado de " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome() + " é de R$" + df.format(empregado1.salarioAnual()));
					System.out.println("O salário anual atualizado de " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome() + " é de R$" + df.format(empregado2.salarioAnual()));
				}
				else System.out.println("Você não inseriu nenhum empregado ainda, insira os dois para que possa imprimir os salários anuais!");
				break;
			}
			
		}
	}
}
