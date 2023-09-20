import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee2152 {
	
    public static void main (String args [])  {
    	Scanner s = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("00");
    	int N = s.nextInt();
    	int H, M, O;
    	String log;
    	for (int i = 0; i < N; i++) {
    		log = "";
    		H = s.nextInt();
    		M = s.nextInt();
    		O = s.nextInt();
    		
    		log += df.format(H);
    		log += ":";
    		log += df.format(M);
    		if (O == 1) log += " - A porta abriu!";
    		else log += " - A porta fechou!";
    		
    		System.out.println(log);
    	}
    	s.close();
    }
	
}