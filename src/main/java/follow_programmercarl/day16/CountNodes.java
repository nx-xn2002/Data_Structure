package follow_programmercarl.day16;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 222. 完全二叉树的节点个数
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/count-complete-tree-nodes/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CountNodes {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public int countNodes(TreeNode root) {
            int res = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (queue.peek() != null) {
                TreeNode temp = queue.poll();
                while (temp != null) {
                    res++;
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                    temp = queue.poll();
                }
                queue.add(null);
            }
            return res;
        }
    }
}
