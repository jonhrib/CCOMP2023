package Atividade8;
import java.util.Scanner;

public class Ex1 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		System.out.print ("O ano de nascimento: "); String nascimento =s.next();
		System.out.print ("O ano atual: "); String anoatual = s.next();
		
		int atual = Integer.parseInt(anoatual);
		int nasc = Integer.parseInt(nascimento);
		if (atual != nasc) {
			System.out.println("A idade da pessoa: " + (atual-nasc) + " anos");
		}
		else System.out.println("Os anos são iguais! ");
	}
}
