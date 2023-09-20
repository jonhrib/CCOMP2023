import java.util.Scanner;

public class Bee2057 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int horainicial, viagem, fuso, horafinal;
		horainicial = s.nextInt();
		viagem = s.nextInt();
		fuso = s.nextInt();
		if ((horainicial + viagem) > 24) {
			horafinal = ((horainicial + viagem)%24);
			horafinal = horafinal + fuso;
		}
		else if (((horainicial + viagem) + fuso) < 0) {
			horafinal = ((horainicial + viagem) + fuso);
			horafinal = horafinal + 24;
		}
		else horafinal = ((horainicial + viagem) + fuso);
		System.out.println (horafinal);
		s.close();
	}
}
