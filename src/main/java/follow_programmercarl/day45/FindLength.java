package follow_programmercarl.day45;

/**
 * 718. 最长重复子数组
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/maximum-length-of-repeated-subarray/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindLength {
    static class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int result = 0;
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            for (int i = 1; i < nums1.length + 1; i++) {
                for (int j = 1; j < nums2.length + 1; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        result = Math.max(result, dp[i][j]);
                    }
                }
            }
            return result;
        }
    }
}
