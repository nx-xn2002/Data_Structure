package follow_programmercarl.day2;

import java.util.Arrays;

/**
 * 二分查找
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/squares-of-a-sorted-array/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SortedSquares {
    static class Solution {
        /**
         * 暴力解法
         * 时间复杂度:O(NlogN),空间复杂度:O(1)
         */
        public int[] sortedSquares1(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }

        /**
         * 双指针
         * 时间复杂度:O(N),空间复杂度:O(N)
         */
        public int[] sortedSquares2(int[] nums) {
            int left = 0, right = nums.length - 1;
            int[] res = new int[nums.length];
            int index = nums.length - 1;
            while (left <= right) {
                int a = nums[left] * nums[left];
                int b = nums[right] * nums[right];
                if (a >= b) {
                    res[index--] = a;
                    left++;
                } else {
                    res[index--] = b;
                    right--;
                }
            }
            return res;
        }
    }
}
