## 刷过的题目整理

### 链表

[206.反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) 
```
标准的模板代码,记住一个点就是每次只处理当前节点

最重要的一步是将当前的next指向前一个
但是next值会丢失，因此需要用临时变量存储next值
存储了next值后,将上一个节点的值 赋值给 next指针。因此需要保留上一个节点值
当前节点的指针已经处理好了。因此要切换到下一个节点了。 
此时当前节点成为了上一个节点。因为前面说的要保留上一个节点的值。因此
prev = cur 
cur = tmp
```
[24. 两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/submissions/)
[25. K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/submissions/)
```
这题是困难级别的。所用的知识点就是简单的链表反转.但是对编码的思路是否清晰要求较高。
第二次做同样废了差不多1个半小时！！！
```


### 快慢指针

[142. 环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) 
```
该题目最直观的做法是Hash表记录,但是空间复杂度为O(N).
双指针的空间复杂度为O(1),但是并不直观. 需要推理出对应的公式. 问题是在于如何说明相等的时候就是入口的地方

设 fast指针 走了 f步, slow指针走了 s步, 环形长度为b
相遇时 存在关系  f = 2s
同时 隐含关系是 快指针比慢指针多走了N圈. 因此f = s + nb
两式相减可得  2s- (s + nb) = 0 则 s = nb
假设 head到入口处长度为a , 入口到 相遇点为 c 则存在以下关系
s = a + c + xb  无论x是多少, 最终要  a+c+xb = nb。 因此 a+c必定是整数倍b.
假设这时候有一个指针从head出发,慢指针从c点以相同的步数出发.他们会在a点相遇.因为最后要一起走完c 来完成 nb的步数。

所以相遇点 就是入口点 a

```
