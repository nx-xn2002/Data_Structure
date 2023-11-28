# 栈和队列

## 用栈实现队列

[232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/)

两个栈，一个输入栈，一个输出栈。pop和peek操作需要注意，当输出栈为空时，需把输入栈全部导入到输出栈里

## 用队列实现栈

[225. 用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/)

类似思路，但这次是push不一样，push的时候先把数据存入辅助队列，栈队列再把所有的数据存入辅助队列，然后交换辅助队列和栈队列

## 有效的括号

[20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/)

用栈存右括号，当出现左括号时，pop并判断

- 时间复杂度O(n)
- 空间复杂度O(n)

## 删除字符串中的所有相邻重复项

[1047. 删除字符串中的所有相邻重复项](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/)

使用栈，当栈为空或者栈顶与当前不同，则入栈，否则，出栈。此处Java我选择使用StringBuilder来模拟栈，省去最后转换为字符串的操作

- 时间复杂度O(n)
- 空间复杂度O(1)

## 逆波兰表达式求值

[150. 逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/)

理解题意之后很好做，即当遍历到数字时，放入栈中，当遍历到符号时，从栈中取出两个元素，运算后，将结果放回栈中

- 时间复杂度O(n)
- 空间复杂度O(n)

## 滑动窗口最大值

[239. 滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/)

使用一个辅助单调队列实现

- 时间复杂度: O(n)
- 空间复杂度: O(k)



