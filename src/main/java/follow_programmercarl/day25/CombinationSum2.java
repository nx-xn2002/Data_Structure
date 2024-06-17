package follow_programmercarl.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/combination-sum-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CombinationSum2 {
    static class Solution {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            used = new boolean[candidates.length];
            backtrace(candidates, target, 0);
            return res;
        }

        private void backtrace(int[] candidates, int target, int startIndex) {
            if (target == 0 && !temp.isEmpty()) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = startIndex; i < candidates.length; i++) {
                if (candidates[i] > target) {
                    return;
                }
                if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                temp.add(candidates[i]);
                backtrace(candidates, target - candidates[i], i + 1);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}
