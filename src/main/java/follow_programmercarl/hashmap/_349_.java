package follow_programmercarl.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 349. 两个数组的交集
 */
public class _349_ {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int[] nums = new int[1001];
        for (int i : nums1) {
            nums[i]++;
        }
        for (int i : nums2) {
            if (nums[i] > 0) {
                nums[i] = 0;
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
