package follow_programmercarl.binary_tree.traversal.recursion;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @author nx
 */
public class _145_ {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(root, res);
        return res;
    }

    private void postorderTraversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, res);
        postorderTraversal(root.right, res);
        res.add(root.val);
    }
}
