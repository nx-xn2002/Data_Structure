package follow_programmercarl.binary_tree.traversal.iteration;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 *
 * @author nx
 */
public class _94_ {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode pnode = root;
        Stack<TreeNode> stack = new Stack<>();
        while (pnode != null || !stack.isEmpty()) {
            if (pnode != null) {
                stack.push(pnode);
                pnode = pnode.left;
            } else {
                pnode = stack.pop();
                res.add(pnode.val);
                pnode = pnode.right;
            }
        }
        return res;
    }
}
