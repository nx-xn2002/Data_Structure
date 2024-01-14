package follow_programmercarl.binary_tree.traversal.iteration;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 *
 * @author nx
 */
public class _145_ {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
