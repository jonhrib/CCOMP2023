import java.util.Scanner;

public class Bee2544 {

	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			System.out.println(log2(N));
		}
	}
	
	private static int log2(int N) {
		return (int) (Math.log(N) / Math.log(2));
	}
	
}