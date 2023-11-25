package follow_programmercarl.string;

/**
 * 344. 反转字符串
 */
public class _344_ {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
    }
}
