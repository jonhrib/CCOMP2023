import java.util.Scanner;

public class Bee2165 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String tweet = s.nextLine();
		if (tweet.length() > 140)System.out.println ("MUTE");
		else System.out.println ("TWEET");
	}
}
