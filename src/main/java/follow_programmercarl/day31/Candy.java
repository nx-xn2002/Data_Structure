package follow_programmercarl.day31;

/**
 * 135. 分发糖果
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/candy/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class Candy {
    static class Solution {
        public int candy(int[] ratings) {
            int len = ratings.length;
            int[] candyVec = new int[len];
            candyVec[0] = 1;
            for (int i = 1; i < len; i++) {
                candyVec[i] = (ratings[i] > ratings[i - 1]) ? candyVec[i - 1] + 1 : 1;
            }
            for (int i = len - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1]) {
                    candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);
                }
            }
            int ans = 0;
            for (int num : candyVec) {
                ans += num;
            }
            return ans;
        }
    }
}
