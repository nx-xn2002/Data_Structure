package follow_programmercarl.day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/subsets-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class SubsetsWithDup {
    static class Solution {
        boolean[] used;
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            used = new boolean[nums.length];
            backtrack(nums, 0);
            return res;
        }

        private void backtrack(int[] nums, int startIndex) {
            res.add(new ArrayList<>(path));
            for (int i = startIndex; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                path.add(nums[i]);
                backtrack(nums, i + 1);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
