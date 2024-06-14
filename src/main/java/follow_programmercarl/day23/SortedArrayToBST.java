package follow_programmercarl.day23;

/**
 * 108. 将有序数组转换为二叉搜索树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SortedArrayToBST {
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return traversal(nums, 0, nums.length - 1);
        }

        private TreeNode traversal(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = traversal(nums, left, mid - 1);
            node.right = traversal(nums, mid + 1, right);
            return node;
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
