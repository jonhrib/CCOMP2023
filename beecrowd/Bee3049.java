import java.util.Scanner;

public class Bee3049 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int base = s.nextInt();
		int topo = s.nextInt();
		
		int areatotal = (70*160);
		double areatriangulo = ((topo-base)*70.0)/2;
		double area = (70*topo)-(areatriangulo);
		
		if (area < (areatotal/2)) System.out.println("2");
		else if (area > (areatotal/2)) System.out.println("1");
		else if (area == (areatotal/2))  System.out.println("0");
	}
}
