import java.util.Scanner;

public class Bee1047 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int hinicial = s.nextInt();
		int minicial = s.nextInt();
		int hfinal =  s.nextInt();
		int mfinal = s.nextInt();
		int m = 0;
		int h = 0;
		if (hfinal > hinicial) {
			h = hfinal - hinicial;
		}
		else if (hfinal < hinicial) {
			h = (24 - (hinicial - hfinal));
		}
		if (mfinal > minicial) {
			m = mfinal - minicial;
		}
		else if (mfinal < minicial) {
			m = (60 - (minicial - mfinal));
			h -= 1; 
		}
		if (hinicial == hfinal && minicial == mfinal) {
			System.out.println ("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else {
			System.out.println ("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
		}
		s.close();
	}
}
