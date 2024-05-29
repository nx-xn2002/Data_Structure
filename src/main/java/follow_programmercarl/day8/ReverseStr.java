package follow_programmercarl.day8;

/**
 * 541. 反转字符串 II
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/reverse-string-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ReverseStr {
    static class Solution {
        public String reverseStr(String s, int k) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i += 2 * k) {
                int start = i;
                int end = Math.min(ch.length - 1, start + k - 1);
                while (start < end) {
                    ch[start] ^= ch[end];
                    ch[end] ^= ch[start];
                    ch[start] ^= ch[end];
                    start++;
                    end--;
                }
            }
            return new String(ch);
        }
    }
}
