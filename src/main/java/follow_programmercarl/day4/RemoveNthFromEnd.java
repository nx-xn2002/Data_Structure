package follow_programmercarl.day4;

/**
 * 19. 删除链表的倒数第 N 个结点
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RemoveNthFromEnd {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        /**
         * 快慢指针
         */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode newHead = new ListNode(0, head);
            ListNode slow = newHead, fast = head;
            while (n > 0) {
                fast = fast.next;
                n--;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return newHead.next;
        }
    }
}
