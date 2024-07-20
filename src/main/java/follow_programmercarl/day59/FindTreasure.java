package follow_programmercarl.day59;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 53. 寻宝
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1053
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindTreasure {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x, y, k;
            int v = scanner.nextInt();
            int e = scanner.nextInt();
            // 填一个默认最大值，题目描述val最大为10000
            int[][] grid = new int[v + 1][v + 1];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j] = Integer.MAX_VALUE;
                }
            }
            while (e-- > 0) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                k = scanner.nextInt();
                grid[x][y] = k;
                grid[y][x] = k;
            }

            int[] minDist = new int[v + 1];
            Arrays.fill(minDist, Integer.MAX_VALUE);
            boolean[] isInTree = new boolean[v + 1];
            for (int i = 1; i < v; i++) {
                int cur = -1;
                int minVal = Integer.MAX_VALUE;
                for (int j = 1; j <= v; j++) {
                    if (!isInTree[j] && minDist[j] < minVal) {
                        minVal = minDist[j];
                        cur = j;
                    }
                }
                isInTree[cur] = true;
                for (int j = 1; j <= v; j++) {
                    if (!isInTree[j] && grid[cur][j] < minDist[j]) {
                        minDist[j] = grid[cur][j];
                    }
                }
            }

            int result = 0;
            for (int i = 2; i <= v; i++) {
                result += minDist[i];
            }
            System.out.println(result);
        }
    }
}
