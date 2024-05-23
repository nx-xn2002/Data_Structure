package follow_programmercarl.day2;

/**
 * 滑动窗口
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/minimum-size-subarray-sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SlidingWindow {
    static class Solution {
        /**
         * 暴力法
         * 时间复杂度:O(N^2),空间复杂度:O(1)
         * <p>
         * 结果超时
         */
        public int minSubArrayLen1(int target, int[] nums) {
            int minLen = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum += nums[j];
                    if (sum >= target) {
                        minLen = Math.min(j - i + 1, minLen);
                        break;
                    }
                }
            }
            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }

        /**
         * 滑动窗口
         * 时间复杂度:O(N),空间复杂度:O(1)
         */
        public int minSubArrayLen2(int target, int[] nums) {
            int min = Integer.MAX_VALUE;
            int begin = 0, end = 0, sum = 0;
            while (end < nums.length) {
                sum += nums[end];
                end++;
                while (sum >= target) {
                    min = Math.min(min, end - begin);
                    sum -= nums[begin];
                    begin++;
                }
            }
            if (min == Integer.MAX_VALUE) {
                return 0;
            }
            return min;
        }
    }
}
