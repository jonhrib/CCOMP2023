import java.util.*;

public class Bee2845 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), maior = 0;
		for (int i = 0; i < x; i++) {
			int num = s.nextInt();
			if (i == 0) maior = num;
			else if (num > maior) maior = num;
		}
		System.out.println(maior+1);
	}
}
