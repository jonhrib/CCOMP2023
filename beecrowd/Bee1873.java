import java.util.Scanner;

public class Bee1873 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i <= x; i++) {
			String a = s.nextLine();
			if (a.equalsIgnoreCase("papel papel")) System.out.println ("empate");
			else if (a.equalsIgnoreCase("tesoura tesoura")) System.out.println ("empate");
			else if (a.equalsIgnoreCase("pedra pedra")) System.out.println ("empate");
			else if (a.equalsIgnoreCase("lagarto lagarto")) System.out.println ("empate");
			else if (a.equalsIgnoreCase("Spock Spock")) System.out.println ("empate");
			else if (a.equalsIgnoreCase("tesoura papel")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("papel tesoura")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("papel pedra")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("pedra papel")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("pedra lagarto")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("lagarto pedra")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("lagarto Spock")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("Spock lagarto")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("Spock tesoura")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("tesoura Spock")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("tesoura lagarto")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("lagarto tesoura")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("lagarto papel")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("papel lagarto")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("papel Spock")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("Spock papel")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("Spock pedra")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("pedra Spock")) System.out.println ("sheldon");
			else if (a.equalsIgnoreCase("pedra tesoura")) System.out.println ("rajesh");
			else if (a.equalsIgnoreCase("tesoura pedra")) System.out.println ("sheldon");
		}
		s.close();
	}
}
