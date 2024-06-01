package follow_programmercarl.day11;

import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/evaluate-reverse-polish-notation/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class EvalRPN {
    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> nums = new Stack<>();
            for (String token : tokens) {
                if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                    int num2 = nums.pop();
                    int num1 = nums.pop();
                    nums.push(calculate(num1, num2, token));
                } else {
                    nums.push(Integer.parseInt(token));
                }
            }
            return nums.pop();
        }

        private static int calculate(int num1, int num2, String operation) {
            if (operation.equals("+")) {
                return num1 + num2;
            } else if (operation.equals("-")) {
                return num1 - num2;
            } else if (operation.equals("*")) {
                return num1 * num2;
            } else if (operation.equals("/")) {
                return num1 / num2;
            }
            return 0;
        }
    }
}
