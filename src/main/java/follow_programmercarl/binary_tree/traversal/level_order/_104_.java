package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 *
 * @author nx
 */
public class _104_ {
    public int maxDepth(TreeNode root) {
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
                temp = treeNodeQueue.poll();
            }
            treeNodeQueue.add(null);
        }
        return res;
    }
}
