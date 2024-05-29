package follow_programmercarl.day8;

/**
 * 344. 反转字符串
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/reverse-string/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ReverseString {
    static class Solution {
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            while (left < right) {
                s[left] ^= s[right];
                s[right] ^= s[left];
                s[left] ^= s[right];
                left++;
                right--;
            }
        }
    }
}
