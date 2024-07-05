package follow_programmercarl.day44;

/**
 * 714. 买卖股票的最佳时机含手续费
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxProfit6 {
    static class Solution {
        public int maxProfit(int[] prices, int fee) {
            int len = prices.length;
            int[][] dp = new int[len][2];
            dp[0][0] = -prices[0];
            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
                dp[i][1] = Math.max(dp[i - 1][0] + prices[i] - fee, dp[i - 1][1]);
            }
            return Math.max(dp[len - 1][0], dp[len - 1][1]);
        }
    }
}
