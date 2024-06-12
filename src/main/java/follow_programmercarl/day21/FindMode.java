package follow_programmercarl.day21;

import java.util.ArrayList;
import java.util.List;

/**
 * 530. 二叉搜索树的最小绝对差
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/minimum-absolute-difference-in-bst/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindMode {
    static class Solution {
        private int maxCount = 0;
        private List<Integer> res = new ArrayList<>();
        private int lastVal = 0;
        private int count = 0;

        public int[] findMode(TreeNode root) {
            traversal(root);
            int[] arr = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                arr[i] = res.get(i);
            }
            return arr;
        }

        private void traversal(TreeNode root) {
            if (root == null) {
                return;
            }
            traversal(root.left);
            if (root.val == lastVal) {
                count++;
            } else {
                count = 1;
            }
            lastVal = root.val;
            if (count >= maxCount) {
                if (count > maxCount) {
                    res = new ArrayList<>();
                    maxCount = count;
                }
                res.add(root.val);
            }
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
