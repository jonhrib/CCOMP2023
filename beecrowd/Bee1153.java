import java.util.Scanner;

public class Bee1153 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int fat,aux;
		fat = 1;
		aux = 1;
		while (aux <= x) {
			fat *= aux;
			aux++;	
		}
		System.out.println (fat);
		s.close();
	}
}
