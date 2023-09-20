import java.util.Scanner;

public class Bee1929 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int maior, segundoMaior, menor1, menor2;
		
		if (a > b && a > c && a > d) {
			maior = a;
			if (b > c && b > d) {
				segundoMaior = b;
				menor1 = c;
				menor2 = d;
			} else if (c > d) {
				segundoMaior = c;
				menor1 = b;
				menor2 = d;
			} else {
				segundoMaior = d;
				menor1 = b;
				menor2 = c;
			}
		} else if (b > c && b > d) {
			maior = b;
			if (a > c && a > d ) {
				segundoMaior = a;
				menor1 = c;
				menor2 = d;
			} else if (c > d) {
				segundoMaior = c;
				menor1 = a;
				menor2 = d;
			} else {
				segundoMaior = d;
				menor1 = c;
				menor2 = a;
			}
		} else if (c > d) {
			maior = c;
			if (a > b && a > d) {
				segundoMaior = a;
				menor1 = b;
				menor2 = d;
			} else if (b > d) {
				segundoMaior = b;
				menor1 = a;
				menor2 = d;
			} else {
				segundoMaior = d;
				menor1 = a;
				menor2 = b;
			}
		} else {
			maior = d;
			if (a > b && a > c) {
				segundoMaior = a;
				menor1 = b;
				menor2 = c;
			} else if (b > c) {
				segundoMaior = b;
				menor1 = a;
				menor2 = c;
			} else {
				segundoMaior = c;
				menor1 = a;
				menor2 = b;
			}
		}
		
		if ((menor1 + menor2 > maior) || (menor1 + menor2 > segundoMaior) ||
			(menor1 + segundoMaior > maior) || (menor1 + segundoMaior > maior) ||
			(menor2 + segundoMaior > maior) || (menor2 + segundoMaior > maior))
			System.out.println("S");
		else
			System.out.println("N");
	}
}
