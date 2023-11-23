package follow_programmercarl.linked_list;

/**
 * 24. 两两交换链表中的节点
 */
public class _24_ {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(0, head);
        ListNode node1 = newHead, node2 = head, node3 = head.next;
        while (node3 != null) {
            ListNode temp = node3.next;
            node2.next = temp;
            node3.next = node2;
            node1.next = node3;
            node1 = node2;
            node2 = node1.next;
            if (node2 == null) {
                break;
            }
            node3 = node2.next;
        }
        return newHead.next;
    }
}
