package follow_programmercarl.day47;

/**
 * 1143. 最长公共子序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/longest-common-subsequence/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LongestCommonSubsequence {
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            char[] t1 = text1.toCharArray(), t2 = text2.toCharArray();
            int m = t1.length, n = t2.length;
            int[][] dp = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i + 1][j + 1] = t1[i] == t2[j] ? dp[i][j] + 1 : Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
            return dp[m][n];
        }
    }
}
