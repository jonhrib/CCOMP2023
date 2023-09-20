import java.util.*;

public class Bee2763 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String cpf = s.nextLine();
		String [] array = cpf.split("\\.");
		String [] array2 = cpf.split("-");
		for (int i = 0; i < array.length; i++) {
			if (i == (array.length-1)) {
				System.out.println (String.format("%.3s",array[i]));
			}
			else
			System.out.println (array[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			if (i == 1) System.out.println (array2[i]);
		}
	}
}
