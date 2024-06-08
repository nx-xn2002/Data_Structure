package follow_programmercarl.day17;

/**
 * 404. 左叶子之和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/sum-of-left-leaves/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SumOfLeftLeaves {
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
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 0;
            }
            int leftValue = sumOfLeftLeaves(root.left);
            if (root.left != null && root.left.left == null && root.left.right == null) {
                leftValue = root.left.val;
            }
            int rightValue = sumOfLeftLeaves(root.right);

            return leftValue + rightValue;
        }
    }
}
