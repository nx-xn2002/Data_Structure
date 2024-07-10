package follow_programmercarl.day49;

/**
 * 647. 回文子串
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/palindromic-substrings/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CountSubstrings {
    static class Solution {
        public int countSubstrings(String s) {
            int count = 0;
            int len = s.length();
            boolean[][] dp = new boolean[len][len];
            for (int i = len - 1; i >= 0; i--) {
                for (int j = i; j < len; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (j - i <= 1) {
                            dp[i][j] = true;
                            count++;
                        } else if (dp[i + 1][j - 1]) {
                            count++;
                            dp[i][j] = true;
                        }
                    }
                }
            }
            return count;
        }
    }
}
