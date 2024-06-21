package follow_programmercarl.day30;

/**
 * 55. 跳跃游戏
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/jump-game/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CanJump {
    static class Solution {
        public boolean canJump(int[] nums) {
            int index = 0;
            int pIndex = 0;
            while (pIndex <= index && index < nums.length) {
                index = Math.max(index, pIndex + nums[pIndex]);
                pIndex++;
            }
            return index >= nums.length - 1;
        }
    }
}
