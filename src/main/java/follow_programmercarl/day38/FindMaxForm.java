package follow_programmercarl.day38;

/**
 * 474. 一和零
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/ones-and-zeroes/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindMaxForm {
    static class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][] dp = new int[m + 1][n + 1];
            int oneNum, zeroNum;
            for (String str : strs) {
                oneNum = 0;
                zeroNum = 0;
                for (char ch : str.toCharArray()) {
                    if (ch == '0') {
                        zeroNum++;
                    } else {
                        oneNum++;
                    }
                }
                for (int i = m; i >= zeroNum; i--) {
                    for (int j = n; j >= oneNum; j--) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                    }
                }
            }
            return dp[m][n];
        }
    }
}
