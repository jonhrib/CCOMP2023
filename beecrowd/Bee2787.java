import java.util.Scanner;

public class Bee2787 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		if ((i%2 == 0) && (j%2 == 0)) System.out.println ("1");
		if ((i%2 != 0) && (j%2 == 0)) System.out.println ("0");
		if ((i%2 == 0) && (j%2 != 0)) System.out.println ("0");
		if ((i%2 != 0) && (j%2 != 0)) System.out.println ("1");
	}
}
