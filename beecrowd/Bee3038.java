import java.util.Scanner;

public class Bee3038 {
	
	public static void main (String args []) {
		Scanner  s = new Scanner (System.in);
		
		while (s.hasNext()) {
			String frase = s.nextLine();
			frase = frase.replace("@", "a");frase=frase.replace("&", "e");frase=frase.replace("!", "i");frase=frase.replace("*", "o");frase=frase.replace("#", "u");
			System.out.println (frase);
		}
	}
}
