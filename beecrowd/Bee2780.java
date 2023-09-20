import java.util.Scanner;

public class Bee2780 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int d = s.nextInt();
		int pontos = 0;
		if (d <= 800) pontos = 1;
		else if (d <= 1400) pontos = 2;
		else if (d <= 2000) pontos = 3;
		System.out.println (pontos);
	}
}
