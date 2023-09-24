import java.util.Scanner;

public class Bee3416 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int alunos = s.nextInt();
		int litros = s.nextInt();
		int individual = s.nextInt();
		
		int total = (alunos*individual);
		int litrostotais = litros*1000;
		
		while (litrostotais < total) {
			litrostotais += (litros*1000);
		}
		
		System.out.println(litrostotais/1000);
	}
}
