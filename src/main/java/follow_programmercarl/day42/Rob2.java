package follow_programmercarl.day42;

/**
 * 213. 打家劫舍 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/house-robber-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Rob2 {
    static class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int len = nums.length;
            if (len == 1) {
                return nums[0];
            }
            return Math.max(robAction(nums, 0, len - 1), robAction(nums, 1, len));
        }

        int robAction(int[] nums, int start, int end) {
            int x = 0, y = 0, z = 0;
            for (int i = start; i < end; i++) {
                y = z;
                z = Math.max(y, x + nums[i]);
                x = y;
            }
            return z;
        }
    }
}
