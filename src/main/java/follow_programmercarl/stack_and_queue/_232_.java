package follow_programmercarl.stack_and_queue;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 */
public class _232_ {
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    public _232_() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
    }

    public int pop() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }

    public int peek() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    public boolean empty() {
        if (stackB.isEmpty() && stackA.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
