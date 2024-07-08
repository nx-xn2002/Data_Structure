package follow_programmercarl.day47;

/**
 * 392. 判断子序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/is-subsequence/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsSubsequence {
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int length1 = s.length(), length2 = t.length();
            int[][] dp = new int[length1 + 1][length2 + 1];
            for (int i = 1; i <= length1; i++) {
                for (int j = 1; j <= length2; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
            return dp[length1][length2] == length1;
        }
    }
}
