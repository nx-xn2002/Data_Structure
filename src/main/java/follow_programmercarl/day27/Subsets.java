package follow_programmercarl.day27;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/subsets/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Subsets {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            backtrack(nums, 0);
            return res;
        }

        private void backtrack(int[] nums, int startIndex) {
            res.add(new ArrayList<>(path));
            if (startIndex >= nums.length) {
                return;
            }
            for (int i = startIndex; i < nums.length; i++) {
                path.add(nums[i]);
                backtrack(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
}
