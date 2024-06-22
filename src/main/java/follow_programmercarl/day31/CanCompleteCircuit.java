package follow_programmercarl.day31;

/**
 * 134. 加油站
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/gas-station/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class CanCompleteCircuit {
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int[] res = new int[gas.length];
            int start = 0;
            int curSum = 0, totalSum = 0;
            for (int i = 0; i < gas.length; i++) {
                curSum += (gas[i] - cost[i]);
                totalSum += (gas[i] - cost[i]);
                if (curSum < 0) {
                    start = i + 1;
                    curSum = 0;
                }
            }
            if (totalSum < 0) {
                return -1;
            }
            return start;
        }
    }
}
