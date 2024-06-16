package follow_programmercarl.day24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LetterCombinations {
    static class Solution {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        HashMap<Character, String> map = new HashMap<>();

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.isEmpty()) {
                return res;
            }
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
            backtrace(0, digits);
            return res;
        }

        private void backtrace(int index, String digits) {
            if (index >= digits.length()) {
                res.add(temp.toString());
                return;
            }
            String s = map.get(digits.charAt(index));
            for (int i = 0; i < s.length(); i++) {
                temp.append(s.charAt(i));
                backtrace(index + 1, digits);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}
