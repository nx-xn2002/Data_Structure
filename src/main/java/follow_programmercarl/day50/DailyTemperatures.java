package follow_programmercarl.day50;

import java.util.Stack;

/**
 * 739. 每日温度
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/daily-temperatures/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class DailyTemperatures {
    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int top = stack.pop();
                    result[top] = i - top;
                }
                stack.push(i);
            }
            return result;
        }
    }
}
