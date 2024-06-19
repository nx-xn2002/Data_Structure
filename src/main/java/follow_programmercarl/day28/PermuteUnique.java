package follow_programmercarl.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. 全排列 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/permutations-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class PermuteUnique {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used;

        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            used = new boolean[nums.length];
            backtrack(nums);
            return res;
        }

        private void backtrack(int[] nums) {
            if (path.size() == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] || used[i]) {
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                backtrack(nums);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
