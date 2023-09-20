import java.util.Scanner;

public class Bee2762 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		String frase = s.next();
		int fras;
		//String x = Double.toString(frase); System.out.println (x);
		String [] array = frase.split("\\.");
		String fin = (array[array.length-1] + "." + array[0]);
		String [] array2 = fin.split("\\.");
		fras = Integer.parseInt(array2[0]);
		System.out.println (fras + "." + array2[1]);
	}
}