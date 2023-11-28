package follow_programmercarl.stack_and_queue;

import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 *
 * @author nx
 */
public class _1047_ {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int len = -1;
        for (int i = 0; i < s.length(); i++) {
            if (len >= 0 && sb.charAt(len) == s.charAt(i)) {
                sb.deleteCharAt(len--);
            } else {
                sb.append(s.charAt(i));
                len++;
            }
        }
        return sb.toString();
    }
}
