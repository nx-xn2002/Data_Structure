package follow_programmercarl.day8;

import java.util.Stack;

/**
 * 151. 反转字符串中的单词
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/reverse-words-in-a-string/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ReverseWords {
    static class Solution {
        public String reverseWords(String s) {
            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && sb.length() > 0) {
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                } else if (s.charAt(i) != ' ') {
                    sb.append(s.charAt(i));
                }
            }
            if (sb.length() > 0) {
                stack.push(sb.toString());
                sb = new StringBuilder();
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
}
