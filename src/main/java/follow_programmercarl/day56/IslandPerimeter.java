package follow_programmercarl.day56;

import java.util.Scanner;

/**
 * 106. 岛屿的周长
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1178
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IslandPerimeter {
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
            int answer = 0;
            int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 0) {
                        continue;
                    }
                    for (int k = 0; k < 4; k++) {
                        int x = i + dir[k][0];
                        int y = j + dir[k][1];
                        if (x < 0 || x >= m || y < 0 || y >= n) {
                            answer++;
                            continue;
                        }
                        if (map[x][y] == 0) {
                            answer++;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
