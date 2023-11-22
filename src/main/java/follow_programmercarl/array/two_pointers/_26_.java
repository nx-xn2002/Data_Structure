package follow_programmercarl.array.two_pointers;

/**
 * 26. 删除有序数组中的重复项
 *
 * @author nx
 */
public class _26_ {
    //    public int removeDuplicates(int[] nums) {
//        int len = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[len - 1]) {
//                nums[len++] = nums[i];
//            }
//        }
//        return len;
//    }
    public int removeDuplicates(int[] nums) {
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

}
