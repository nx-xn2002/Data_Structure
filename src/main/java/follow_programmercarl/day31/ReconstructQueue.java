package follow_programmercarl.day31;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 406. 根据身高重建队列
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/queue-reconstruction-by-height/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ReconstructQueue {
    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            });
            LinkedList<int[]> res = new LinkedList<>();
            for (int[] p : people) {
                res.add(p[1], p);
            }
            return res.toArray(new int[people.length][]);
        }
    }
}
