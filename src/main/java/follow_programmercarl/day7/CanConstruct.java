package follow_programmercarl.day7;

/**
 * 383. 赎金信
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/ransom-note/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CanConstruct {
    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (magazine.length() < ransomNote.length()) {
                return false;
            }
            int[] map = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                map[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                int pos = ransomNote.charAt(i) - 'a';
                if (map[pos]-- <= 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
