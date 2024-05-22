package follow_programmercarl.day1;

/**
 * 移除元素
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/remove-element/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RemoveElement {
    static class Solution {
        /**
         * 暴力解法
         * 时间复杂度:O(N^2),空间复杂度:O(1)
         *
         * @author Ni Xiang
         */
        public int removeElement1(int[] nums, int val) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] == val) {
                    for (int j = i + 1; j < len; j++) {
                        nums[j - 1] = nums[j];
                    }
                    i--;
                    len--;
                }
            }
            return len;
        }

        /**
         * 双指针（快慢指针）
         * 时间复杂度:O(N),空间复杂度:O(1)
         *
         * @author Ni Xiang
         */
        public int removeElement2(int[] nums, int val) {
            int slow = 0, fast = 0;
            while (fast < nums.length) {
                if (nums[fast] != val) {
                    nums[slow++] = nums[fast];
                }
                fast++;
            }
            return slow;
        }
    }
}
