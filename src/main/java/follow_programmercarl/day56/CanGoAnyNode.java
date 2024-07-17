package follow_programmercarl.day56;

import java.util.*;

/**
 * 105. 有向图的完全可达性
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1177
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CanGoAnyNode {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            boolean[][] map = new boolean[m + 1][m + 1];
            boolean[] visited = new boolean[m + 1];
            for (int i = 0; i < n; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                map[begin][end] = true;
            }
            dfs(map, 1, visited);
            for (int i = 1; i <= m; i++) {
                if (!visited[i]) {
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(1);
        }

        private static void dfs(boolean[][] map, int x, boolean[] visited) {
            if (visited[x]) {
                return;
            }
            visited[x] = true;
            for (int i = 1; i < map[x].length; i++) {
                if (visited[i] || !map[x][i]) {
                    continue;
                }
                dfs(map, i, visited);
            }
        }
    }
}
