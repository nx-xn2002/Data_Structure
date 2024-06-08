package follow_programmercarl.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/binary-tree-paths/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class BinaryTreePaths {
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
        List<String> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) {
                return res;
            }
            traversal(root);
            return res;
        }

        private void traversal(TreeNode root) {
            temp.add(root.val);
            if (root.left == null && root.right == null) {
                res.add(handel(temp));
            }
            if (root.left != null) {
                traversal(root.left);
                temp.remove(temp.size() - 1);
            }
            if (root.right != null) {
                traversal(root.right);
                temp.remove(temp.size() - 1);
            }
        }

        private String handel(List<Integer> a) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < a.size() - 1; i++) {
                str.append(a.get(i));
                str.append("->");
            }
            str.append(a.get(a.size() - 1));
            return str.toString();
        }
    }
}
