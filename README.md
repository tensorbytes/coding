## 刷过的题目整理

### 栈、队列

[225. 用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/)  
[239. 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)  


### 树
[98. 验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/)
[235. 二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
[94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)
[102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)
[104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

```
搜索二叉树左子树的所有节点都要小于根节点，同理右子树必须大于根节点

层序遍历可以用bfs，dfs实现。
```
[208. 实现 Trie (前缀树)](https://leetcode-cn.com/problems/implement-trie-prefix-tree/)


### 堆

[703. 数据流中的第 K 大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/)


### 哈希表
[20. 有效的括号](https://leetcode-cn.com/problems/valid-parentheses/)
[1 两数之和](https://leetcode-cn.com/problems/two-sum/)
[15. 三数之和](https://leetcode-cn.com/problems/3sum/)
[242 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)


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

### 字符串

[3. 无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
[1544. 整理字符串](https://leetcode-cn.com/problems/make-the-string-great/)
[242 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)


### 二分查找
[50. Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)    二分法
[69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)   

```
二分查找模板
left , right
while (left <= right){
    mid = (left + right )/2
    if (xxxx ){
        return mid;
    }else if(xxxx){
        left = mid + 1;
    }else {
        right = mid -1 ;   
    }
}
二分查找注意的地方是  
1、left = 0 还是 1 , right = len 还是 len + 1 决定了 下面的while()中的条件是小于等于还是小于
其实就是要想清楚  left，right是闭区间还是开区间，因为 left right是边界，是有机会被访问到的。访问到可能会
有数组越界问题。

```

### 动态规划
[122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)

```
动态规划,
1、先看题目是不是求最佳\最多\最少.
2、是否能够用递归实现,每次的递归是否从N中选择一个选项执行
3、上来就假设状态 为 int[][] dp = new int[待迭代的数组程度，代表一次选择][选项的个数] 
4、找出递推公式
```
[70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)
[53. 最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)
[122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)
[52. N皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)
[322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/)
[300. 最长递增子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/)
```
很重要的的一个点就是，将最终节点看做是前一个节点的变化而来，例如 前一个节点的值  + 1.
以零钱兑换这个题目来说，前一个节点 有多个，前一个节点并不是按数组顺序的。
```


### 其他
[169. 多数元素](https://leetcode-cn.com/problems/majority-element/)   摩尔计数法
[120. 三角形最小路径和](https://leetcode-cn.com/problems/triangle/submissions/)
[53. 最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)





### 回溯 / 递归
[22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/)
[51. N 皇后](https://leetcode-cn.com/problems/n-queens/)
[212. 单词搜索 II](https://leetcode-cn.com/problems/word-search-ii/)
[52. N皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)


### 位运算
[36. 有效的数独](https://leetcode-cn.com/problems/valid-sudoku/)
[191. 位1的个数](https://leetcode-cn.com/problems/number-of-1-bits/)
[645. 错误的集合](https://leetcode-cn.com/problems/climbing-stairs/)
```
1、用bitmap来存储位置信息结合与或操作来判断数据是否重复出现

2、java的整形是有符号的,符号位0表示正数, 1为负数。
   对负数进行 >> 1 操作,高位补1.  >>> 1 高位补0.


```

