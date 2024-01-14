package follow_programmercarl.binary_tree.traversal.recursion;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 *
 * @author nx
 */
public class _144_ {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }
}
