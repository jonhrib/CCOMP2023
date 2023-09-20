import java.util.Scanner;

public class Bee1323 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        while ((n = s.nextInt()) != 0) {
            int result = quantidade(n);
            System.out.println(result);
        }
        
    }

    public static int quantidade (int n) {
        int cont = 0;
        
        for (int i = 1; i <= n; i++) {
            cont += (i * i);
        }
        
        return cont;
    }
}
