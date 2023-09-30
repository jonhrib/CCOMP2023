import java.util.Scanner;

public class Bee1581 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int q = s.nextInt();
			String aux = "";
			for (int j = 0; j < q; j++) {
				String lingua = s.next();
				if (j > 0) {
					if (!lingua.equals(aux)) {
						aux = "ingles";
					}
					else aux = lingua;
				}
				else aux = lingua;
			}
			System.out.println(aux);
		}
	}
}
