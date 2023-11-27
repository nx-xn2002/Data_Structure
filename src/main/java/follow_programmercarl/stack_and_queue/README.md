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



