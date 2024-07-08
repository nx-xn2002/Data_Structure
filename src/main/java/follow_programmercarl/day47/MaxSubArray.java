package follow_programmercarl.day47;

/**
 * 53. 最大子数组和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/maximum-subarray/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxSubArray {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            int res = nums[0];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (dp[i - 1] > 0) {
                    dp[i] = dp[i - 1] + nums[i];
                } else {
                    dp[i] = nums[i];
                }
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }
}
