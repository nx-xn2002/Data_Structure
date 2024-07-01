package follow_programmercarl.day40;

/**
 * 377. 组合总和 Ⅳ
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/combination-sum-iv/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CombinationSum4 {
    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int i = 0; i <= target; i++) {
                for (int num : nums) {
                    if (i >= num) {
                        dp[i] += dp[i - num];
                    }
                }
            }
            return dp[target];
        }
    }
}
