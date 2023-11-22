package follow_programmercarl.array.sliding_window;

/**
 * 209. 长度最小的子数组
 *
 * @author nx
 */
public class _209_ {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int begin = 0, end = 0, sum = 0;
        while (end < nums.length) {
            sum += nums[end++];
            while (sum >= target) {
                min = Math.min(min, end - begin);
                sum -= nums[begin++];
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
