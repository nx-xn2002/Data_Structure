package follow_programmercarl.array.binary_search;

public class _367_ {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 1, right = num;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num / mid > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left * left == num;
    }
}
