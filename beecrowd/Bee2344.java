import java.util.Scanner;

public class Bee2344 {
    
    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        if ( x == 0) System.out.println ("E");
        else if (x >= 1 && x <= 35) System.out.println ("D");
        else if (x >= 36 && x <= 60) System.out.println ("C");
        else if (x >= 61 && x <= 85) System.out.println ("B");
        else if (x >= 86 && x <= 100) System.out.println ("A");
        s.close();
    }
}