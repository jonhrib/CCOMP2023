import java.util.Scanner;

public class Bee2146 {
    public static void main(String args []) {
        Scanner s = new Scanner(System.in);
        
        while (s.hasNext()) {
            int n = s.nextInt();
            int senha = n-1;
            System.out.println(senha);
        }
        
        s.close();
    }
}