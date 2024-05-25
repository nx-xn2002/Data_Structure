package follow_programmercarl.day4;

/**
 * 面试题 02.07. 链表相交
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class GetIntersectionNode {
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
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode a = headA, b = headB;
            int count = 0;
            while (a != b) {
                if (count > 2) {
                    return null;
                }
                if (a.next == null) {
                    a = headB;
                    count++;
                } else {
                    a = a.next;
                }
                if (b.next == null) {
                    b = headA;
                    count++;
                } else {
                    b = b.next;
                }
            }
            return a;
        }
    }
}
