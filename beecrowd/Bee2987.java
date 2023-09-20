import java.util.Scanner;

public class Bee2987 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char leitura = s.next().charAt(0);
		for (int i = 0; i < 26; i++) {
			if (leitura == alfabeto [i]) {
				System.out.println (i+1);
				break;
			}
		}
		
	}
}
