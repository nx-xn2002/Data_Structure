package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 199. 二叉树的右视图
 *
 * @author nx
 */
public class _199_ {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty() && queue.peek() != null) {
            TreeNode temp = queue.poll();
            while (temp != null) {
                if (queue.peek() == null) {
                    res.add(temp.val);
                }
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
