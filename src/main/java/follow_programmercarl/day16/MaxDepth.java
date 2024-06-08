package follow_programmercarl.day16;

/**
 * 104. 二叉树的最大深度
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MaxDepth {
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
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
//            int left = maxDepth(root.left);
//            int right = maxDepth(root.right);
//            return Math.max(left, right) + 1;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
