package follow_programmercarl.day44;

/**
 * 309. 买卖股票的最佳时机含冷冻期
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxProfit5 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            if (n == 0) {
                return 0;
            }
            //0买入，1卖出，2持有，3冷冻
            int[][] dp = new int[n][4];
            dp[0][0] = -prices[0];
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][3] - prices[i], dp[i - 1][1] - prices[i]));
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
                dp[i][2] = dp[i - 1][0] + prices[i];
                dp[i][3] = dp[i - 1][2];
            }
            return Math.max(dp[n - 1][3], Math.max(dp[n - 1][1], dp[n - 1][2]));
        }
    }
}
