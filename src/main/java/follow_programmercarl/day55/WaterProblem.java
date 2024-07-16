package follow_programmercarl.day55;

import java.util.Scanner;

/**
 * 103. 水流问题
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1175
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class WaterProblem {
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
            boolean[][] first = new boolean[m][n];
            boolean[][] second = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                dfs(map, first, i, 0);
                dfs(map, second, i, n - 1);
            }

            for (int j = 0; j < n; j++) {
                dfs(map, first, 0, j);
                dfs(map, second, m - 1, j);
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (first[i][j] && second[i][j]) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }

        static int[][] dir = {
                {0, 1},
                {1, 0},
                {-1, 0},
                {0, -1}
        };

        private static void dfs(int[][] map, boolean[][] visited, int x, int y) {
            if (visited[x][y]) {
                return;
            }
            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dir[i][0];
                int nextY = y + dir[i][1];
                if (nextX < 0 || nextX >= map.length || nextY < 0 || nextY >= map[0].length) {
                    continue;
                }
                if (map[x][y] > map[nextX][nextY]) {
                    continue;
                }
                dfs(map, visited, nextX, nextY);
            }
        }
    }
}
