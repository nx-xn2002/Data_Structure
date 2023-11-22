package follow_programmercarl.array.two_pointers;

/**
 * 977. 有序数组的平方
 *
 * @author nx
 */
public class _977_ {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, p = nums.length - 1;
        int[] res = new int[nums.length];
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l >= r) {
                res[p--] = l;
                left++;
            } else {
                res[p--] = r;
                right--;
            }
        }
        return res;
    }
}
