package follow_programmercarl.day1;

/**
 * 二分查找
 * 时间复杂度:O(logN),空间复杂度:O(1)
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/binary-search/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class BinarySearch {
    static class Solution {
        /**
         * 左闭右闭
         */
        public int search1(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                //避免溢出
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        }

        /**
         * 左闭右开
         */
        public int search2(int[] nums, int target) {
            int left = 0, right = nums.length;
            while (left < right) {
                //避免溢出
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        //4
        System.out.println(solution.search1(nums, 9));
        //-1
        System.out.println(solution.search1(nums, 2));
        //4
        System.out.println(solution.search2(nums, 9));
        //-1
        System.out.println(solution.search2(nums, 2));
    }
}
