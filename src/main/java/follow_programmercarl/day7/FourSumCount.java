package follow_programmercarl.day7;

import java.util.HashMap;

/**
 * 454. 四数相加 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/4sum-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FourSumCount {
    static class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int n1 : nums1) {
                for (int n2 : nums2) {
                    map.put(n1 + n2, map.getOrDefault(n1 + n2, 0) + 1);
                }
            }
            for (int n3 : nums3) {
                for (int n4 : nums4) {
                    count += map.getOrDefault(-n3 - n4, 0);
                }
            }
            return count;
        }
    }
}
