import java.util.Scanner;

public class Bee1805 {
 
    public static void main (String args []){
        Scanner s = new Scanner (System.in);
        long x = s.nextInt(); long y = s.nextInt();
        long soma = 0;
        
        for (long i = x; i <= y; i++){
            soma += i;
        }
        
        System.out.println (soma);
    }
 
}