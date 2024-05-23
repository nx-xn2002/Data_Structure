package follow_programmercarl.day2;

/**
 * 螺旋矩阵
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/spiral-matrix-ii/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class GenerateMatrix {
    static class Solution {
        public int[][] generateMatrix(int n) {
            int[][] res = new int[n][n];
            int counter = 1;
            int i = 0, j = 0;
            int round = 1;
            while (round <= n / 2) {
                while (j < n - round) {
                    res[i][j++] = counter++;
                }
                while (i < n - round) {
                    res[i++][j] = counter++;
                }
                while (j >= round) {
                    res[i][j--] = counter++;
                }
                while (i >= round) {
                    res[i--][j] = counter++;
                }
                i++;
                j++;
                round++;
            }
            if (n % 2 != 0 && counter == n * n) {
                res[i][j] = counter;
            }
            return res;
        }
    }
}
