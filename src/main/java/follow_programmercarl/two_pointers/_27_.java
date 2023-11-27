package follow_programmercarl.two_pointers;

/**
 * 27. 移除元素
 */
public class _27_ {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
