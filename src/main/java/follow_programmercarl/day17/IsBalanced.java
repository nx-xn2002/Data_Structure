package follow_programmercarl.day17;

/**
 * 110. 平衡二叉树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/balanced-binary-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsBalanced {
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
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }

        private int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = getHeight(root.left);
            if (left == -1) {
                return -1;
            }
            int right = getHeight(root.right);
            if (right == -1) {
                return -1;
            }
            return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(right, left);
        }
    }
}
