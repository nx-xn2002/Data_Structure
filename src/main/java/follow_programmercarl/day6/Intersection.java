package follow_programmercarl.day6;

import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/intersection-of-two-arrays/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Intersection {
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> n1 = new HashSet<>();
            HashSet<Integer> resSet = new HashSet<>();
            for (int i : nums1) {
                n1.add(i);
            }
            for (int i : nums2) {
                if (n1.contains(i)) {
                    resSet.add(i);
                }
            }
            int[] res = new int[resSet.size()];
            int index = 0;
            for (Integer i : resSet) {
                res[index++] = i;
            }
            return res;
        }
    }
}
