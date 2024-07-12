package follow_programmercarl.day50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * 496. 下一个更大元素 I
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/next-greater-element-i/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class NextGreaterElement {
    static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans = new int[nums1.length];
            Arrays.fill(ans, -1);
            HashMap<Integer, Integer> map = new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < nums1.length; i++) {
                map.put(nums1[i], i);
            }
            for (int i = 0; i < nums2.length; i++) {
                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                    if (map.containsKey(nums2[stack.peek()])) {
                        ans[map.get(nums2[stack.peek()])] = nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
            return ans;
        }
    }
}
