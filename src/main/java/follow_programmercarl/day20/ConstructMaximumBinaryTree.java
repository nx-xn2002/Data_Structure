package follow_programmercarl.day20;

/**
 * 654. 最大二叉树
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/maximum-binary-tree/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ConstructMaximumBinaryTree {
    static class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums.length == 0) {
                return null;
            }
            return construct(nums, 0, nums.length - 1);
        }

        private TreeNode construct(int[] nums, int left, int right) {
            if (left == right) {
                return new TreeNode(nums[left]);
            } else if (left > right) {
                return null;
            }
            int maxIndex = left;
            for (int i = left; i <= right; i++) {
                if (nums[i] >= nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            return new TreeNode(
                    nums[maxIndex],
                    construct(nums, left, maxIndex - 1),
                    construct(nums, maxIndex + 1, right)
            );
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
