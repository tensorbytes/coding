#### 本周题目

1. [101. 对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/submissions/)
1. [448. 找到所有数组中消失的数字](https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/)
1. [541. 反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)


#### 个人总结


##### 101. 对称二叉树
```
题目要求递归和非递归两种写法

递归写法,只要想清楚比较时候的顺序就很好写.
比较当前节点, 然后比较 左边树的左节点 与 右边树的右节点


非递归写法
自己写的那版很繁琐,代码不够简洁,思路也不够清晰。
不清晰的原因主要是 
1、特殊情况的判断 例如 root为空, 以及root的左右子节点为空的情况。
2、while循环体中的 判断, 先判断 两者为空 然后再判断其中一个为空


```


##### 448. 找到所有数组中消失的数字
```
枯燥的快慢指针模板, 要注意边界处理
```


##### 541. 反转字符串 II
```
思路是滑动窗口,然后对窗口内的K个进行反转.这题主要考的是编写代码思路是否清晰。
```
