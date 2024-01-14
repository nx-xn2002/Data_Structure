package follow_programmercarl.binary_tree.traversal.iteration;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 *
 * @author nx
 */
public class _144_ {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return res;
    }
}
