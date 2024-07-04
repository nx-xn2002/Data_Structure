package follow_programmercarl.day43;

/**
 * 121. 买卖股票的最佳时机
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxProfit {
    static class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            int minPrice = Integer.MAX_VALUE;
            for (int price : prices) {
                if (price <= minPrice) {
                    minPrice = price;
                } else {
                    res = Math.max(price - minPrice, res);
                }
            }
            return res;
        }
    }
}
