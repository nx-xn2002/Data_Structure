package follow_programmercarl.day15;

/**
 * 101. 对称二叉树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/symmetric-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsSymmetric {
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
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return compare(root.left, root.right);
        }

        private boolean compare(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            } else if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return compare(left.left, right.right) && compare(left.right, right.left);
        }
    }
}
