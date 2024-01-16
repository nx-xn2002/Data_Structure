package follow_programmercarl.binary_tree;

/**
 * 226. 翻转二叉树
 *
 * @author nx
 */
public class _226_ {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.right);
        invertTree(root.left);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
