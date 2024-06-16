package follow_programmercarl.day24;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/combinations/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Combine {
    static class Solution {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            if (k <= n) {
                backtrace(1, n, k);
            }
            return res;
        }

        private void backtrace(int begin, int end, int k) {
            if (temp.size() == k) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = begin; i <= end; i++) {
                temp.add(i);
                backtrace(i + 1, end, k);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
