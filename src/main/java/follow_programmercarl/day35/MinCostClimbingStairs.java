package follow_programmercarl.day35;

/**
 * 746. 使用最小花费爬楼梯
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/min-cost-climbing-stairs/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MinCostClimbingStairs {
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            if (cost.length <= 1) {
                return cost[0];
            }
            int[] dp = new int[cost.length];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < cost.length; i++) {
                dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
            }
            return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
        }
    }
}
