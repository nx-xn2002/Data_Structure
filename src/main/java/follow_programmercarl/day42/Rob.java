package follow_programmercarl.day42;

/**
 * 198. 打家劫舍
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/house-robber/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Rob {
    static class Solution {
        public int rob(int[] nums) {
            int len = nums.length;
            if (len == 0) {
                return 0;
            }
            if (len == 1) {
                return nums[0];
            }
            int[] dp = new int[len];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < len; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[len - 1];
        }
    }
}
