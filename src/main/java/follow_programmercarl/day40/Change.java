package follow_programmercarl.day40;

import java.util.Arrays;

/**
 * 518. 零钱兑换 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/coin-change-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Change {
    static class Solution {
        public int change(int amount, int[] coins) {
            Arrays.sort(coins);
            int[] dp = new int[amount + 1];
            dp[0] = 1;
            for (int coin : coins) {
                for (int i = coin; i <= amount; i++) {
                    dp[i] += dp[i - coin];
                }
            }
            return dp[amount];
        }
    }
}
