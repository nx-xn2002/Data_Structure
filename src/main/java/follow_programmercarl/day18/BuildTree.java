package follow_programmercarl.day18;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class BuildTree {

    static class Solution {
        int post_idx;
        int[] postorder;
        int[] inorder;
        Map<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

        public TreeNode helper(int in_left, int in_right) {
            if (in_left > in_right) {
                return null;
            }
            int root_val = postorder[post_idx];
            TreeNode root = new TreeNode(root_val);
            int index = idx_map.get(root_val);
            post_idx--;
            root.right = helper(index + 1, in_right);
            root.left = helper(in_left, index - 1);
            return root;
        }

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            this.postorder = postorder;
            this.inorder = inorder;
            post_idx = postorder.length - 1;
            int idx = 0;
            for (Integer val : inorder) {
                idx_map.put(val, idx++);
            }
            return helper(0, inorder.length - 1);
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
