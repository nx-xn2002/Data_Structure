package follow_programmercarl.day3;

/**
 * 203. 移除链表元素
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/remove-linked-list-elements/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RemoveElements {

    static class Solution {
        /**
         * 移除节点
         * 时间复杂度:O(N),空间复杂度:O(1)
         */
        public ListNode removeElements(ListNode head, int val) {
            // newHead.next指向链表的有效部分
            ListNode newHead = new ListNode(0, head);
            ListNode slow = newHead, fast = head;
            while (fast != null) {
                if (fast.val == val) {
                    slow.next = fast.next;
                    fast = fast.next;
                    continue;
                }
                fast = fast.next;
                slow = slow.next;
            }
            return newHead.next;
        }
    }

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
}
