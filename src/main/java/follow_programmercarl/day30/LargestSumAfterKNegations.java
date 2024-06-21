package follow_programmercarl.day30;

import java.util.Arrays;

/**
 * 45. 跳跃游戏 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/jump-game-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LargestSumAfterKNegations {
    static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            Arrays.sort(nums);
            int res = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (k > 0 && nums[i] < 0) {
                    res -= nums[i];
                    k--;
                } else {
                    res += nums[i];
                }
                min = Math.min(min, Math.abs(nums[i]));
            }
            if (k % 2 != 0) {
                res -= 2 * min;
            }
            return res;
        }
    }
}
