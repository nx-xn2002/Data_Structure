package follow_programmercarl.binary_tree.traversal.recursion;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author nx
 */
public class _94_ {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        return res;
    }

    private void inorderTraversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, res);
        res.add(root.val);
        inorderTraversal(root.right, res);
    }
}
