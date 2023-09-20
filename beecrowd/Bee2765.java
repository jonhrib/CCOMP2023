import java.util.*;

public class Bee2765 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		String frase = s.nextLine();
		String [] array = frase.split(",");
		for (int i = 0; i < array.length; i++) {
			System.out.println (array[i]);
		}
	}
}
