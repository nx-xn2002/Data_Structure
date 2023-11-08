package follow_programmercarl.array.binary_search;

public class _34_Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) {
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        int begin = -1;
        boolean exist = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    exist = true;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        begin = left;
        if (!exist) {
            return new int[]{-1, -1};
        }
        right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{begin, right};
    }
}
