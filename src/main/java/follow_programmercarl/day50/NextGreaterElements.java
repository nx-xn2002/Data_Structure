package follow_programmercarl.day50;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. 下一个更大元素 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/next-greater-element-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class NextGreaterElements {
    static class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int len = nums.length;
            int[] ans = new int[len];
            Stack<Integer> stack = new Stack<>();
            Arrays.fill(ans, -1);
            for (int i = 0; i < len * 2; i++) {
                while (!stack.isEmpty() && nums[stack.peek()] < nums[i % len]) {
                    int top = stack.pop();
                    ans[top] = nums[i % len];
                }
                stack.push(i % len);
            }
            return ans;
        }
    }
}
