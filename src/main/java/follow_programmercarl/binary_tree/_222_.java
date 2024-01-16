package follow_programmercarl.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 222. 完全二叉树的节点个数
 *
 * @author nx
 */
public class _222_ {
    public int countNodes(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.peek() != null) {
            TreeNode temp = queue.poll();
            while (temp != null) {
                res++;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                temp = queue.poll();
            }
            queue.add(null);
        }
        return res;
    }
}
