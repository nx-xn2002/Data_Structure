package follow_programmercarl.day28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 491. 非递减子序列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/non-decreasing-subsequences/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindSubsequences {
    static class Solution {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            backtrack(nums, 0);
            return res;
        }

        private void backtrack(int[] nums, int startIndex) {
            if (path.size() >= 2) {
                res.add(new ArrayList<>(path));
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = startIndex; i < nums.length; i++) {
                if (!path.isEmpty() && path.get(path.size() - 1) > nums[i]) {
                    continue;
                }
                if (set.contains(nums[i])) {
                    continue;
                }
                path.add(nums[i]);
                set.add(nums[i]);
                backtrack(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
}
