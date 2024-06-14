package follow_programmercarl.day23;

/**
 * 538. 把二叉搜索树转换为累加树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/convert-bst-to-greater-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ConvertBST {
    static class Solution {
        int pre = 0;

        public TreeNode convertBST(TreeNode root) {
            traversal(root);
            return root;
        }

        private void traversal(TreeNode root) {
            if (root == null) {
                return;
            }
            traversal(root.right);
            root.val += pre;
            pre = root.val;
            traversal(root.left);
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
