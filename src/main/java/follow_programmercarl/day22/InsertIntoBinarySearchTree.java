package follow_programmercarl.day22;

/**
 * 701. 二叉搜索树中的插入操作
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/insert-into-a-binary-search-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class InsertIntoBinarySearchTree {
    static class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            insert(root, val);
            return root;
        }

        private void insert(TreeNode root, int val) {
            if (root == null) {
                return;
            }
            if (root.val >= val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                    return;
                }
                insert(root.left, val);
            }
            if (root.val <= val) {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                    return;
                }
                insert(root.right, val);
            }
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
