package follow_programmercarl.binary_tree;

/**
 * 101. 对称二叉树
 *
 * @author nx
 */
public class _101_ {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        return compare(left.left, right.right) && compare(left.right, right.left) && (left.val == right.val);
    }
}
