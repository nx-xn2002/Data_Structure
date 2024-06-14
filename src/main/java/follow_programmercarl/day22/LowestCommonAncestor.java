package follow_programmercarl.day22;

/**
 * 235. 二叉搜索树的最近公共祖先
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LowestCommonAncestor {
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            int min = Math.min(p.val, q.val);
            int max = Math.max(p.val, q.val);
            if (root.val <= max && root.val >= min) {
                return root;
            }
            if (root.val > max) {
                return lowestCommonAncestor(root.left, p, q);
            } else {
                return lowestCommonAncestor(root.right, p, q);
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
