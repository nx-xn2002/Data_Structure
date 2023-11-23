package follow_programmercarl.linked_list;

/**
 * 面试题 02.07. 链表相交
 */
public class _0207_ {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0, n = 0;
        ListNode curA = headA, curB = headB;
        while (curA != null) {
            m++;
            curA = curA.next;
        }
        while (curB != null) {
            n++;
            curB = curB.next;
        }
        int dif = Math.max(m, n) - Math.min(m, n);
        if (m < n) {
            curA = headB;
            curB = headA;
        } else {
            curA = headA;
            curB = headB;
        }
        while (dif-- > 0) {
            curA = curA.next;
        }
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
