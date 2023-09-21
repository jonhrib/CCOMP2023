import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee3477 {

	public static void main (String args []) {
		 Scanner s = new Scanner (System.in);
		 DecimalFormat df = new DecimalFormat ("0");
		 
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int z = s.nextInt();
	        
	        double area = 0;
	        
	        if (Math.pow(x,2) == (Math.pow(y,2) + Math.pow(z,2))) {
	        area = ((3.0*Math.pow((z/2.0),2.0))/2.0);
	        area += ((y*z)/2.0);
	        System.out.println ("AREA = " + df.format(area));
	        }
	        
	        else System.out.println ("Nao eh retangulo!");
	}
}
