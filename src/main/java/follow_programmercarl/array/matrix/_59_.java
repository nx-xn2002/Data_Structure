package follow_programmercarl.array.matrix;

/**
 * [59. 螺旋矩阵 II]
 * <a href="https://leetcode.cn/problems/spiral-matrix-ii/">...</a>
 *
 * @author nx
 */
public class _59_ {
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
            res[i][j] = counter++;
        }
        return res;
    }
}
