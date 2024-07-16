package follow_programmercarl.day55;

import java.util.Scanner;

/**
 * 102. 沉没孤岛
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1174
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SankIsland {
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
            for (int i = 0; i < m; i++) {
                if (map[i][0] == 1) {
                    dfs(map, visited, i, 0);
                }
                if (map[i][n - 1] == 1) {
                    dfs(map, visited, i, n - 1);
                }
            }
            for (int i = 0; i < n; i++) {
                if (map[0][i] == 1) {
                    dfs(map, visited, 0, i);
                }
                if (map[m - 1][i] == 1) {
                    dfs(map, visited, m - 1, i);
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] && map[i][j] == 1) {
                        System.out.printf("" + 1);
                    } else {
                        System.out.printf("" + 0);
                    }
                    if (j != n - 1) {
                        System.out.printf(" ");
                    }
                }
                if (i != m - 1) {
                    System.out.println();
                }
            }
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
