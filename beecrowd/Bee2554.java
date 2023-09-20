import java.util.Scanner;

public class Bee2554 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			int x = s.nextInt();
			int y = s.nextInt();
			int cont = 0,teste = 0;
			String datacerta = "";
			for (int i = 0; i < y; i++) {
				cont = 0;
				String data = s.next();
				for (int j = 0; j < x; j++) {
					int comparecimento = s.nextInt();
					if (comparecimento == 1) cont++;
				}
				if (cont == x && teste == 0) {
					datacerta = data;
					teste++;
				}
			}
			if (teste == 0) System.out.println ("Pizza antes de FdI");
			else System.out.println (datacerta);
		}
	}
}
