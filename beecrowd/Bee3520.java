import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bee3520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        
        int s = scanner.nextInt();
        
        int g = scanner.nextInt();
        
        int u = scanner.nextInt();
        
        int d = scanner.nextInt();
        
        int minButtonPresses = getMinButtonPresses(f, s, g, u, d);
        
        if (minButtonPresses == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(minButtonPresses);
        }
        
        scanner.close();
    }
    
    public static int getMinButtonPresses(int f, int s, int g, int u, int d) {
        boolean[] visited = new boolean[f + 1];
        int[] buttons = {u, -d};
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;
        
        int buttonPresses = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int currentFloor = queue.poll();
                
                if (currentFloor == g) {
                    return buttonPresses;
                }
                
                for (int button : buttons) {
                    int nextFloor = currentFloor + button;
                    
                    if (nextFloor >= 1 && nextFloor <= f && !visited[nextFloor]) {
                        queue.offer(nextFloor);
                        visited[nextFloor] = true;
                    }
                }
            }
            
            buttonPresses++;
        }
        
        return -1; // Não é possível chegar ao andar objetivo
    }
}
