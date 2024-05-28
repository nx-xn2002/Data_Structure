package follow_programmercarl.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/3sum/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class ThreeSum {
    static class Solution {
        /**
         * 双指针
         */
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            for (int first = 0; first < n; ++first) {
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                int third = n - 1;
                int target = -nums[first];
                for (int second = first + 1; second < n; ++second) {
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        ans.add(List.of(nums[first], nums[second], nums[third]));
                    }
                }
            }
            return ans;
        }
    }
}
