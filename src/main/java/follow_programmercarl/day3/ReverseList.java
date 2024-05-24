package follow_programmercarl.day3;

/**
 * 206. 反转链表
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/reverse-linked-list/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ReverseList {
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
        public ListNode reverseList(ListNode head) {
            ListNode newHead = new ListNode(0, null);
            while (head != null) {
                ListNode temp = head.next;
                head.next = newHead.next;
                newHead.next = head;
                head = temp;
            }
            return newHead.next;
        }
    }
}
