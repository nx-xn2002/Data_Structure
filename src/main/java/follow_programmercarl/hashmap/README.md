# 哈希表

## 有效的字母异位词

[242. 有效的字母异位词](https://leetcode.cn/problems/valid-anagram/)

直接使用哈希表，将字符串中的字符作为 key，出现的次数作为 value，遍历第二个字符串，如果 key 存在，则将 value

- 时间复杂度O(n)
- 空间复杂度O(n)

优化：

因为题目说明仅包含小写字母，直接使用长度为26的数组储存出现次数即可

- 时间复杂度O(n)
- 空间复杂度O(1)

## 两个数组的交集

[349. 两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/)

如第一题，直接使用数组储存nums1出现过的数字，然后遍历nums2，如果存在，则加入结果数组

- 时间复杂度O(m+n)
- 空间复杂度O(1)

## 快乐数

[202. 快乐数](https://leetcode.cn/problems/happy-number/)

题目给出了提示，中间和为0则为快乐数，否则，会出现无限循环的情况，因此，只需要使用一个hashset来储存每一次的结果即可

- 时间复杂度O(logn)
- 空间复杂度O(logn)

## 两数之和

力扣第一题，刷烂了，跳过

## 四数相加 II

[454. 四数相加 II](https://leetcode.cn/problems/4sum-ii/)

直接把数组分成两组分别n^2遍历，然后存入map中如同两数之和进行操作

- 时间复杂度O(n^2)
- 空间复杂度O(n^2)

## 赎金信

[383. 赎金信](https://leetcode.cn/problems/ransom-note/)

思路基本形同第一题，先把杂志字母保存，然后遍历赎金信内容，取出字母同时进行判断

- 时间复杂度O(m+n)
- 空间复杂度O(1)

## 三数之和

[15. 三数之和](https://leetcode.cn/problems/3sum/)

这题其实不适合使用哈希表，直接使用双指针，i确定第一个数，left=i+1确定第二个，right=len-1确定第三个数。然后while循环判断left<
right即可

- 时间复杂度O(n^2)
- 空间复杂度O(1)

## 四数之和

[18. 四数之和](https://leetcode.cn/problems/4sum/)

也是使用双指针法，注意去重

- 时间复杂度O(n^3)
- 空间复杂度O(1)


