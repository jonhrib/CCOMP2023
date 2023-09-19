package Ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal1 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de usuários que deseja inserir: "); int qtd = s.nextInt();
		s.nextLine();
				
		Usuario user [] = new Usuario [qtd];
		
		for (int i = 0; i < qtd; i++) {
		
			boolean loop = true;
			do {
				try {
					user[i] = new Usuario();
					System.out.println("---------------------------------------------");
					System.out.print("Insira o nome para o usuário " + (i+1) + ": ");
					user[i].setNome(s.nextLine());
					System.out.print("Insira o peso para o usuário " + (i+1) + ": ");
					user[i].setPeso(s.nextDouble());
					System.out.print("Insira a altura para o usuário " + (i+1) + ": ");
					user[i].setAltura(s.nextDouble());
					s.nextLine();
					loop = false;
				}
				catch (InputMismatchException e) {
					System.err.println("Excessão: " + e);
					System.out.println("Utilize uma entrada válida (double)");
					s.nextLine();
				}
			} while (loop);
		}
		
		ArrayList <Usuario> lista = new ArrayList();
		
		for (int i = 0; i < qtd; i++) {
			lista.add(user[i]);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).ImprimeDados();
		}
	}
}
