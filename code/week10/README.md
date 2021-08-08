#### 本周题目

1. [338. 比特位计数](https://leetcode-cn.com/problems/counting-bits/)
2. [231. 2 的幂](https://leetcode-cn.com/problems/power-of-two/)




#### 个人总结

##### 338. 比特位计数
```
用的是week9中求位1的个数 题目其中一种解法的思路, i & (i-1) 是消去 最低位的1. 
对于i的bit位中1的个数等于  i&(i-1) 的bit位中1的个数 + 1.加上1是因为已经消去了最低位的1.
以i = 3为例子:
3的个数是 2的个数 + 1
3对应的 二进制是 011
2对应的 二进制是 010
3&2 = 2, 2的个数为1, 加上消去的1, 于是求出值为2.

 i&(i-1) 小于 i. 因为题目是要求出所有小于n的数, 从零开始求,所以当求i 的时候可以直接利用前面的结果.
因此时间复杂度为O(n)


另外的知识点 i & -i 是取最低位的1s

```

##### 231. 2 的幂
```
当一个数是2的幂数,其二进制表示中必定只有一个1, 运用 i & (i-1) ==0 以及 特殊值0 的情况即可
```
