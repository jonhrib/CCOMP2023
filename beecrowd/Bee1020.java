import java.util.Scanner;

public class Bee1020 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int dias = s.nextInt();
		int anos = dias/365;
		dias = (dias - (anos*365));
		int meses = dias/30;
		dias = (dias- (meses*30));
		System.out.println (anos + " ano(s)");
		System.out.println (meses + " mes(es)");
		System.out.println (dias + " dia(s)");
		s.close();
	}
}