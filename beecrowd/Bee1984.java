import java.util.Scanner;

public class Bee1984 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String num = String.valueOf(s.nextLong());
		String inverso = "";
		for (int i = 0; i < num.length(); i++) {
			inverso = inverso + num.charAt(num.length()-i-1);
		}
		System.out.println(inverso);
		s.close();
	}
}
