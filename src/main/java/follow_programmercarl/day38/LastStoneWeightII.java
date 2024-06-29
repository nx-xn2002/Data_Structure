package follow_programmercarl.day38;

/**
 * 1049. 最后一块石头的重量 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/last-stone-weight-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LastStoneWeightII {
    static class Solution {
        public int lastStoneWeightII(int[] stones) {
            int[] dp = new int[15001];
            int sum = 0;
            for (int k : stones) {
                sum += k;
            }
            int target = sum / 2;
            for (int stone : stones) {
                for (int j = target; j >= stone; j--) {
                    dp[j] = Math.max(dp[j], dp[j - stone] + stone);
                }
            }
            return sum - dp[target] - dp[target];
        }
    }
}
