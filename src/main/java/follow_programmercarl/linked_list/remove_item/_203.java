package follow_programmercarl.linked_list.remove_item;

import follow_programmercarl.linked_list.ListNode;

/**
 * 203. 移除链表元素
 *
 * @author nx
 */
public class _203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0, head);
        ListNode slow = node, fast = node.next;
        while (fast != null) {
            if (fast.val == val) {
                ListNode temp = fast.next;
                slow.next = temp;
                fast = temp;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        return node.next;
    }
}
