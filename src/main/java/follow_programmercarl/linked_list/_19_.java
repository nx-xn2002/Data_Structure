package follow_programmercarl.linked_list;

/**
 * 19.删除链表的倒数第 N 个结点
 */
public class _19_ {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0, head);
        ListNode slow = head, fast = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        ListNode temp = newHead;
        while (fast != null) {
            fast = fast.next;
            temp = slow;
            slow = slow.next;
        }
        temp.next = slow.next;
        return newHead.next;
    }
}
