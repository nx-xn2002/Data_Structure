package follow_programmercarl.day45;

/**
 * 674. 最长连续递增序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/longest-continuous-increasing-subsequence/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindLengthOfLCIS {
    static class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int res = 1;
            int[] dp = new int[nums.length];
            dp[0] = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                    res = Math.max(dp[i], res);
                } else {
                    dp[i] = 1;
                }
            }
            return res;
        }
    }
}
