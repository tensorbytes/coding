#### 本周题目

1. [14. 最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/)
2. [136. 只出现一次的数字](https://leetcode-cn.com/problems/single-number/)
3. [160. 相交链表](https://leetcode-cn.com/problems/number-of-islands/submissions/)
4. [35. 搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/)


#### 个人总结


##### 14. 最长公共前缀
```
字符串数组的处理, 纵向比较
```

##### 136. 只出现一次的数字
```
最简单的是hash表, 但是空间复杂度不满足要求. 如果数组是有序的, 只需要比较前后两个值,如果某个值前后都不一样则可以判断
该值为唯一一次出现的数字。
题目中明确写出 其余每个元素均出现两次。 因此可以使用异或操作 去抵消从而只剩下 唯一一次的数

```


##### 160. 相交链表
```
对于这种两个链表求相交点的 与 环形链表相似 用双指针遍历的方法, 求相遇时的值
```

##### 35. 搜索插入位置
```
模板记住!!!!!!

常见的两个问题：


1、循环退出条件是否需要等号？
left,right = 0,size-1
此处是闭区间 [left,right]
因此循环退出条件
while left <= right


2、mid的值与数组的奇数或者偶数是否有关系？

对于等值检索, 奇数或者偶数并没有关系.因为所有的数据都会进行判断 （指 mid左侧 或者右侧 都会在mid 比较的时候已经包含了）


题目需要注意返回的值是什么，该题就是当没有相等的值的时候，需要根据mid进行判断


```

