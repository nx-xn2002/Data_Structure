package follow_programmercarl.day10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/implement-stack-using-queues/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MyStack {
    Queue<Integer> data;
    Queue<Integer> help;

    public MyStack() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    public void push(int x) {
        while (!data.isEmpty()) {
            help.add(data.poll());
        }
        data.add(x);
        while (!help.isEmpty()) {
            data.add(help.poll());
        }
    }

    public int pop() {
        return data.poll();
    }

    public int top() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
