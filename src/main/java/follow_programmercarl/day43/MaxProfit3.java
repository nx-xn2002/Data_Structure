package follow_programmercarl.day43;

/**
 * 123. 买卖股票的最佳时机 III
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxProfit3 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int len = prices.length;
            if (prices.length == 0) {
                return 0;
            }
            int[][] dp = new int[len][5];
            dp[0][1] = -prices[0];
            dp[0][3] = -prices[0];
            for (int i = 1; i < len; i++) {
                dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
                dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
                dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
            }
            return dp[len - 1][4];
        }
    }
}
