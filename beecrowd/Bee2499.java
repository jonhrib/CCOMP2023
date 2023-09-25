import java.util.Scanner;

public class Bee2499 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		long areatotal = 1, x = 1, y = 1;
		long a,c,b,bh,area;
		
		areatotal = s.nextLong();
		x = s.nextLong();
		y = s.nextLong();
		
		while (areatotal != 0 || x != 0 || y != 0) {
			a = s.nextLong();
			b = s.nextLong();
			c = s.nextLong();
			
			bh = areatotal*2;
			area = (bh*(Math.abs(c-b)*(a))/(2*(x+1)*(y+1)));
			System.out.println(area);
			
			areatotal = s.nextLong();
			x = s.nextLong();
			y = s.nextLong();
		}
		
		s.close();
	}
}
