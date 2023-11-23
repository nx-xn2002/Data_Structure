package follow_programmercarl.linked_list;

/**
 * 142. 环形链表 II
 */
public class _142_ {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //判断是否有环
            if (fast == slow) {
                //环内相交点
                ListNode pnode = head;
                while (pnode != fast) {
                    pnode = pnode.next;
                    fast = fast.next;
                }
                return pnode;
            }
        }
        return null;
    }
}
