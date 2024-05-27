package follow_programmercarl.day6;

/**
 * 242. 有效的字母异位词
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/valid-anagram/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsAnagram {
    static class Solution {
        /**
         * 哈希表
         */
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                int pos = t.charAt(i) - 'a';
                if (map[pos] <= 0) {
                    return false;
                }
                map[pos]--;
            }
            return true;
        }
    }
}
