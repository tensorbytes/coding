
"""
给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。

计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返 -1 。

链接：https://leetcode-cn.com/problems/coin-change
"""

class Solution:
    def coinChange(self, coins: list, amount: int) -> int:

        # 这里的 dp初始化的时候 用了amount + 1 作为最大值因为 面额为1的金币数最多 = amount,
        # 如果该值没有被更新, 则说明没有 能够组合成 amount 的组合存在
        # 例如 金币集合为  3,5  amount = 7
        # 计算 7的时候  dp[7] = min(dp[7], dp[4] or dp[2]) 而这两个值 因为 更新前的判断 2-3 小于 0, 2-5小于0 dp[2]不会被更新
        # 因此dp[7] =  min(8,9)  为8 , 8 > 7 所以可以判断没有更新从而返回 -1
        dp = [ amount + 1 for i in range(amount+1)]
        dp[0] = 0
        for i in range(1,amount+1):
            for j in coins:
                if i - j >=0:
                    dp[i] = min(dp[i],dp[i-j] + 1)
        if dp[amount] > amount:
            return -1
        else:
            return dp[amount]
