import java.util.Scanner;

public class Bee2486 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int valor = 0;
		while (x != 0) {
			valor = 0;
			for (int i = 0; i < x; i++) {
				int qtd = s.nextInt();
				String produto = s.nextLine().replace(" ","");
				if (produto.equalsIgnoreCase("sucodelaranja")) {
					valor += (120*qtd);
				}
				else if (produto.equalsIgnoreCase("morangofresco")) {
					valor += (85*qtd);
				}
				else if (produto.equalsIgnoreCase("mamao")) {
					valor += (85*qtd);
				}
				else if (produto.equalsIgnoreCase("goiabavermelha")) {
					valor += (70*qtd);
				}
				else if (produto.equalsIgnoreCase("manga")) {
					valor += (56*qtd);
				}
				else if (produto.equalsIgnoreCase("laranja")) {
					valor += (50*qtd);
				}
				else if (produto.equalsIgnoreCase("brocolis")) {
					valor += (34*qtd);
				}
			}
			if (valor < 110) {
				int valormenor = 110-valor;
				System.out.println ("Mais " + (valormenor) + " mg");
			}
			else if (valor > 130) {
				int valormaior = valor - 130;
				System.out.println ("Menos " + (valormaior) + " mg");
			}
			else System.out.println (valor + " mg");
			x = s.nextInt();
		}
	}
}
