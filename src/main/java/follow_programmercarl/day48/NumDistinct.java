package follow_programmercarl.day48;

/**
 * 115. 不同的子序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/distinct-subsequences/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class NumDistinct {
    static class Solution {
        public int numDistinct(String s, String t) {
            int[][] dp = new int[s.length() + 1][t.length() + 1];
            for (int i = 0; i < s.length() + 1; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i < s.length() + 1; i++) {
                for (int j = 1; j < t.length() + 1; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[s.length()][t.length()];
        }
    }
}
