package follow_programmercarl.day20;

/**
 * 98. 验证二叉搜索树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/validate-binary-search-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsValidBST {
    static class Solution {
        TreeNode max;
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            boolean left = isValidBST(root.left);
            if (!left) {
                return false;
            }
            if (max != null && root.val <= max.val) {
                return false;
            }
            max = root;
            return isValidBST(root.right);
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
