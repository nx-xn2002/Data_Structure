package follow_programmercarl.day30;

/**
 * 122. 买卖股票的最佳时机 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxProfit {
    static class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] - prices[i - 1] > 0) {
                    res += (prices[i] - prices[i - 1]);
                }
            }
            return res;
        }
    }
}
