# 双指针

[27. 移除元素](https://leetcode.cn/problems/remove-element/)

## 方法一：暴力解法

两层for循环，一个for循环遍历数组元素 ，第二个for循环更新数组

- 时间复杂度：O(n^2)
- 空间复杂度：O(1)

## 方法二：双指针法

双指针法（快慢指针法）： **通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。**

- 快指针：寻找新数组的元素 ，新数组就是不含有目标元素的数组
- 慢指针：指向更新 新数组下标的位置

**双指针法（快慢指针法）在数组和链表的操作中是非常常见的，很多考察数组、链表、字符串等操作的面试题，都使用双指针法。**

- 时间复杂度：O(n)
- 空间复杂度：O(1)

其它题目：

1. [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
2. [283. 移动零](https://leetcode.cn/problems/move-zeroes/)
3. [844. 比较含退格的字符串](https://leetcode.cn/problems/backspace-string-compare/)
4. [977. 有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/)

