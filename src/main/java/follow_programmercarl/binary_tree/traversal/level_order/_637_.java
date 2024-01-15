package follow_programmercarl.binary_tree.traversal.level_order;

import follow_programmercarl.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637. 二叉树的层平均值
 *
 * @author nx
 */
public class _637_ {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.peek() != null) {
            Double level = Double.valueOf(0);
            int count = 0;
            TreeNode temp = queue.poll();
            while (temp != null) {
                level += temp.val;
                count++;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                temp = queue.poll();
            }
            queue.add(null);
            res.add(level / count);
        }
        return res;
    }
}
