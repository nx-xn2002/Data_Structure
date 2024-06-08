package follow_programmercarl.day18;


/**
 * 513. 找树左下角的值
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/find-bottom-left-tree-value/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindBottomLeftValue {
    static class Solution {
        int maxDepth = Integer.MIN_VALUE;
        int res;

        public int findBottomLeftValue(TreeNode root) {
            traversal(root, 0);
            return res;
        }

        private void traversal(TreeNode root, int depth) {
            if (root.left == null && root.right == null) {
                if (depth > maxDepth) {
                    maxDepth = depth;
                    res = root.val;
                }
                return;
            }
            if (root.left != null) {
                traversal(root.left, depth + 1);
            }
            if (root.right != null) {
                traversal(root.right, depth + 1);
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
