package follow_programmercarl.day24;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. 组合总和 III
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/combination-sum-iii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CombinationSum3 {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            backtrace(k, n, 1);
            return res;
        }

        private void backtrace(int k, int target, int start) {
            if (temp.size() == k && target == 0) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = start; i <= 9; i++) {
                temp.add(i);
                backtrace(k, target - i, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
