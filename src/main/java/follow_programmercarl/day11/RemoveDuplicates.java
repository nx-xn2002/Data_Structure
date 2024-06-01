package follow_programmercarl.day11;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RemoveDuplicates {
    static class Solution {
        public String removeDuplicates(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (sb.isEmpty()) {
                    sb.append(c);
                    continue;
                }
                if (sb.charAt(sb.length() - 1) != c) {
                    sb.append(c);
                    continue;
                }
                while (!sb.isEmpty() && sb.charAt(sb.length() - 1) == c) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return sb.toString();
        }
    }
}
