package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 *
 * @author nx
 */
public class _102_ {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty() && queue.peek() != null) {
            TreeNode temp = queue.poll();
            List<Integer> level = new ArrayList<>();
            while (temp != null) {
                level.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                temp = queue.poll();
            }
            res.add(level);
            queue.add(null);
        }
        return res;
    }
}
