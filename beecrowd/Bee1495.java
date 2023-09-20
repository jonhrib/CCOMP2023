import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee1495 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			
			List<Integer> derrotas = new ArrayList<>();
			int N = leitor.nextInt();
			int G = leitor.nextInt();
			int pontos = 0;
			
			for (int i = 0; i < N; i++) {
				int S = leitor.nextInt();
				int R = leitor.nextInt();
				
				if (S > R) {
					pontos += 3;
				} 
				
				else if (S == R) {
					if (G > 0) {
						G -= 1;
						pontos += 3;
					} else {
						pontos += 1;
					}
				}
				
				else {
					derrotas.add(R - S + 1);
				}
			}
			
			Collections.sort(derrotas);
			for (int derrota : derrotas) {
				if (G - derrota >= 0) {
					G -= derrota;
					pontos += 3;
					if (G == 0) break;
				} else if (G - derrota == -1) {
					pontos += 1;
					break;
				} else {
					break;
				}
			}
			
			System.out.println(pontos);
		}
	}

}