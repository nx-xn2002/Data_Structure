package follow_programmercarl.day33;

import java.util.Arrays;

/**
 * 435. 无重叠区间
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/non-overlapping-intervals/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class EraseOverlapIntervals {
    static class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length <= 1) {
                return 0;
            }
            Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
            int count = 1;
            int border = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] >= border) {
                    count++;
                    border = intervals[i][1];
                }
            }
            return intervals.length - count;
        }
    }
}
