#### 本周题目

1. [1 两数之和](https://leetcode-cn.com/problems/two-sum/)
2. [242 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)
3. [15. 三数之和](https://leetcode-cn.com/problems/3sum/)
4. [98. 验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/)
5. [235. 二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)



#### 时间复杂度与空间复杂度分析


##### 题目1 两数之和
一个for循环遍历入参数组时间复杂度为O(n), 然后在for循环中,有对HashMap进行插入和查找操作. 
不管插入还是查找，由key获取hash值然后定位到桶的时间复杂度都是O（1），那么真正决定时间复杂
度的实际上是桶里面链表/红黑树的情况如果桶里面没有元素，那么直接将元素插入/或者直接返回未查
找到，时间复杂度就是O（1），如果里面有元素，那么就沿着链表进行遍历，时间复杂度就是O（n），
链表越短时间复杂度越低，如果是红黑树的话那就是O（logn）所以平均复杂度很难说，只能说在最优的
情况下是O（1）

##### 题目242 有效的字母异位词
遍历字符串时间复杂度为 O(N)，然后在循环体内对hashMap进行插入和查找操作, 时间复杂度为O(1).
因此时间复杂度为O(N * 1)


##### 题目15. 三数之和
这里需要考虑去的问题。通过对数组进行排序,简化了去重的实现。


##### 题目98. 验证二叉搜索树
中序遍历的模板代码即可

##### 题目235. 二叉搜索树的最近公共祖先
代码中有注释

