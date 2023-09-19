//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex02;
import java.util.*;
import java.text.*;

public class Main {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		Pessoa p1 = new Pessoa();
		p1.Pessoa();
		System.out.println("+----- " + p1.getNome() + " -----+");
		System.out.println("CPF - " + p1.getCpf());
		System.out.println("Idade - " + p1.getIdade() + " anos");
		System.out.println("Altura - " + p1.getAltura() + " metros");
		System.out.println("Peso - " + p1.getPeso() + " kg");
		System.out.println("IMC - " + df.format(p1.getIMC()) + " kg/m², ou seja, o indivíduo pertence a classe de " + p1.getIMCinfo() + " na escala da OMS");
		System.out.println("+---------------------+");
		
		System.out.println();
		
		Pessoa p2 = new Pessoa();
		System.out.println("Digite o nome da Pessoa: ");
		String nome = s.nextLine();
		p2.Pessoa(nome);
		System.out.println("+----- " + p2.getNome() + " -----+");
		System.out.println("CPF - " + p2.getCpf());
		System.out.println("Idade - " + p2.getIdade() + " anos");
		System.out.println("Altura - " + p2.getAltura() + " metros");
		System.out.println("Peso - " + p2.getPeso() + " kg");
		System.out.println("IMC - " + df.format(p2.getIMC()) + " kg/m², ou seja, o indivíduo pertence a classe de " + p2.getIMCinfo() + " na escala da OMS");
		System.out.println("+---------------------+");
		
	}
	
}