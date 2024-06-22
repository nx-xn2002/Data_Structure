package follow_programmercarl.day31;

/**
 * 860. 柠檬水找零
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/lemonade-change/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class LemonadeChange {
    static class Solution {
        public boolean lemonadeChange(int[] bills) {
            int c5 = 0;
            int c10 = 0;
            for (int bill : bills) {
                if (bill == 5) {
                    c5++;
                } else if (bill == 10) {
                    if (c5 <= 0) {
                        return false;
                    }
                    c5--;
                    c10++;
                } else if (bill == 20) {
                    if (c10 >= 1) {
                        c10--;
                        if (c5 < 1) {
                            return false;
                        }
                        c5--;
                    } else {
                        if (c5 < 3) {
                            return false;
                        }
                        c5 -= 3;
                    }
                }
            }
            return true;
        }
    }
}
