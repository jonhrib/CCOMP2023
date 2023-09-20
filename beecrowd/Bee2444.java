import java.util.Scanner;

public class Bee2444 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int t = s.nextInt();
		
		for (int i = 0; i < t; i++) {
			v += s.nextInt();
			if (v > 100) v = 100;
			if (v < 0)   v = 0;
		}
		System.out.println(v);
	}

}