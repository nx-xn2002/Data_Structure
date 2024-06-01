package follow_programmercarl.day11;

import java.util.Stack;

/**
 * 20. 有效的括号
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/valid-parentheses/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsValid {
    static class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char pop = stack.pop();
                    if (pop == '(' && c == ')') {
                        continue;
                    } else if (pop == '[' && c == ']') {
                        continue;
                    } else if (pop == '{' && c == '}') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
