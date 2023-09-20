import java.util.HashSet;
import java.util.Scanner;

public class Bee1609 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = s.nextInt();
			HashSet<Integer> numeros = new HashSet<>();
			
			for (int j = 0; j < N; j++) {
				numeros.add(s.nextInt());
			}
			
			System.out.println(numeros.size());
		}
    }

}