import java.util.Scanner;

public class Bee1197 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while(s.hasNext()) {
			int v = s.nextInt();
			int t = s.nextInt();
			int result = (v*2)*t;
			System.out.println (result);
		}
	}
}
