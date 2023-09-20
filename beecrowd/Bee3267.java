import java.util.*;

public class Bee3267 {
    
    static int[][] heightMap;
    static int[][] visited;
    static double[] tideHeights;
    static double a, m;
    static int w, h, startX, startY;
    static int maxDistance = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        m = sc.nextDouble();
        w = sc.nextInt();
        h = sc.nextInt();
        startX = sc.nextInt();
        startY = sc.nextInt();
        heightMap = new int[h][w];
        visited = new int[h][w];
        tideHeights = new double[121];
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                heightMap[i][j] = sc.nextInt();
            }
        }
        calculateTideHeights();
        bfs(startX, startY, 0);
        System.out.println(maxDistance);
    }
    
    private static void calculateTideHeights() {
		// TODO Auto-generated method stub
		
	}

	static void bfs(int x, int y, int distance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 0});
        visited[y][x] = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0];
            int currY = current[1];
            int currTime = current[2];
            maxDistance = Math.max(maxDistance, distance);
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 || j == 0) {
                        int nextX = currX + i;
                        int nextY = currY + j;
                        if (nextX >= 0 && nextX < w && nextY >= 0 && nextY < h && visited[nextY][nextX] == 0) {
                            int heightDiff = Math.abs(heightMap[nextY][nextX] - heightMap[currY][currX]);
                            if (heightDiff <= 1 && isDry(nextX, nextY, currTime)) {
                                visited[nextY][nextX] = 1;
                                queue.add(new int[]{nextX, nextY, currTime + (int)(m*1000)});
                            }
                        }
                    }
                }
            }
        }
    }

	private static boolean isDry(int nextX, int nextY, int currTime) {
		// TODO Auto-generated method stub
		return false;
	}
}
