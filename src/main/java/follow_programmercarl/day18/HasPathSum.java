package follow_programmercarl.day18;

/**
 * 112. 路径总和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/path-sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class HasPathSum {
    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return targetSum - root.val == 0;
            }
            boolean left = false, right = false;
            if (root.left != null) {
                left = hasPathSum(root.left, targetSum - root.val);
            }
            if (root.right != null) {
                right = hasPathSum(root.right, targetSum - root.val);
            }
            return left || right;
        }
    }

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
}
