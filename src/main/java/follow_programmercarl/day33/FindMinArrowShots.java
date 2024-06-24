package follow_programmercarl.day33;

import java.util.Arrays;

/**
 * 452. 用最少数量的箭引爆气球
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindMinArrowShots {
    static class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0) {
                return 0;
            }
            Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
            int res = 1;
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > points[i - 1][1]) {
                    res++;
                } else {
                    points[i][1] = Math.min(points[i][1], points[i - 1][1]);
                }
            }
            return res;
        }
    }
}
