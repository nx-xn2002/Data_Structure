package follow_programmercarl.stack_and_queue;

import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class _20_ {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (p == '(' || p == '{' || p == '[') {
                stack.push(p);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char t = stack.pop();
                if (t == '(' && p == ')') {
                    continue;
                }
                if (t == '{' && p == '}') {
                    continue;
                }
                if (t == '[' && p == ']') {
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
}
