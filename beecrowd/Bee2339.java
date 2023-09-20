import java.util.Scanner;

public class Bee2339 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int alunos = s.nextInt();
		int folhascompradas = s.nextInt();
		int folhasnecessarias = s.nextInt();
		
		int aux = alunos*folhasnecessarias;
		if (aux <= folhascompradas) System.out.println ("S");
		else System.out.println ("N");
	}
}
