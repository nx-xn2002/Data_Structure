# 矩阵数组操作

[59. 螺旋矩阵 II](https://leetcode.cn/problems/spiral-matrix-ii/)

坚持循环不变量原则.可以发现这里的边界条件非常多，在一个循环中，如此多的边界条件，如果不按照固定规则来遍历，那就是一进循环深似海，从此offer是路人。
这里一圈下来，我们要画每四条边，这四条边怎么画，每画一条边都要坚持一致的左闭右开，或者左开右闭的原则，这样这一圈才能按照统一的规则画下来。

- 时间复杂度 O(n^2): 模拟遍历二维矩阵的时间
- 空间复杂度 O(1)

其它题目：

1. [54. 螺旋矩阵](https://leetcode.cn/problems/spiral-matrix/)
2. [LCR 146. 螺旋遍历二维数组](https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/)

