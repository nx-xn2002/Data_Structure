package follow_programmercarl.day36;

/**
 * 343. 整数拆分
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/integer-break/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IntegerBreak {
    static class Solution {
        public int integerBreak(int n) {
            if (n <= 3) {
                return n - 1;
            }
            int[] dp = new int[n + 1];
            dp[2] = 1;
            dp[3] = 2;
            for (int i = 4; i <= n; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    dp[i] = Math.max(Math.max(j * (i - j), dp[i - j] * j), dp[i]);
                }
            }
            return dp[n];
        }
    }
}
