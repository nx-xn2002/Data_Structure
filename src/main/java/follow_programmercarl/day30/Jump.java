package follow_programmercarl.day30;

/**
 * 45. 跳跃游戏 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/jump-game-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Jump {
    static class Solution {
        public int jump(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            int res = 0;
            int index = 0;
            int canJump = nums[0];
            while (index < nums.length - 1) {
                int temp = index;
                index = canJump;
                res++;
                for (int i = temp; i <= index && i < nums.length; i++) {
                    canJump = Math.max(canJump, i + nums[i]);
                }
            }
            return res;
        }
    }
}
