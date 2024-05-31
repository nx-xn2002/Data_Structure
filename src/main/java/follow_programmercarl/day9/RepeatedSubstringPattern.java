package follow_programmercarl.day9;

/**
 * 459. 重复的子字符串
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/repeated-substring-pattern/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RepeatedSubstringPattern {
    static class Solution {
        public boolean repeatedSubstringPattern(String s) {
            String str = s + s;
            str = str.substring(1, str.length() - 1);
            return str.contains(s);
        }
    }
}
