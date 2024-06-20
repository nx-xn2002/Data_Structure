package follow_programmercarl.day29;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/assign-cookies/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindContentChildren {
    static class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int res = 0;
            Arrays.sort(g);
            Arrays.sort(s);
            int sIndex = s.length - 1;
            for (int i = g.length - 1; i >= 0; i--) {
                if (sIndex < 0) {
                    return res;
                }
                if (s[sIndex] >= g[i]) {
                    res++;
                    sIndex--;
                }
            }
            return res;
        }
    }
}
