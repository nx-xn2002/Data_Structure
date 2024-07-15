package follow_programmercarl.day54;

import java.util.Scanner;

/**
 * 100. 岛屿的最大面积
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1172
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IslandArea {
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
                        count = 1;
                        dfs(map, visited, i, j);
                        answer = Math.max(count, answer);
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
        static int count;

        private static void dfs(int[][] map, boolean[][] visited, int x, int y) {
            if (visited[x][y] || map[x][y] == 0) {
                return;
            }
            visited[x][y] = true;
            count++;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dir[i][0];
                int nextY = y + dir[i][1];
                if (nextX < 0 || nextX >= map.length || nextY < 0 || nextY >= map[0].length) {
                    continue;
                }
                dfs(map, visited, nextX, nextY);
            }
        }
    }
}
