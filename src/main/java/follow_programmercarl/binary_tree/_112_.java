package follow_programmercarl;

import follow_programmercarl.binary_tree.TreeNode;

/**
 * 112. 路径总和
 *
 * @author nx
 */
public class _112_ {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (targetSum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
