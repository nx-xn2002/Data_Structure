package follow_programmercarl.stack_and_queue;

import java.util.ArrayDeque;

/**
 * 239. 滑动窗口最大值
 *
 * @author nx
 */
public class _239_ {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                res[idx++] = nums[deque.peek()];
            }
        }
        return res;
    }
}
