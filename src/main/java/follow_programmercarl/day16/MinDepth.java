package follow_programmercarl.day16;

/**
 * 111. 二叉树的最小深度
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/minimum-depth-of-binary-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MinDepth {
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
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            int res = Integer.MAX_VALUE;
            if (root.left != null) {
                res = Math.min(minDepth(root.left), res);
            }
            if (root.right != null) {
                res = Math.min(minDepth(root.right), res);
            }
            return res + 1;
        }
    }
}
