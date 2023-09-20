import java.util.Scanner;

public class Bee1893 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int inicio = s.nextInt(); int fim = s.nextInt();
		
		if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        } else if (fim > inicio && fim <= 96) {
            System.out.println("crescente");
        } else if (inicio >= fim && fim <= 96) {
            System.out.println("minguante");
        } else { 
            System.out.println("cheia");
        }
	}
}
