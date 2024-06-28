package follow_programmercarl.day37;

/**
 * 416. 分割等和子集
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/partition-equal-subset-sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CanPartition {
    static class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (sum % 2 != 0) {
                return false;
            }
            int target = sum / 2;
            int[] dp = new int[target + 1];
            for (int i = 0; i <= target; i++) {
                dp[i] = nums[0] <= i ? nums[0] : 0;
            }
            for (int i = 1; i < nums.length; i++) {
                for (int j = target; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }
            return dp[target] == target;
        }
    }
}
