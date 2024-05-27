package follow_programmercarl.day6;

import java.util.HashSet;

/**
 * 202. 快乐数
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/happy-number/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class IsHappy {
    static class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();
            while (n != 1) {
                if (!set.isEmpty() && set.contains(n)) {
                    return false;
                }
                set.add(n);
                n = calculate(n);
            }
            return true;
        }

        private int calculate(int n) {
            int res = 0;
            while (n != 0) {
                int temp = n % 10;
                res += temp * temp;
                n /= 10;
            }
            return res;
        }
    }
}
