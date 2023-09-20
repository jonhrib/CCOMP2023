import java.util.Scanner;

public class Bee2749 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int j = 0, o = 0;
		String h = "";
		for (int i= 0; i < 20; i++) {
			h = Integer.toHexString(j).toUpperCase();
			if (j == 8) o = 10;
			if (i == 0 || i == 2 || i ==19) {
				System.out.println ("---------------------------------------");
			}
			else if (i == 1) {
				System.out.println ("|  decimal  |  octal  |  Hexadecimal  |");
			}
			else if (i < 11) {
				System.out.println ("|      " + j + "    |    "+ o +"    |       " + h +"       |");
			}
			else if (i < 13) {
				System.out.println ("|      " + j + "    |   "+ o +"    |       " + h +"       |");
			}
			else {
				System.out.println ("|     " + j + "    |   "+ o +"    |       " + h +"       |");
			}
			if (i >= 3 ) {
				o++;
				j++;
			}
		}
	}
}