import java.util.Scanner;
public class Bee3208 {
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		long i = 2;
		long k = s.nextLong(); long l = s.nextLong();
			while(k != 0 || l != 0) {
				if (k == 0 && l == 0)
				i = 2;
				while (k%i != 0 && i <= l) {
					i++;	
				}
			if(i >= l) System.out.println("GOOD");
			else System.out.println("BAD "+ i);
			k = s.nextInt(); l = s.nextInt();
		}		
	}
}