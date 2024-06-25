package follow_programmercarl.day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 56. 合并区间
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/merge-intervals/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Merge {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }
            Arrays.sort(intervals, (a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });
            List<Integer> res = new ArrayList<>();
            int left = intervals[0][0];
            int right = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] > right) {
                    res.add(left);
                    res.add(right);
                    left = intervals[i][0];
                    right = intervals[i][1];
                } else {
                    right = Math.max(right, intervals[i][1]);
                }
            }
            res.add(left);
            res.add(right);
            int[][] resArray = new int[res.size() / 2][2];
            for (int i = 0; i < res.size(); i++) {
                resArray[i / 2][0] = res.get(i);
                i++;
                resArray[i / 2][1] = res.get(i);
            }
            return resArray;
        }
    }
}
