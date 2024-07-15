package follow_programmercarl.day54;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 99. 岛屿数量
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1171
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IslandCount2 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] map = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }
            boolean[][] visited = new boolean[m][n];
            int answer = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        answer++;
                        bfs(map, visited, i, j);
                    }
                }
            }
            System.out.println(answer);
        }

        static int[][] dir = {
                {0, 1},
                {1, 0},
                {-1, 0},
                {0, -1}
        };

        private static void bfs(int[][] map, boolean[][] visited, int x, int y) {
            Queue<Integer[]> queue = new LinkedList<>();
            queue.add(new Integer[]{x, y});
            visited[x][y] = true;
            while (!queue.isEmpty()) {
                Integer[] top = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int nextX = top[0] + dir[i][0];
                    int nextY = top[1] + dir[i][1];
                    if (nextX < 0 || nextX >= map.length || nextY < 0 || nextY >= map[0].length) {
                        continue;
                    }
                    if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                        queue.add(new Integer[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }
    }
}
