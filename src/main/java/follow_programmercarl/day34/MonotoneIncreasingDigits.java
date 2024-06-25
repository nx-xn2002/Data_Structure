package follow_programmercarl.day34;

import java.util.Arrays;

/**
 * 738. 单调递增的数字
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/monotone-increasing-digits/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class MonotoneIncreasingDigits {
    static class Solution {
        public int monotoneIncreasingDigits(int n) {
            char[] num = String.valueOf(n).toCharArray();
            int flag = num.length;
            for (int i = num.length - 1; i > 0; i--) {
                if (num[i] < num[i - 1]) {
                    flag = i;
                    num[i - 1]--;
                }
            }
            for (int i = flag; i < num.length; i++) {
                num[i] = '9';
            }
            return Integer.parseInt(String.valueOf(num));
        }
    }
}
