import java.util.Scanner;;

public class Bee1957 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		String hexa = Integer.toHexString(x).toUpperCase();
		System.out.println (hexa);
		s.close();
	}
}
