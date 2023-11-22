package follow_programmercarl.array.two_pointers;

/**
 * 283. 移动零
 *
 * @author nx
 */
public class _283_ {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (slow < nums.length) {
            if (fast >= nums.length) {
                nums[slow++] = 0;
            } else {
                if (nums[fast] != 0) {
                    nums[slow++] = nums[fast];
                }
                fast++;
            }
        }
    }
}
