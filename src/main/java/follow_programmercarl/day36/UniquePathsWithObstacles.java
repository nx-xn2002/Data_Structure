package follow_programmercarl.day36;

/**
 * 63. 不同路径 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/unique-paths-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class UniquePathsWithObstacles {
    static class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                if (obstacleGrid[i][0] == 0) {
                    dp[i][0] = 1;
                } else {
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (obstacleGrid[0][i] == 0) {
                    dp[0][i] = 1;
                } else {
                    break;
                }
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        continue;
                    }
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[m - 1][n - 1];
        }
    }
}
