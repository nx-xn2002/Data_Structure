package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.*;

/**
 * 515. 在每个树行中找最大值
 *
 * @author nx
 */
public class _515_ {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        treeNodeQueue.add(null);
        List<Integer> res = new ArrayList<>();
        while (treeNodeQueue.peek() != null) {
            TreeNode temp = treeNodeQueue.poll();
            int max = temp.val;
            while (temp != null) {
                if (temp.left != null) {
                    treeNodeQueue.add(temp.left);
                }
                if (temp.right != null) {
                    treeNodeQueue.add(temp.right);
                }
                max = Math.max(max, temp.val);
                temp = treeNodeQueue.poll();
            }
            treeNodeQueue.add(null);
            res.add(max);
        }
        return res;
    }
}
