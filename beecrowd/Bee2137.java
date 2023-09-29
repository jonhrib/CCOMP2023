import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Bee2137 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			int qtd = s.nextInt();
			ArrayList<String> valores = new ArrayList();
			
			
			for (int i = 0; i < qtd; i++) {
				valores.add(s.next());
			}
			
			Collections.sort(valores); //organiza em ordem crescente
			
			for (int i = 0; i < qtd; i++) {
				System.out.println(valores.get(i));
			}
		}
	}
}
