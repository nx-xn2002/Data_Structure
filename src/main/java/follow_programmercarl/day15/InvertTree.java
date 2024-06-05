package follow_programmercarl.day15;

/**
 * 226. 翻转二叉树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/invert-binary-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class InvertTree {
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
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            invertTree(root.right);
            invertTree(root.left);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }
    }
}
