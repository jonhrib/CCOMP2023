import java.util.Scanner;
import java.text.*;

public class Bee3076 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			int ano = s.nextInt();
			int min = 1, max = 100, sec = 0;
			if (ano >= min && ano <= max) {
				sec++;
				System.out.println (sec);
			}
			else {
				while (min <= ano) {
					min += 100; max += 100; sec++;
				}
				System.out.println (sec);
			}
		}
	}
}
