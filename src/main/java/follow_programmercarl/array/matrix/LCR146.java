package follow_programmercarl.array.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 146. 螺旋遍历二维数组
 *
 * @author nx
 */
public class LCR146 {
    public int[] spiralArray(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int m = array.length, n = array[0].length;
        int[] res = new int[m * n];
        int offset = 1;
        int loops = Math.min(m, n) / 2;
        int i = 0, j = 0, count = 0;
        while (offset <= loops) {
            while (j < n - offset) {
                res[count++] = array[i][j++];
            }
            while (i < m - offset) {
                res[count++] = array[i++][j];
            }
            while (j >= offset) {
                res[count++] = array[i][j--];
            }
            while (i >= offset) {
                res[count++] = array[i--][j];
            }
            i++;
            j++;
            offset++;
        }
        if (Math.min(m, n) % 2 != 0) {
            if (m >= n) {
                while (i <= m - offset) {
                    res[count++] = array[i++][j];
                }
            } else {
                while (j <= n - offset) {
                    res[count++] = array[i][j++];
                }
            }
        }
        return res;
    }
}
