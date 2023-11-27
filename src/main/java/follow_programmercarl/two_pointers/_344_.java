package follow_programmercarl.two_pointers;

/**
 * 344. 反转字符串
 */
public class _344_ {
    public void reverseString(char[] s) {
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
