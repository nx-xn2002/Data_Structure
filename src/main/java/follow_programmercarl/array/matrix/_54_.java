package follow_programmercarl.array.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 *
 * @author nx
 */
public class _54_ {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int offset = 1;
        int loops = Math.min(m, n) / 2;
        int i = 0, j = 0;
        while (offset <= loops) {
            while (j < n - offset) {
                res.add(matrix[i][j++]);
            }
            while (i < m - offset) {
                res.add(matrix[i++][j]);
            }
            while (j >= offset) {
                res.add(matrix[i][j--]);
            }
            while (i >= offset) {
                res.add(matrix[i--][j]);
            }
            i++;
            j++;
            offset++;
        }
        if (Math.min(m, n) % 2 != 0) {
            if (m >= n) {
                while (i <= m - offset) {
                    res.add(matrix[i++][j]);
                }
            } else {
                while (j <= n - offset) {
                    res.add(matrix[i][j++]);
                }
            }
        }
        return res;
    }
}
