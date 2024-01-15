package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 111. 二叉树的最小深度
 *
 * @author nx
 */
public class _111_ {
    public int minDepth(TreeNode root) {
        int res = 0;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        treeNodeQueue.add(null);
        while (treeNodeQueue.peek() != null) {
            res++;
            TreeNode temp = treeNodeQueue.poll();
            while (temp != null) {
                if (temp.left != null) {
                    treeNodeQueue.add(temp.left);
                }
                if (temp.right != null) {
                    treeNodeQueue.add(temp.right);
                }
                if (temp.right == null && temp.left == null) {
                    return res;
                }
                temp = treeNodeQueue.poll();
            }
            treeNodeQueue.add(null);
        }
        return res;
    }
}
