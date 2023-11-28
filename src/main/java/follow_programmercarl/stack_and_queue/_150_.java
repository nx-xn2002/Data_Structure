package follow_programmercarl.stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 *
 * @author nx
 */
public class _150_ {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
