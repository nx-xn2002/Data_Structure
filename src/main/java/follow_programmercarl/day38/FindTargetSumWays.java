package follow_programmercarl.day38;

/**
 * 494. 目标和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/target-sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindTargetSumWays {
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (Math.abs(target) > sum) {
                return 0;
            }
            if ((sum + target) % 2 != 0) {
                return 0;
            }
            // 加法的为x，减法的为sum - x，因此有target = x - (sum - x)，x = (sum + target) / 2
            int size = (sum + target) / 2;
            int[] dp = new int[size + 1];
            dp[0] = 1;
            for (int num : nums) {
                for (int i = size; i >= num; i--) {
                    dp[i] += dp[i - num];
                }
            }
            return dp[size];
        }
    }
}
