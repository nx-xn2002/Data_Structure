package follow_programmercarl.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/combination-sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CombinationSum {


    static class Solution {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
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
                temp.add(candidates[i]);
                backtrace(candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
