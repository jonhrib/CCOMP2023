import java.util.*;

public class Bee2764 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String data = s.next();
		String array [] = data.split("/");
		String a = array[0];
		String b = array[1];
		String c = array[2];
		System.out.println (b + "/" + a + "/" + c);
		System.out.println (c + "/" + b + "/" + a);
		System.out.println (a + "-" + b + "-" + c);
	}
}
