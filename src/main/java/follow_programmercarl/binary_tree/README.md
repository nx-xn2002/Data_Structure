# 二叉树

## 二叉树的遍历

### 递归法

[144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/description/)

注意前序遍历的递归顺序是**中-左-右**

[94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/description/)

注意前序遍历的递归顺序是**左-中-右**

[145. 二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/description/)

注意前序遍历的递归顺序是**左-右-中**

### 迭代法

#### 重点:递归其实就是使用栈来实现，所以我们可以自己使用栈来通过迭代模拟函数递归的过程

[144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/description/)

注意前序遍历的递归顺序是**中-左-右**

[94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/description/)

注意前序遍历的递归顺序是**左-中-右**

[145. 二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/description/)

注意前序遍历的递归顺序是**左-右-中**

## 层序遍历

**重点：使用队列实现广度优先遍历**

[102. 二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/description/)

[107. 二叉树的层序遍历 II](https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/description/)

[199. 二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/description/)

[637. 二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/description/)

[429. N 叉树的层序遍历](https://leetcode.cn/problems/n-ary-tree-level-order-traversal/description/)

[515. 在每个树行中找最大值](https://leetcode.cn/problems/find-largest-value-in-each-tree-row/)

[116. 填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/description/)

[104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/)

[111. 二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/description/)

## 翻转二叉树

[226. 翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/description/)

注意要显式地将左右节点翻转

## 对称二叉树

[101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree)

**要点：使用递归实现时，注意对称节点是什么**

## 二叉树的最大深度

[104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/)

可以使用先序遍历加回溯来求，但我更喜欢用层序遍历来求解

## 完全二叉树的节点个数

[222. 完全二叉树的节点个数](https://leetcode.cn/problems/count-complete-tree-nodes/description/)

可以按普通二叉树的层序遍历来做，也可以利用完全二叉树的性质，先统计深度，再进行计算


