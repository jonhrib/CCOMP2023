import java.util.Scanner;

public class Bee1960 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int [] num = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String [] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int x = s.nextInt();
		int i = 0;
		while (x > 0) {
			if (x >= num[i]) {
				System.out.print (rom[i]);
				x -= num[i];
			}
			else i++;
		}
		System.out.print("\n");
	}
}
