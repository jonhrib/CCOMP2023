import java.util.Scanner;

public class Bee2896 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int n = s.nextInt();
			int k = s.nextInt();
			if (n < k) {
				System.out.println (n);
			}
			else {
				int aux = 0, aux2 = 0, aux3 = 0, result = 0;
				aux = (int) (Math.floorDiv(n,k));
				aux2 = k*aux;
				aux3 = n-aux2;
				result = aux3 + aux;
				System.out.println (result);			}
		}
	}
}