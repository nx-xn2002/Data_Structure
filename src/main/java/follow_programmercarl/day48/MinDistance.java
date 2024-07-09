package follow_programmercarl.day48;

/**
 * 583. 两个字符串的删除操作
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/delete-operation-for-two-strings/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MinDistance {
    static class Solution {
        public int minDistance(String word1, String word2) {
            int[][] dp = new int[word1.length() + 1][word2.length() + 1];
            for (int i = 0; i < word1.length() + 1; i++) {
                dp[i][0] = i;
            }
            for (int i = 0; i < word2.length() + 1; i++) {
                dp[0][i] = i;
            }
            for (int i = 1; i < word1.length() + 1; i++) {
                for (int j = 1; j < word2.length() + 1; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1] + 2, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                    }
                }
            }
            return dp[word1.length()][word2.length()];
        }
    }
}
