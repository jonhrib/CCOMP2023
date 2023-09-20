import java.util.Scanner;

public class Bee1019 {
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int segundos = s.nextInt();
		int horas = segundos/3600;
		segundos = (segundos - (horas*3600));
		int minutos = segundos/60;
		segundos = (segundos- (minutos*60));
		System.out.println (horas + ":" + minutos + ":" + segundos);
		s.close();
	}
}
