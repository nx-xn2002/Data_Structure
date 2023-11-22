# 滑动窗口

[209.长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/)

## 方法一：暴力解法

两层for循环，一个for循环遍历数组元素 ，第二个for循环更新数组

- 时间复杂度：O(n^2)
- 空间复杂度：O(1)

## 方法二：滑动窗口

不断的调节子序列的起始位置和终止位置，从而得出我们要想的结果。

- 时间复杂度：O(n)
- 空间复杂度：O(1)

其它题目：

1.[904. 水果成篮](https://leetcode.cn/problems/fruit-into-baskets/)
2.[76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/)

