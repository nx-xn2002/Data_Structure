package follow_programmercarl.day28;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/permutations/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Permute {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used;

        public List<List<Integer>> permute(int[] nums) {
            used = new boolean[nums.length];
            backtrace(nums);
            return res;
        }

        private void backtrace(int[] nums) {
            if (temp.size() == nums.length) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                temp.add(nums[i]);
                backtrace(nums);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}
