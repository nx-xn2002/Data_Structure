package follow_programmercarl.day25;

import java.util.ArrayList;
import java.util.List;

/**
 * 131. 分割回文串
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/palindrome-partitioning/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Partition {
    static class Solution {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();

        public List<List<String>> partition(String s) {
            backtrack(s);
            return res;
        }

        private void backtrack(String s) {
            if ("".equals(s)) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 1; i <= s.length(); i++) {
                String temp = s.substring(0, i);
                if (judge(temp)) {
                    path.add(temp);
                    backtrack(s.substring(i));
                    path.remove(path.size() - 1);
                }
            }
        }

        private boolean judge(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
