import java.util.*;

public class Bee1168 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String num = s.next();
			char numero [] = num.toCharArray();
			int soma = 0;
			for (int j = 0; j < numero.length; j++) {
				if (numero[j] == '0') soma+=6;
				else if (numero[j] == '1') soma+=2;
				else if (numero[j] == '2') soma+=5;
				else if (numero[j] == '3') soma+=5;
				else if (numero[j] == '4') soma+=4;
				else if (numero[j] == '5') soma+=5;
				else if (numero[j] == '6') soma+=6;
				else if (numero[j] == '7') soma+=3;
				else if (numero[j] == '8') soma+=7;
				else if (numero[j] == '9') soma+=6;
			}
			System.out.println (soma + " leds");
		}
	}
}
