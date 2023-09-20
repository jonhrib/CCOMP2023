import java.util.Scanner;

public class Bee1087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] movimentos = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        
        while (true) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }
            
            int movimentosNecessarios = 0;
            
            if (x1 != x2 || y1 != y2) {
                if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                    movimentosNecessarios = 1;
                } else {
                    movimentosNecessarios = 2;
                }
            }
            
            System.out.println(movimentosNecessarios);
        }
        
        sc.close();
    }
}
