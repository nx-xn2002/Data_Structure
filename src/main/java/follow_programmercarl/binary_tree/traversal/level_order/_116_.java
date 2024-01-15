package follow_programmercarl.binary_tree.traversal.level_order;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 *
 * @author nx
 */
public class _116_ {
    public Node connect(Node root) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        while (nodeQueue.peek() != null) {
            Node temp = nodeQueue.poll();
            while (temp != null) {
                temp.next = nodeQueue.peek();
                if (temp.left != null) {
                    nodeQueue.add(temp.left);
                }
                if (temp.right != null) {
                    nodeQueue.add(temp.right);
                }
                temp = nodeQueue.poll();
            }
            nodeQueue.add(null);
        }
        return root;
    }
}
