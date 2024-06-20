package follow_programmercarl.day29;

/**
 * 376. 摆动序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/wiggle-subsequence/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class WiggleMaxLength {
    static class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int curDiff;
            int preDiff = 0;
            int result = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                curDiff = nums[i + 1] - nums[i];
                if ((preDiff <= 0 && curDiff > 0) || (preDiff >= 0 && curDiff < 0)) {
                    result++;
                    preDiff = curDiff;
                }
            }
            return result;
        }
    }
}
