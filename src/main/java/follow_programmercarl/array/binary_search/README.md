# 二分查找

## 前提：有序数组

## 重点： 边界条件

### 两种写法：

1. 定义 target 是在一个在左闭右闭的区间里，也就是[left, right]
    - while (left <= right) 要使用 <= ，因为left == right是有意义的，所以使用 <=
    - if (nums[middle] > target) right 要赋值为 middle - 1，因为当前这个nums[middle]一定不是target，那么接下来要查找的左区间结束下标位置就是
      middle - 1
2. 定义 target 是在一个在左闭右开的区间里，也就是[left, right)
    - while (left < right)，这里使用 < ,因为left == right在区间[left, right)是没有意义的
    - if (nums[middle] > target) right 更新为 middle，因为当前nums[middle]
      不等于target，去左区间继续寻找，而寻找区间是左闭右开区间，所以right更新为middle，即：下一个查询区间不会去比较nums[middle]

#### 例题：

1. [704.二分查找](https://leetcode.cn/problems/binary-search/)
2. [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/)
3. [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/)
4. [69. x 的平方根](https://leetcode.cn/problems/sqrtx/)
5. 
