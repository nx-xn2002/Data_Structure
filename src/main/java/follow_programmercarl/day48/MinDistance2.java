package follow_programmercarl.day48;

/**
 * 72. 编辑距离
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/edit-distance/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MinDistance2 {
    static class Solution {
        public int minDistance(String word1, String word2) {
            int len1 = word1.length(), len2 = word2.length();
            int[][] dp = new int[len1 + 1][len2 + 1];
            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }
            for (int i = 0; i <= len2; i++) {
                dp[0][i] = i;
            }
            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                }
            }
            return dp[len1][len2];
        }
    }
}
