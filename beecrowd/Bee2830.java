import java.util.Scanner;

public class Bee2830 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int mestreKung = s.nextInt();
    	int mestreLu = s.nextInt();
    	
    	if ((mestreLu - 1) / 2 == (mestreKung - 1) / 2)
    		System.out.println("oitavas");
    	
    	else if ((mestreLu - 1) / 4 == (mestreKung - 1) / 4)
    		System.out.println("quartas");
    	
    	else if ((mestreLu - 1) / 8 == (mestreKung - 1) / 8)
    		System.out.println("semifinal");
    	
    	else
    		System.out.println("final");
    }
    
}