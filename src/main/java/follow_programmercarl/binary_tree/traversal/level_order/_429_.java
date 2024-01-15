package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N 叉树的层序遍历
 *
 * @author nx
 */
public class _429_ {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        while (nodeQueue.peek() != null) {
            List<Integer> level = new ArrayList<>();
            Node temp = nodeQueue.poll();
            while (temp != null) {
                level.add(temp.val);
                for (Node child : temp.children) {
                    if (child != null) {
                        nodeQueue.add(child);
                    }
                }
                temp = nodeQueue.poll();
            }
            res.add(level);
            nodeQueue.add(null);
        }
        return res;
    }
}
