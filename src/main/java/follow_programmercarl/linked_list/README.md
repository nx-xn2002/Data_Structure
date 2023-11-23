# 链表

## 移除链表元素

[203. 移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/)

可以设置一个虚拟的头结点node，操作完毕后，返回node.next

为了便于操作，使用快慢指针的方式，使用慢指针来标记待删除节点的上一个节点

- 空间复杂度O(1)
- 时间复杂度O(n)

## 反转链表

[206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/)

使用双指针pre和cur，遍历链表并依次进行反转

- 空间复杂度O(1)
- 时间复杂度O(n)

## 两两交换链表节点

[24. 两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/)

用了三个指针，node2，node3表示要交换的两个节点，node1表示node2的前一个节点

__思考：链表题只要敢于多设指针，且注意好null的边界条件即可__

- 空间复杂度O(1)
- 时间复杂度O(n)

## 删除链表的倒数第 N 个结点

[19. 删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)

采用快慢指针，快指针先行n步，以此当快指针遍历到null的位置时，慢指针恰好是需要被删除的节点。因此，在最初再添加一个指针记录慢指针的上一位置即可

需要定义虚拟头结点，以此避免删除第一个节点的情况时，出现错误

- 空间复杂度O(1)
- 时间复杂度O(n)

## 链表相交

[面试题 02.07. 链表相交](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/)

计算长度差值，然后判断是否相等

- 空间复杂度O(1)
- 时间复杂度O(n+m)

## 环形链表

[142. 环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/)

两步：

1. 判断是否有环
    1. 使用快慢指针，快指针每次两步，慢指针每次一步，环内相当于快指针每次追慢指针一步
    2. 快慢指针相遇，说明有环
2. 查找环起点
    1. 两个指针，一个从head开始遍历，一个从相遇点开始遍历，相遇点即为环起点

- 空间复杂度O(1)
- 时间复杂度O(n)



