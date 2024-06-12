package follow_programmercarl.day21;

import java.util.ArrayList;

/**
 * 530. 二叉搜索树的最小绝对差
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/minimum-absolute-difference-in-bst/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class GetMinimumDifference {
    static class Solution {
        ArrayList<Integer> tree = new ArrayList<>();

        public int getMinimumDifference(TreeNode root) {
            traversal(root);
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < tree.size(); i++) {
                min = Math.min(tree.get(i) - tree.get(i - 1), min);
            }
            return min;
        }

        private void traversal(TreeNode root) {
            if (root == null) {
                return;
            }
            traversal(root.left);
            tree.add(root.val);
            traversal(root.right);
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
