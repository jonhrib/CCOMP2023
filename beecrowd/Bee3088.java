import java.util.Scanner;

public class Bee3088 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			String frase = s.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				if ((frase.charAt(i) == ',' || frase.charAt(i) == '.') && i != 0) {
					if (frase.charAt(i-1) == ' ') {
						frase = frase.substring(0,(i-1)) + "" + frase.substring(i);
					}
				}
			}
			System.out.println(frase);
		}
	}
}
