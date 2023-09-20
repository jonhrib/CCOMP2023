import java.util.Scanner;

public class Bee1848 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int valor;
		int parada;
		String corvo;
		for (int i = 0; i < 3; i++) {
			valor = 0;
			parada = 0;
			while (parada == 0) {
				corvo = s.nextLine();
				switch (corvo ) {
				case ("--*"): 
					valor = valor + 1; 
				    break;
				case ("-*-"): 
					valor = valor + 2; 
				    break;
				case ("-**"): 
					valor = valor + 3; 
				    break;
				case ("*--"): 
					valor = valor + 4; 
				    break;
				case ("*-*"):
					valor = valor + 5;
				case ("**-"): 
					valor = valor + 6; 
				    break;
				case ("***"): 
					valor = valor + 7; 
				    break;
				default: 
					parada = 1;
					break;
				}
			}
			System.out.println (valor);
		}
	}
}
