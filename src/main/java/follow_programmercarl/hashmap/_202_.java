package follow_programmercarl.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 */
public class _202_ {
    private int getSum(int n) {
        if (n < 10) {
            return n * n;
        }
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        int sum = getSum(n);
        while (sum != 1) {
            if (record.contains(sum)) {
                return false;
            }
            record.add(sum);
            sum = getSum(sum);
        }
        return true;
    }
}
