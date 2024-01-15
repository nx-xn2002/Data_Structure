package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.*;

/**
 * 107. 二叉树的层序遍历 II
 *
 * @author nx
 */
public class _107_ {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(res);
        return res;
    }
}
