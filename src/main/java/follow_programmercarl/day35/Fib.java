package follow_programmercarl.day35;

/**
 * 509. 斐波那契数
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/fibonacci-number/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Fib {
    static class Solution {
        public int fib(int n) {
            if (n <= 1) {
                return n;
            }
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
